package practice.javaPart2;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int arr[] = {8,3,5,6,1,7,9,4};
        Arrays.sort(arr);
        Arrays.fill(arr,2,5,2);
        for(int x : arr) {
            System.out.print(x);
        }
    }
}


//o/p :- 13222789