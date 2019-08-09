package top.whiteyang.rocketmq.learn.test;

import java.util.Random;

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
 * time: 2019-08-07 16:05
 */
public class MainTest {
    public static void main(String[] args) throws InterruptedException {
        Random random=new Random();
        while(true){
            int start=random.nextInt();
            int stop=start<<10;
            System.err.println(start+stop);
            Thread.sleep(3000);
        }
    }

}
