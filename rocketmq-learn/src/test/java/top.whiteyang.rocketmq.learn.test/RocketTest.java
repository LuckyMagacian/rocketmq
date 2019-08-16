package top.whiteyang.rocketmq.learn.test;

import org.apache.rocketmq.namesrv.NamesrvStartup;
import org.junit.Test;

/**
 * Today the best performance as tomorrow newest starter!
 *
 * Created by IntelliJ IDEA.
 *
 * @author : whiteyang email: yangyuanjian@souche.com time: 2019-08-15 10:02
 */
public class RocketTest {
    @Test
    public void printNameSrvConfig(){
        NamesrvStartup.main(new String[]{"-p"});
    }

}
