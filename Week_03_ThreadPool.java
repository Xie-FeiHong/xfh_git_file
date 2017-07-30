package week_03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * 第三周作业，实现一个线程池
 * Created by xfh on 2017/7/30.
 */
public class Week_03_ThreadPool {
    public static void main(String[] args){
        MyTreadPoolTest t = new MyTreadPoolTest();
        t.yunXing();
    }
}
class MyTreadPoolTest {  //测试线程池类
    public void yunXing(){
        ExecutorService pool = Executors.newFixedThreadPool(2);
        for(int x=0;x<4;x++){
            pool.execute(new MyRunnable());
        }
    }
}
class MyRunnable implements Runnable    //定义线程要做的事情
{
    public void run(){
        synchronized (new Object()){
            int x= 100;
            while(x>0) {
                System.out.println(Thread.currentThread().getName()+"...."+x--);
            }
        }
    }
}

