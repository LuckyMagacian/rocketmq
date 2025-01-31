package top.whiteyang.rocketmq.learn.test;

import org.apache.rocketmq.broker.BrokerController;
import org.apache.rocketmq.broker.BrokerStartup;
import org.apache.rocketmq.broker.out.BrokerOuterAPI;
import org.apache.rocketmq.broker.processor.SendMessageProcessor;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.impl.MQClientAPIImpl;
import org.apache.rocketmq.client.impl.MQClientManager;
import org.apache.rocketmq.client.impl.factory.MQClientInstance;
import org.apache.rocketmq.client.impl.producer.DefaultMQProducerImpl;
import org.apache.rocketmq.client.impl.producer.TopicPublishInfo;
import org.apache.rocketmq.client.latency.LatencyFaultTolerance;
import org.apache.rocketmq.client.latency.MQFaultStrategy;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.MixAll;
import org.apache.rocketmq.common.ThreadFactoryImpl;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageDecoder;
import org.apache.rocketmq.common.namesrv.NamesrvConfig;
import org.apache.rocketmq.common.protocol.route.BrokerData;
import org.apache.rocketmq.common.protocol.route.TopicRouteData;
import org.apache.rocketmq.namesrv.NamesrvController;
import org.apache.rocketmq.namesrv.NamesrvStartup;
import org.apache.rocketmq.namesrv.processor.DefaultRequestProcessor;
import org.apache.rocketmq.namesrv.routeinfo.RouteInfoManager;
import org.apache.rocketmq.remoting.netty.NettyDecoder;
import org.apache.rocketmq.remoting.netty.NettyRemotingClient;
import org.apache.rocketmq.remoting.netty.NettyRemotingServer;
import org.apache.rocketmq.remoting.netty.NettyServerConfig;
import org.apache.rocketmq.remoting.protocol.RemotingCommand;
import org.apache.rocketmq.store.*;
import org.apache.rocketmq.store.index.IndexFile;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Today the best performance as tomorrow newest starter!
 *
 * Created by IntelliJ IDEA.
 *
 * @author : whiteyang
 * @email: yangyuanjian@souche.com time: 2019-08-15 10:07
 */
public class MeetYou {
    int num;
    public void meet() throws Exception{
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
        //hold topicTable & brokerTable & brokerClusterTable & brokerAliveTable & filterServerTable | register broker & unregister broker
        RouteInfoManager routeInfoManager;

        /**-------------------------------------------------------------------------------broker-------------------------------------------------------------------------------------------------*/
        //broker's startup
        BrokerStartup brokerStartup;
        //broker core controller
        BrokerController brokerController;
        //in charge to register|unregister broker
        BrokerOuterAPI brokerOuterAPI;
        // default send message request processor
        SendMessageProcessor sendMessageProcessor;
        //hold ServerBootstrap , responsible to communicat with netty
        NettyRemotingServer nettyRemotingServer;
        //convert ByteBuf to RemotingCommand
        NettyDecoder nettyDecoder;

        /**    private inner class
         * deal all request by RequestProcessor
         * NettyRemotingServer.NettyServerHandler
         */
        /**-------------------------------------------------------------------------------common-------------------------------------------------------------------------------------------------*/
        //message
        Message message;
        //
        TopicPublishInfo topicPublishInfo;
        //
        TopicRouteData topicRouteData;
        //
        BrokerData brokerData;
        // command
        RemotingCommand remotingCommand;
        //encode Message -> byte[]  or decode byte[] -> Message
        MessageDecoder messageDecoder;

        AbstractQueuedSynchronizer abstractQueuedSynchronizer;
        ReentrantLock reentrantLock;
        /**-------------------------------------------------------------------------------client-------------------------------------------------------------------------------------------------*/
        //single , manage MQClientInstance
        MQClientManager mqClientManager;
        // hold MQClientApiImpl , responsible for update topic route & clean offline broker & send heart beat & persist consumer offset & adjust thread poll
        MQClientInstance mqClientInstance;
        //hold NettyBootstrap & NettyRemotingClient , responsible for remote communication
        MQClientAPIImpl mqClientAPIImpl;
        //rocketmq netty client , real netty channel write bytes
        NettyRemotingClient nettyRemotingClient;
        //latency fault tolerance
        LatencyFaultTolerance latencyFaultTolerance;
        /**---------------------------------------producer----------------------------------------*/
        DefaultMQProducer defaultMQProducer = null;
        //hold MQClientInstance , start MQClientInstance , register  Producer , send msg
        DefaultMQProducerImpl defaultMQProducerImpl;
        // fault avoid strategy
        MQFaultStrategy mqFaultStrategy;


        /**-------------------------------------------------------------------------------store-------------------------------------------------------------------------------------------------*/
        //deal delay message , flush disk , sync slave
        CommitLog commitLog;
        //map memory to filechannle or direct memory , write message byte[] to memory
        MappedFile mappedFile;
        //container of mappedFile, map directory of mapped file
        MappedFileQueue mappedFileQueue;
        /**
         * private inner class
         * CommitLog.FlushCommitLogService
         */

        //direct byte buffer pool, cache pool , avoid GC
        TransientStorePool transientStorePool;

        ConsumeQueue consumeQueue;

        IndexFile indexFile;
        //
        DefaultMessageStore defaultMessageStore;















        /**---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        defaultMQProducer.send(new Message());
        defaultMQProducer.sendOneway(new Message());

    }

    public class MeetTest{
        public void init() throws MQClientException {
            DefaultMQProducer producer=new DefaultMQProducer("666");
            producer.setNamesrvAddr("localhost:20998");
            producer.start();
        }
    }
}
