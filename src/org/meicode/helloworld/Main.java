package org.meicode.helloworld;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("შეიტანეთ პირველი რიცხვი");
       double a=myObj.nextDouble();
        System.out.println("შეიტანეთ მეორე რიცხვი");
        double b=myObj.nextDouble();
        String res= Double.toString(a+b);

        System.out.println("შედეგი ტოლია "+res);

    }

}










