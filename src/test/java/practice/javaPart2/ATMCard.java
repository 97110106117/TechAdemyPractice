package practice.javaPart2;

import java.io.Serializable;

public class ATMCard implements Serializable {
    int cardNumber;
    String ownerName;
    long accountNumber;
    int pinNumber;
    //as pinNumber is highly secured one so it should not be in serializable
    //so declare with
    // 4 options are given
    // private, volatile,transient,static
}
