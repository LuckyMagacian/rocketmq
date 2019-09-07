package top.whiteyang.rocketmq.learn.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import org.apache.rocketmq.common.MixAll;
import org.apache.rocketmq.common.namesrv.NamesrvConfig;
import org.apache.rocketmq.namesrv.NamesrvStartup;
import org.apache.rocketmq.remoting.netty.NettyServerConfig;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * │＼＿＿╭╭╭╭╭＿＿／│
 * │　　　　　　　　　│
 * │　　　　　　　　　│
 * │　－　　　　　　－│
 * │≡　　　　ｏ　≡   │
 * │　　　　　　　　　│
 * ╰——┬Ｏ◤▽◥Ｏ┬———╯
 * ｜　　ｏ　　｜
 * ｜╭－－－－╮｜
 * <p>
 * Today the best performance as tomorrow newest starter!
 * <p>
 * Created by IntelliJ IDEA.
 *
 * @author : whiteyang
 * email: yangyuanjian@souche.com
 * time: 2019-08-06 16:45
 */
public class EchoTest {
    @Test
    public void collecitonsShuffle(){
        List<Integer> list = new ArrayList<>();
        Random random=new Random();
        for(int i=0;i<20;i++){
            list.add(random.nextInt(1000));
        }
        System.err.println(list);
        Collections.shuffle(list);
        System.err.println(list);
        Collections.sort(list);
        System.err.println(list);
        Collections.shuffle(list);
        System.err.println(list);
    }
    @Test
    public void echoPID(){
        System.err.println(ManagementFactory.getRuntimeMXBean().getName());
        System.err.println(ManagementFactory.getMemoryMXBean().getHeapMemoryUsage());
        System.err.println(ManagementFactory.getMemoryMXBean().getNonHeapMemoryUsage());
    }

    @Test
    public void test(){
        System.err.println(String.class.getName());
        System.err.println(String.class.getCanonicalName());
        System.err.println(Integer.class.getName());
        System.err.println(Integer.class.getCanonicalName());
        System.err.println(int.class.getCanonicalName());
        System.err.println(int.class.getName());
    }

    @Test
    public void test1(){
        Map<String,Object> args=new JSONObject();
        Map<String,Object> params=new JSONObject();
        args.put("params",params);
        List<Map<String,Object>> voucherInfoList=new ArrayList<>();
        Map<String,Object> voucherInfo=new JSONObject();
        voucherInfo.put("out_trans_no", UUID.randomUUID().toString());
        voucherInfo.put("voucher_time",System.currentTimeMillis()/1000);
        voucherInfo.put("voucher_status",1);
        voucherInfo.put("voucher_no", "123456");
        voucherInfoList.add(voucherInfo);
        args.put("api","pdd.voucher.virtual.card.verification");
        params.put("voucher_data_list",voucherInfoList);
        System.err.println(JSON.toJSON(args));
    }
    @Test
    public void test2() throws UnknownHostException {
        System.err.println(InetAddress.getLocalHost().getHostName());
    }
}
