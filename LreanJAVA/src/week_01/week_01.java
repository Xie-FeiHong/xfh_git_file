package week_01;

import java.util.Random;

/**
 * Created by xfh on 2017/7/14.
 * 第一周作业代码
 */
public class week_01 {
    public static void main(String[] arge){
       System.out.println("test运算符：");
        YuanSuanFu();
        System.out.println("\ntest流程控制");
        int a=LiuCheng();//a表示随机数
        System.out.println("随机数a="+a);
    }
    public static int LiuCheng(){//test流程控制
        int a;
        int i=1;
        boolean p=false;
        do{                //测试do-while、if-else;
            a = new Random().nextInt(10);
            if(a==5){
                p=true;
            }else{
                i++;
            }
        }while(p==false);
        System.out.println("此次一共运行(do-while)了"+i+"次");
        switch(i){          //测试switch；
            case 1:
            case 2:
            case 3:System.out.println("此次运行次数比较少");break;
            case 4:
            case 5:
            case 6:System.out.println("此次运行次数不算多");break;
            default:System.out.println("此次运行次数比较多");
        }
        int j=0;
        System.out.println("以下为for循环结果");
        for(j=1;j<=i;j++){  //测试for、continue、break
            if(j%2==0){
                continue;
            }else if(j==12){
                break;
            }else{
                System.out.println("hello world!");
            }
        }
        int k=1;
        while(k<=4){    //测试while
            System.out.println("while循环结果"+k);
            k++;
        }
        return a;
    }
    public static void YuanSuanFu(){//test一些常见的运算符
        int a;
        int b=25,c=5;
        a=b+c;
        System.out.println("加法结果为"+a);//加法
        a=b-c;
        System.out.println("加法结果为"+a);//减法
        a=b*c;
        System.out.println("乘法结果为"+a);//乘法
        a=b/(c+2);
        System.out.println("除法结果为"+a);//除法
        a=b%c;
        System.out.println("取余结果为"+a);//取余
        a=b+b/c-c;
        System.out.println("混合运算结果为"+a);//混合运算
    }
}
