package practice.javaPart2;

import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        String patternValue = "";
        System.out.println(Pattern.matches(patternValue,"Dr.Thomas"));
        System.out.println(Pattern.matches(patternValue,"Dr.Rogers"));
        System.out.println(Pattern.matches(patternValue,"Dr.Leona"));

    }
}
