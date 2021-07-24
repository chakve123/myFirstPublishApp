package org.meicode.helloworld;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("შეიტანეთ პირველი შესაკრები");
       double a=myObj.nextDouble();
        System.out.println("შეიტანეთ მეორე შესაკრები");
        double b=myObj.nextDouble();
        String res= Double.toString(a+b);

        System.out.println("შედეგი უდრის "+res);

    }

}










