package week_03;

/**
 * 第三周作业，多态Dome
 * Created by xfh on 2017/7/29.
 */
public class Week_03_DuoTai {   //测试类
    public static void main(String[] args){
        CheRun r = new CheRun();
        r.run(new QiChe());
        System.out.println("-----------------");
        r.run(new ZiXingChe());
    }
}

abstract class Che {    //分类，车子
    public abstract  void pao();
}
class CheRun {      //工具类，直接调用该类让车子跑起来
    public void run(Che c){ //这里有体现多态，类型提升
        c.pao();
        if(c instanceof QiChe){
            QiChe q = (QiChe) c;
            q.qiYou();
        }
        else if(c instanceof ZiXingChe){
            ZiXingChe z = (ZiXingChe) c;
            z.renLi();
        }
    }
}

class QiChe extends Che {   //一个子类，汽车

    public void pao(){  //覆盖父类功能
        System.out.println("汽车用四个轮子跑");
    }
    public void qiYou(){
        System.out.println("汽车要用汽油");
    }
}

class ZiXingChe extends Che {   //另一个子类，自行车
    public void pao(){   //覆盖父类功能
        System.out.println("自行车用两个轮子跑");
    }
    public void renLi(){
        System.out.println("自行车需要人蹬");
    }
}