package com.company;

public class Main {

    public static void main(String[] args) {
        float num = 10.5f;
        boolean b = true;
        char c = 'm';
        int i = 20194;
        byte b1 = 127;
        short s = 500 ;
        double d = 21.58;

        System.out.println("b = " +b);
        System.out.println("c = "+c);
        System.out.println("b1 = "+b1);

        System.out.printf("boolean b = %b\n",b);
        System.out.printf("float num = %.2f\n",num);
        System.out.printf("int i = %d\n",i);
        System.out.printf("double d = %.3f\n",d);
        System.out.printf("short num1 = %d\n",s);
        System.out.printf("char raf = %c\n",c);
        System.out.printf("byte num2 = %d",b1);
    }
}
