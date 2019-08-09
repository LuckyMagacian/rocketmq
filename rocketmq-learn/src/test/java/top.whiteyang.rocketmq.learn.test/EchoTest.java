package top.whiteyang.rocketmq.learn.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
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
    public void test2(){

    }
}
