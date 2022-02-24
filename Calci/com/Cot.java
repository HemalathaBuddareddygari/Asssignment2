package Calci.com;

import java.util.Scanner;

public class Cot {
    Scanner sc= new Scanner(System.in);
    public double cot(double x){

        double cot=Math.toRadians(Math.cos(sc.nextDouble()))/Math.cos(sc.nextDouble());
        return cot;
    }

}
