package practice.javaPart2;

import java.util.ArrayList;

public class MyArrayList {
    final ArrayList<String> myList;
    {
        myList = new ArrayList<String>();
    }
    public MyArrayList() {

    }
    public void myMethod() {
        System.out.println(myList.isEmpty());
    }

    public static void main(String[] args) {
        new MyArrayList().myMethod();
    }
}


//o/p: true