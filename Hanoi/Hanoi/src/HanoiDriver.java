public class HanoiDriver {
    public static void main(String[] args) {
        Hanoi.getInstance().move(5,'A','B','C');
    }
}

class Hanoi {

    private  Hanoi() {}

    //类加载的时候进行初始化
    private static Hanoi instance= new Hanoi();

    //饥渴方式创建Hanoi类
    public  static Hanoi getInstance() {
        return instance;
        }

    public void move(int n,char source,char station,char target) {
        if(n==1)
            show(n,source,target);
        else {
            move(n-1,source,target,station);
            show(n,source,target);
            move(n-1,station,source,target);
        }
    }
    private void show(int n,char source,char target) {
        System.out.println("#"+ n + ":" + source+ "->"+ target);
    }

}