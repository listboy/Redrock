import java.util.Random;
import java.util.Scanner;

public class couple {//对象( ﹡ˆoˆ﹡ )
    String name;
    int age;
    String sex;

    //水字数。
    public void tellinfo() {
        System.out.println("你好啊，我是你的对象[doge]。我的名字叫" + name + "我今天已经" + age + "岁啦！");
    }

    public void kill() {
        System.out.println("你的对象" + name + "已死亡，享年" + age + "岁。");
        System.exit(0);
    }

    public static void guessnum(String[] args) {
        System.out.println("猜数字游戏开始啦！");
        System.out.println("请猜1-100之间的数据：");
        Random ran = new Random();
        int ranNumber = ran.nextInt(100) + 1;
        Scanner in = new Scanner(System.in);
        while (true) {
            int number = in.nextInt();
            if (number > ranNumber) {
                System.out.println("太大了，继续！");
            } else if (number < ranNumber) {
                System.out.println("太小了，继续！");
            } else {
                System.out.println("恭喜你，猜对了！");
                System.out.println("游戏结束！");
                break;
            }
        }

    }


    public int Fact(int num) {//循环计算的阶乘

        int sum = 1;

        if (num < 0) {//判断传入数是否为负数

            throw new IllegalArgumentException("你输入的必须为正数");//抛出不合理参数异常

        }

        for (int i = 1; i <= num; i++) {//循环num

            sum *= i;//每循环一次进行乘法运算

        }

        return sum;//返回阶乘的值

    }
}
