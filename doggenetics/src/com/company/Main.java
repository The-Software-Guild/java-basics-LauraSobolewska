package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String name = "";
        Random randomNumber = new Random();
        int min = 0;
        int max = 0;
        int randomStBernard = randomNumber.nextInt((100 - 1) + 1);
        int randomChihuahua = randomNumber.nextInt((100 - randomStBernard) + 1);
        int randomPoodle = randomNumber.nextInt((100 - randomStBernard - randomChihuahua) + 1);
        int randomCommonCur = randomNumber.nextInt((100 - randomStBernard - randomChihuahua - randomPoodle) + 1);
        int kingDoberman = (100 - randomStBernard - randomChihuahua - randomPoodle - randomCommonCur);

        System.out.println("What is your dog's name?");
        name = scanner.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here.");
        {
            System.out.println(name + " is:");
            System.out.println(randomStBernard + "% St Bernard");
            System.out.println(randomChihuahua + "% Chihuahua");
            System.out.println(randomPoodle + "% poodle");
            System.out.println(randomCommonCur + "% common cur");
            System.out.println(kingDoberman + "% King Doberman");
            System.out.println("Wow, that's quite the dog!");
        }

    }
}
