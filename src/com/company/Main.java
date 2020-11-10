package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sum = 0, number, counter = 0, average;
        String mark;

        System.out.print("Insert a mark: ");
        mark = scan.next();

        while (!mark.equals("end")) {
            number = Double.parseDouble(mark);
            counter++;
            sum += number;

            System.out.print("Insert a mark: ");
            mark = scan.next();
        }

        if (counter != 0) {
            average = sum / counter;
            System.out.println("The average is " + average);
        }
    }
}
