import java.util.Scanner;

public class Converter {
    //默认构造器
    public Converter()
    {

    }

    //访问器，获得value的值
    public int getValue()
    {
        return value;
    }
    //从键盘获取value值
    public  Converter(int value) {
        this.value=value;       //将键盘获取的value值赋给定义的value
    }

    private int value=0;
    private int base=0;

    public String toBase(int base) {
        this.base=base;         //将键盘获取的base值赋给定义的base
        String str=new String();
        int cache=getValue();       //用cache暂存value的值，防止对后面结果造成影响
        if(cache/base!=0) {         //选择语句确认是否需要进行进制转换
            while(cache/base!=0) {      //判断语句，是否需要继续转换
                str = (cache % base) + str; //根据进制换算法，将结果连接在字符串前面
                cache=cache/base;   //cache值变化，以输出下次值
            }
        }
        else {
            str = cache+"";         //在int型变量后面加入字符串空格，快速转换为String类型
        }
        char[] array;               //为了更加直观，此过程也可以省去
        array=str.toCharArray();    //利用toCharArray将字符串转换为数组
        System.out.print("base="+base+","+value+"=>");
        for(int i=0;i<str.length();i++) {
            System.out.print(array[i]); //为了更直观，还可以不创建array直接用toCharArray(i)进行输出
            if(i==str.length()-1) {
                break;             //为了防止多输出一个_，故在输出最后一位之前跳出循环
            }
            System.out.print("_");  //输出_符合输出格式
        }
        System.out.println();
        return str;                 //String类型函数返回值
    }

    public String toBin() {
        String str=new String();
        int cache=getValue();           //用cache暂存value的值，防止对后面结果造成影响
        if(cache/2!=0) {
            while(cache/2!=0) {
                str = (cache % 2) +  str;
                cache=cache/2;
            }
        }
        else {
            str = cache+"";
        }
        char[] array;
        array=str.toCharArray();
        System.out.print("base=" + "2" + ","+ value+ "=>");
        for(int i=0;i<str.length();i++) {
            System.out.print(array[i]);
            if(i==str.length()-1) {
                break;
            }
            System.out.print("_");
        }
        System.out.println();
        return str;
    }

    public String toOct() {
        String str=new String();
        int cache=getValue();           //用cache暂存value的值，防止对后面结果造成影响
        if(cache/8!=0) {
            while(cache/8!=0) {
                str = (cache % 8) +  str;
                cache=cache/2;
            }
        }
        else {
            str = cache+"";
        }
        char[] array;
        array=str.toCharArray();
        System.out.print("base=" + "8" +"," + value + "=>");
        for(int i=0;i<str.length();i++) {
            System.out.print(array[i]);
            if(i==str.length()-1) {
                break;
            }
            System.out.print("_");
        }
        System.out.println();
        return str;
    }

    public String toHex() {
        String str = Integer.toHexString(value);
        /*  cache=getValue();
            if (cache / 16 != 0) {
            while (cache / 16 != 0) {
                str = (cache % 16) + str;
                cache=cache/2;
            }
        } else {
            str = value+"";
        }*/
        char array[];
        array=str.toCharArray();
        System.out.print("base=" + "16" + "," + value + "=>");
        for(int i=0;i<str.length();i++) {
            System.out.print(array[i]);
            if(i==str.length()-1) {
                break;
            }
            System.out.print("_");
        }
        System.out.println();
        return str;

    }
}

class ConverterDriver {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("请输入你要转换的值：");
        int value= scanner.nextInt();
        System.out.print("请输入你要转换的进制：");
        int base= scanner.nextInt();

        Converter a=new Converter(value);
        a.toBin();
        a.toOct();
        a.toHex();
        a.toBase(base);
    }
}