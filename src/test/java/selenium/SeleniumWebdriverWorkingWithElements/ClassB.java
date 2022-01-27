package selenium.SeleniumWebdriverWorkingWithElements;

public class ClassB extends ClassA{


    //complier created constructor and call super constr
    /*
    ClassB() {
      //super()
     }
        * */

    void m1() {
        System.out.println("In child class :: m1 method");
    }

    void m2() {
        //super.m1();
        m1();
        System.out.println("In child class :: m2 method");
    }

    public static void main(String[] args) {
        ClassB obj = new ClassB();
        obj.m2();
    }
}
/*
Note :  There is no constructor created by clasB by
    by deault ClasB created its own constructor and called clasA


    with super.m1()

In Parent class
In Parent class :: m1 method
In child class :: m1 method
In child class :: m2 method


    without super.m1()

In Parent class
In child class :: m1 method
In child class :: m2 method


* */