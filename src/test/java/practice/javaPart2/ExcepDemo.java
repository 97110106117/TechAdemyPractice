package practice;

public class ExcepDemo {
    private String str ="a";
    private void add1() {
        try {
            add2();
        } catch (Exception e) {
            str +="b";
        } finally {
            str +="c";
        }
    }
    private void add2() throws Exception {
        try {
            str +="d";
        } finally {
            str +="e";
        }
    }
    public void show() {
        add1();
        System.out.println(str);
    }

    public static void main(String[] args) {
        new ExcepDemo().show();

    }
}
//o/p: adec