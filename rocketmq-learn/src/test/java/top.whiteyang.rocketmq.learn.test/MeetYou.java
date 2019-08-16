package top.whiteyang.rocketmq.learn.test;

import org.apache.rocketmq.broker.BrokerController;
import org.apache.rocketmq.broker.out.BrokerOuterAPI;
import org.apache.rocketmq.common.MixAll;
import org.apache.rocketmq.common.ThreadFactoryImpl;
import org.apache.rocketmq.common.namesrv.NamesrvConfig;
import org.apache.rocketmq.namesrv.NamesrvController;
import org.apache.rocketmq.namesrv.NamesrvStartup;
import org.apache.rocketmq.namesrv.processor.DefaultRequestProcessor;
import org.apache.rocketmq.remoting.netty.NettyServerConfig;

/**
 * Today the best performance as tomorrow newest starter!
 *
 * Created by IntelliJ IDEA.
 *
 * @author : whiteyang email: yangyuanjian@souche.com time: 2019-08-15 10:07
 */
public class MeetYou {
    int num;
    public void meet(){
        /**--------------------------------------------------------------------------------srv------------------------------------------------------------------------------------------------*/
        //boot class
        NamesrvStartup namesrvStartup;
        //namesrv config
        NamesrvConfig namesrvConfig;
        //namesrv netty config , port & pool and so on ......
        NettyServerConfig nettyServerConfig;
        //namesrv core controller,init rmoteserver & load kvConfig and so on ..
        NamesrvController namesrvController;
        //rocket threa factory , just define thread's name & new Thread()
        ThreadFactoryImpl threadFactory;
        //deal all remote request
        DefaultRequestProcessor defaultRequestProcessor;
        //const string collection
        MixAll mixAll;
        /**-------------------------------------------------------------------------------broker-------------------------------------------------------------------------------------------------*/
        //broker core controller
        BrokerController brokerController;
        //in charge to register|unregister broker
        BrokerOuterAPI brokerOuterAPI;
    }

    public class MeetTest{
        public void init(){
            MeetYou.this.num=0;
        }
    }
}
