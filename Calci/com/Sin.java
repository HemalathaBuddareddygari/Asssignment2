package Calci.com;

import java.util.Scanner;

public class Sin {
    Scanner sc = new Scanner(System.in);
    public double sin(double x) {

        double sin = Math.toRadians(Math.sin(sc.nextDouble())) ;
        return sin;
    }
}

