package com.company;

import java.util.Scanner;

//import static jdk.vm.ci.meta.JavaKind.Int;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringAge = "";
        int age = 0;
        int maxHeartRate = 0;
        double targetHRMin = 0.0;
        double targetHRMax = 0.0;

        System.out.println("What is your age?");
        try {
            stringAge = scanner.nextLine();
            age = Integer.parseInt(stringAge);
        }
        catch(NumberFormatException ex) {
            System.out.println("This is not a valid age");
        }
        if ((age >= 0) && (age <= 120)){
            maxHeartRate = (220 - age);
            targetHRMin = (.5 * maxHeartRate);
            targetHRMax = (.85 * maxHeartRate);
            System.out.println("Your maximum heart rate should be " + (maxHeartRate) + " beats per minute.");
            System.out.println("Your target HR zone is " + (targetHRMin) + " - " + (targetHRMax) + " beats per minute.");
        }
    }
}
