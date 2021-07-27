package org.meicode.helloworld.services;

import java.util.Scanner;

public class Inputs {
    public static int Int(String val) {
        System.out.println(val);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static String Str(String val) {
        System.out.println(val);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static double Double(String val) {
        System.out.println(val);
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
}
