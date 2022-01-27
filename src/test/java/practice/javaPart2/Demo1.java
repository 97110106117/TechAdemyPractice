package practice.javaPart2;

public class Demo1 {
    public static void main(String[] args) {
        String str = "Hello";
        String stg = "Hello";
        String stk = new String("Hello");
        System.out.println(str == stg);   // true
        System.out.println(stg == stk);   // false
        System.out.println(stk == str);   // false

    }
}

// o/p : true
//false
//false

// str and stg store in SCP i.e str=stg="Hello" so true
// stk will store in stack memory so address location is diff so false