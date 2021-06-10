public class Greeter {
    public static void greet(int cols) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<cols;i++)
            sb.append("*");
        System.out.println(sb.toString());
    }
    public static void greet(int cols,String words) {
        int margin = (cols - words.length()) / 2;
        StringBuilder sb=new StringBuilder();
        sb.append("*");
        for(int i=0;i<margin-1;i++)
            sb.append(" ");
        sb.append(words);
        for(int i=0;i<margin-1;i++) {
            sb.append(" ");
        }
        sb.append("*");
        System.out.println(sb.toString());
    }
    public static void main(String args[]) {
        String string1="Welcome to Java";
        String string2="Nanjing Forestry University";
        int len=string2.length();
        int cols=len+4;
        greet (cols);
        greet (cols," ");
        greet(cols,string1);
        greet (cols," ");
        greet(cols,string2);
        greet (cols," ");
        greet(cols);
    }
}