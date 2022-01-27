package practice;

import java.util.Scanner;

public class MyDivision {
    public static void main(String[] args) {
        try {
            Scanner scanne = new Scanner(System.in);
            System.out.println("enter n");
            int x =  Integer.parseInt(scanne.nextLine());
            System.out.println("Enter d");
            int y =  Integer.parseInt(scanne.nextLine());
            int z = x/y;
            System.out.println(z);
        } catch (Exception e) {
            System.out.println(" 0");
        } /*catch (NumberFormatException n) {
            System.out.println("");*/
        //}
    }
}
