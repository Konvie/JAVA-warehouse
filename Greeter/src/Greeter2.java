public class Greeter2 {
    public static void greet(int cols) {
        System.out.println("*".repeat(Math.max(0, cols)));
    }
    public static void greet(int cols,String words) {
        int margin = (cols - words.length()) / 2;
        String sb = "*" + " ".repeat(Math.max(0, margin - 1)) +
                words + " ".repeat(Math.max(0, margin - 1)) + "*";
        System.out.println(sb);
    }
    public static void main(String[] args) {
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
