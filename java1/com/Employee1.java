package java1.com;

import jdk.jfr.internal.tool.Main;

import java.util.*;
import java.util.stream.Collectors;
class MaxMinWithCollectors<employeeList> {
         static List<Employee> employeeList
                = Arrays.asList(new Employee("hema", "latha", 21,50000.00),
                new Employee("sneha", "latha", 25,1000000.00),
                new Employee("reddy", "gari", 20,250000.00),
                new Employee("nani", "naturalstar", 30,4500000.00),
                new Employee("ranbir", "kapoor", 35,20000000.00));
        /* ArrayList<Employee> emp=new ArrayList<Employee>();
         emp.add(employeeList);
          */
      //   Main m=new Main();
          //     m.e(employeeList);
        //Scanner sc=new Scanner(System.in);
        //String lastname=sc.nextLine();
       // m.employeeList(employeeList);
   /* public void employeedetailsbyLastname(ArrayList<Employee> employeeList)
    {
        for(Employee f:employeeList)
        {
            if((f.lastname).equals(lastname))

            System.out.println();
    }*/

        public static void main(String[] args) {


            Optional<Employee> minAgeEmp =
                    employeeList.stream()
                            .collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
            System.out.println("Employee with min age:"
                    + (minAgeEmp.isPresent()? minAgeEmp.get():"Not Applicable"));
            Optional<Employee> maxAgeEmp =
                    employeeList.stream()
                            .collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
            System.out.println("Employee with max age:"
                    + (maxAgeEmp.isPresent()? maxAgeEmp.get():"Not Applicable"));
           /* Optional<Employee> AvgAgeEmp =
                    employeeList.stream()
                            .collect(Collectors.averagingInt(Comparator.comparing(Employee::getAge)));
            System.out.println("Employee with Avg age:"
                    + (AvgAgeEmp.isPresent()? AvgAgeEmp.get():"Not Applicable"));
                    */
            Double averageAge;
            averageAge = employeeList.stream().collect(Collectors.averagingInt(Employee -> Employee.getAge()));

            System.out.println( "Average age of an employee="+averageAge);

           // public void employeedetailsbyLastname(ArrayList<Employee> employeeList)
            {
                Scanner sc=new Scanner(System.in);
                String lastname=sc.nextLine();

                for(Employee f:employeeList)
                {
                    //if((f.Lastname).equals(lastname))

                     //   System.out.println("details of emp with last name=" +f.firstname" " +f.Lastname" " +f.age" " +f.salary);
                }

            }}
    }
