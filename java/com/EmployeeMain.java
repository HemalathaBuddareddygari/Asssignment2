package java.com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static int main(String[] args) {
        Employee e = new Employee();
        e.setAge(21);
        e.setFirstname("hema");
        e.setLastname("latha");
        e.setSalary(50000);
        Employee e1 = new Employee();
        e1.setAge(22);
        e1.setFirstname("Alia");
        e1.setLastname("bhatt");
        e1.setSalary(70000);
        Employee e2 = new Employee();
        e2.setAge(25);
        e2.setFirstname("ranbir");
        e2.setLastname("kapoor");
        e2.setSalary(60000);

        Employee e4 = new Employee();
        e4.setAge(30);
        e4.setFirstname("nani");
        e4.setLastname("naturalstar");
        e4.setSalary(90000);

        ArrayList<Employee> employee_list = new ArrayList<Employee>();
        employee_list.add(e);
        employee_list.add(e1);
        employee_list.add(e2);
        employee_list.add(e4);
        System.out.println(employee_list);
     /* //  ArrayList<Employee> Ages = new ArrayList<Employee>();

        // Age.addAll(e.age,e1.age,e2.age,e4.age);
        public static int AverageAge(ArrayList<Employee> Ages) {
            int sum = 0;
            for (int i = 0; i < Ages.size(); i++) {
                sum = sum + Ages.get(i);
            }
            int Avg = sum / Ages.size();
            return Avg;
            avg=avg+a[i];

            System.out.println("average of  ("e4.setSalary(90000),+e2.setSalary(90000)+,+e.setSalary(90000);+","+e1.setSalary(90000);++")  is ="+ avg/n);
*/
        for (Employee employee : employee_list) {
            System.out.println(e.getAge());
            //for (int i = 0; i < Ages.size(); i++) {
            //  int sum = sum + Ages.get(i);
        }
        //  int Avg = sum / Ages.size();
        // return Avg;
        //}


        return 0;

   /* Optional<Employee> oldestEmployeeWrapper = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));

    Employee oldestEmployee = oldestEmployeeWrapper.get();


System.out.println("Age : "+oldestEmployee.getAge());
*/
       /* Map<String, Employee> topEmployees =
                employee_list.stream()
                        .collect(Collectors.toMap(
                                e3 -> e.age,
                                e3 -> e,
                                BinaryOperator.maxBy(Comparator.comparingInt(new ToIntFunction<Object>() {
                                    @Override
                                    public int applyAsInt(Object e) {

                                        //  return e.getClass();
                                        );
                                ))
                                        return 0                                 }
                                  }}}
                                  */

    }}