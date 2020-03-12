package com.LickingHieghts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        modulusClock();


    }

    public static void modulusClock() {
        int number;
        Scanner keyboard;

        keyboard = new Scanner(System.in);
        System.out.println("Give me a hour");
        number = keyboard.nextInt();

        keyboard = new Scanner(System.in);
        System.out.println("Give me a minute");
        number = keyboard.nextInt();




    }
}