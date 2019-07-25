package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.print("Text: ");
        String a = in.nextLine();
        System.out.println("You input: " + a);

        String b = a.replaceAll(" ", "");
        System.out.println("Your text in my task=" + b);
    }

}
