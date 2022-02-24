package Calci.com;

import java.util.Scanner;

public class Calculator {

        int x;
        int y;
        static int z = 0;
        char operator;
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the 1st : ");
            int x = sc.nextInt();
            System.out.println("Enter the 2nd :");
            int y = sc.nextInt();
            System.out.println("what operator");
            String operator = sc.next();
            //   System.out.println("select for tir fun");
            // String operator1 = sc.next();
            Add a = new Add();
            Sub s = new Sub();
            Multi m = new Multi();
            Divi d= new Divi();
            Tan t=new Tan();
            Cos c=new Cos();
            Cot c1=new Cot();
            Sin s1=new Sin();
            switch (operator)
            {
                case "+":
                    System.out.println("Addition = " + a.add(x ,y));
                    break;
                case "-":

                    System.out.println("Subraction = " + s.sub(x,y));
                    break;
                case "*":

                    System.out.println("Multi = " + m.mul(x , y));
                    break;
                case "/":

                    System.out.println("Division = " + d.div(x , y));
                    break;
                case "a" :
                    System.out.println("sin value ="+s1.sin(x));
                    break;
                case "b" :
                    System.out.println("tan value ="+t.tan(x));
                    break;
                case "c" :
                    System.out.println("cos value ="+c.cos(x));
                    break;
                case "d":
                    System.out.println("cot value ="+c1.cot(x));
                    break;
                default:
                    System.out.println("nothing is selected");
            }
        }
}
