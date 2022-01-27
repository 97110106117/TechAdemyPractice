package practice.javaPart2;

 class Parent {
     private int i;
     public int j;
}
class Child extends Parent {
     void display() {
        /* super.j = super.i + 1;
         System.out.println(super.i+" "+super.j);*/
     }
}
public class Inherit {
    public static void main(String[] args) {
        Child obj = new Child();
     //   obj.i =1;
        obj.j = 2;
        obj.display();
    }
}

// o/p : compilation error bcz private int i visibility is within class