package java.com;


public class Employee<T> {

        int age;
        String Firstname;
        String Lastname;
        int salary;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastname(String latha) {
        return Lastname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getFirstname(String hema) {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }
}