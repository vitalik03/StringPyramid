package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.print("Enter your String: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] splitStr = str.split(" ");
        boolean stop = true;
        while (stop == true) {
            stop = false;
            String temp = null;
            for (int i = 0; i < splitStr.length - 1; i++) {
                if (splitStr[i].length() > splitStr[i + 1].length()) {
                    stop = true;
                    temp = splitStr[i];
                    splitStr[i] = splitStr[i + 1];
                    splitStr[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < splitStr.length; i++) {
            System.out.println(splitStr[i]);
        }
    }
}
