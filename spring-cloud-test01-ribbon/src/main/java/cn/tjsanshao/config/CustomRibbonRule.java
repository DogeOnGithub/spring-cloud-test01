package cn.tjsanshao.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

/*
 * @Project:test01
 * @Description:custom ribbon rule
 * @Author:TjSanshao
 * @Create:2018-12-07 10:02
 *
 **/
public class CustomRibbonRule extends AbstractLoadBalancerRule {

    private int total = 0;
    private int currentIndex;

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {
    }

    @Override
    public Server choose(Object o) {
        return this.choose(this.getLoadBalancer(), o);
    }

    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        } else {
            Server server = null;

            List<Server> upList = lb.getReachableServers();
            List<Server> allList = lb.getAllServers();

            int serverCount = allList.size();

            if (serverCount == 0) {
                return null;
            }

            if (total < 3) {
                total++;
                server = allList.get(currentIndex);

                if (server.isAlive()) {
                    return server;
                }
            } else {
                total = 0;
                currentIndex++;

                if (currentIndex >= serverCount) {
                    currentIndex = 0;
                }

                server = allList.get(currentIndex);

                if (server.isAlive()) {
                    return server;
                }
            }

            return null;
        }
    }
}
