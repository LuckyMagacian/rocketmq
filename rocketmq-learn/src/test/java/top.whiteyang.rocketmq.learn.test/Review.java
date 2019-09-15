package top.whiteyang.rocketmq.learn.test;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

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
 * email: yangyuanjian@outlook.com
 * time:2019-09-14 周六 13:31
 */
public class Review {
    @Test
    public void reverseLink(){
        Node first=new Node(0);
        first.next(new Node(1))
                .next(new Node(2))
                .next(new Node(3))
                .next(new Node(4))
                .next(new Node(5));

        Node oldHeader=first;
        Node newHeader=null;
        while(oldHeader!=null) {
            Node current = oldHeader;
            oldHeader = current.next;
            if(newHeader==null) {
                newHeader = current;
                current.next=null;
            }else{
                current.next=newHeader;
                newHeader=current;
            }
        }
        for(Node temp=newHeader;temp.next!=null;){
            System.err.println(temp.value);
            temp=temp.next;
        }
    }

    public void charSequence(){
        CharSequence charSequence;
        String string;
        StringBuffer buffer;
        StringBuilder builder;
    }
    @Test
    public void list(){
        LinkedList linkedList;
        ArrayList arrayList;
    }
    @Test
    public void map(){
        HashMap hashMap;
        Hashtable hashtable;
        LinkedHashMap<String,Integer> linkedHashMap;
        TreeMap treeMap;
        ConcurrentHashMap concurrentHashMap;

        linkedHashMap=new LinkedHashMap();
        linkedHashMap.put("aaa",1);
        linkedHashMap.put("bbb",2);
        linkedHashMap.put("ccc",3);
        System.err.println(linkedHashMap.entrySet());

    }
    class Node{
        Node pre;
        Node next;
        int value;

        public Node(int value) {
            this.value = value;
        }

        public Node next(Node next){
            this.next=next;
            return next;
        }

        public Node getNext(){
            return next;
        }
    }
}
