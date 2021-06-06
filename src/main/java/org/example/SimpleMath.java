/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sebastian Steele
 */

package org.example;
import java.util.Scanner;

public class SimpleMath {
    public static void main(String[] args) {
        Scanner getfirstNum = new Scanner(System.in);
        Scanner getsecondNum = new Scanner(System.in);

        System.out.print("What is the first number? ");
        String first_num = getfirstNum.nextLine();

        System.out.print("What is the second number? ");
        String sec_num = getsecondNum.nextLine();

        Integer first_val = Integer.parseInt(first_num);
        Integer second_val = Integer.parseInt(sec_num);

        Integer add = first_val + second_val;
        Integer sub = first_val - second_val;
        Integer mult = first_val * second_val;
        Integer div = first_val / second_val;

        // this is literally so ugly. I don't like this at all.
        System.out.println(String.format("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d", first_val, second_val,add, first_val, second_val, sub, first_val, second_val, mult, first_val, second_val, div));

    }
}
