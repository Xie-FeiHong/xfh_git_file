package week_2;

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.exit;

/**
 * 第二周作业，实现猜数字小游戏
 * Created by xfh on 2017/7/21.
 */
public class week_02 {
    public static void main(String[] args){
        JieMian f = new JieMian();
        f.zhuJieMian();
    }
}



/**产生一个随机数给用户猜
 * Created by xfh on 2017/7/21.
 */
class RandomShu {
    private int run(){
        int S = new Random().nextInt(20);
        return S;
    }
    public int getRandomShu(){
        int S = run();
        return S;
    }
}

/**
 * 排行榜，记录最小次数
 * Created by xfh on 2017/7/21.
 */
 class PaiHangBang {
    private int Min=20;
    public void setMin(int Min){
        if(Min<this.Min)
            this.Min = Min;
    }
    public void show(){
        System.out.println("\n\n----------------------");
        System.out.print("最佳记录为：");
        System.out.println(Min);
    }
}

/**记录用户输入的数字
 * Created by xfh on 2017/7/21.
 */
class InputShu {
    private int num=0;
    private int H;
    public int  getInputShu(){
        System.out.println("\n请输入你猜测的数据");
        Input();
        num++;
        return this.H;
    }
    private  void Input(){
        Scanner x = new Scanner(System.in);
        H = x.nextInt();
    }
    public int getNum(){
        return num;
    }
}

/**
 * 游戏界面
 * Created by xfh on 2017/7/21.
 */
class JieMian {
    PaiHangBang P = new PaiHangBang();
    public void zhuJieMian(){
        System.out.println("-------------------------------------------------");
        System.out.println("游戏说明：\n电脑会随机产生一个非负整数r，用户输入一个数h\n电脑会给出互大或小的提示，知道猜对为止");
        xuanXiangJieMian();
    }
    private void xuanXiangJieMian() {
        System.out.println("\n");
        System.out.println("输入选项后的字母就可以选择该选项");
        System.out.println("1、游戏开始(k)\t2、游戏退出(t)\t3、再来一次(z)\t4、查看最佳纪录(c)");
        System.out.println("你的选择：");
        Scanner o = new Scanner(System.in);
        String sc = o.next();
        char s = sc.charAt(0);
        switch (s) {
            case 'k':
                run();
                break;
            case 't':
                exit(0);
                break;
            case 'z':
                run();
                break;
            case 'c':chaKan();
                break;
            default:
                System.out.println("输入的字符不合法！");
                xuanXiangJieMian();
        }
    }
    private void run(){
        System.out.println("\n\n-------------------------------------------------");
        RandomShu R = new RandomShu();
        int r = R.getRandomShu();
        System.out.println("已生成一个0~20的随机数r（包括0和20）");
        InputShu I = new InputShu();
        int h = I.getInputShu();
        do {
            if(r==h){
                System.out.println("恭喜您猜对了！");
                P.setMin(I.getNum());
                xuanXiangJieMian();
            }else if(h>=0&&h<r){
                prin(1);
                h = I.getInputShu();
            }else if(h>r&&h<=20){
                prin(2);
                h = I.getInputShu();
            }else {
                System.out.println("您输入的数字不再范围内！");
                h = I.getInputShu();
            }
        }while(true);
    }
    private void prin(int m){
        if(m==1) System.out.println("您输入的数字小了");
        else System.out.println("您输入的数字大了");
    }
    private void chaKan(){
        P.show();
        xuanXiangJieMian();
    }
}