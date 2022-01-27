package practice.javaPart2;

import java.util.regex.Pattern;

public class RegexDemo1 {
    public static void main(String[] args) {
        String str = "";
        str = "10sau";
        System.out.println(Pattern.matches("^([1-3][0-2][xs0][30Aa][xsu][.,])$",str));
        str="30sau";
        System.out.println(Pattern.matches("^([1-3][0-2][xs0][30Aa][xsu][.,])$",str));

    }
}

// o/p false false
//but this is not ans