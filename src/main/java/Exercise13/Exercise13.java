/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package Exercise13;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args){

        Scanner compound = new Scanner(System.in);

        System.out.print("Please enter the Principal: ");

        double Principal = compound.nextInt();

        System.out.print("Please enter the rate of interest: ");

        double raw_rate = compound.nextDouble();

        System.out.print("Please enter the number of years: ");

        double years = compound.nextInt();

        System.out.print("What is the number of times interest is compounded per year: ");

        double compoundedint = compound.nextInt();

        double rate = raw_rate / 100;

        double raw_comp_int = Principal * Math.pow((1 + (rate/compoundedint)),(compoundedint * years));

        double comp_int = Math.round(raw_comp_int * 100)/100.0;

        System.out.printf("$%.2f invested at %f%% for %.0f years compounded %f times per year is %f",Principal, raw_rate, years, compoundedint, comp_int);









    }
}
