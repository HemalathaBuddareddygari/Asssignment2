package Calci.com;

import java.util.Scanner;

public class Cos {
    Scanner sc= new Scanner(System.in);
    public double cos(double x){

        double cos=Math.toRadians(Math.cos(sc.nextDouble()));
        return cos;
    }
}
