public class Factorial {

    private int tag=0;      //用于标记是否调用过calculate函数
    private long cache=0;
    private static Factorial instance;

    //惰性方法创建Factorial类
    public static Factorial getInstance() {
        if (instance == null) {
            instance = new Factorial();
        }
        return instance;
    }

    //计算给定整数n的阶乘并返回
    public void calculate(int n) {
            long t=1;
            for(int i=1;i<=n;i++) {
                t*=i;
                tag++;
            }
            cache=t;
    }

    //可以随时再次提取前一次计算的结果
    public long getFact() {
        if(tag==0) {
            return 0;
        }
        return cache;
    }

}

//调用Factorial类的实例方法计算5的阶乘
class FactDriver {
    public static void main(String[] args) {
        Factorial.getInstance().calculate(5);
        System.out.println("5!="+Factorial.getInstance().getFact());
    }
}