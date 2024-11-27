package homework_nr_11.employee;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Employee {
    private String name;
    private String surname;
    private Integer age;
    private String department;

    public Employee(String name, String surname, Integer age, String department) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.department = department;
    }

    public void testEmployee(Employee e, Predicate<Employee> testMethod){
        if(testMethod.test(e)) System.out.println(surname + "\t" + name + "\t" + department);
    }
    public void testEmployee(Predicate<Employee> testMethod){
        testEmployee(this,testMethod);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Ronald", "Reagan", 19, "Software Engineering");
        Employee e2 = new Employee("Bill","Clinton", 23, "Deep Digging");
        Employee e3 = new Employee("Abraham", "Lincoln", 45, "Software Engineering");
        Employee e4 = new Employee("George", "Bush", 32, "Much Drinking");
        Employee e5 = new Employee("Albert", "Gore", 12, "Far Flying");
        Employee e6 = new Employee("Donald", "Trump", 78, "Twice Winning");
        Employee e7 = new Employee("Joseph", "Biden", 76, "Well Thinking");
        Employee e8 = new Employee("Kevin", "Mitnick", 16, "Software Engineering");
        Employee e9 = new Employee("Bill", "Gates", 25, "Software Engineering");
        Employee e0 = new Employee("Anonymous", "Hacker", 22, "Software Engineering");

        Employee[] employees = new Employee[]{e1,e2,e3,e4,e5,e6,e7,e8,e9,e0};

        Predicate<Employee> testSoftwareEngineering = e -> {
            return Objects.equals(e.getDepartment(), "Software Engineering");
        };
        Predicate<Employee> testOlderThanTwenty = e -> {return e.getAge() > 20;};
        Predicate<Employee> testNameStartsWithA = e -> {return e.getName().startsWith("A");};

        Consumer<Employee> output = e -> {
            System.out.println(e.getName() + "\t" + e.getSurname());
        };

        System.out.println("--testSoftwareEngineering--");
        for(int i = 0; i < employees.length; i++){
            if(testSoftwareEngineering.test(employees[i])) output.accept(employees[i]);
        }

        System.out.println("--testOlderThanTwenty--");
        for(int i = 0; i < employees.length; i++){
            if(testOlderThanTwenty.test(employees[i])) output.accept(employees[i]);
        }

        System.out.println("--testNameStartsWithA--");
        for(int i = 0; i < employees.length; i++){
            if(testNameStartsWithA.test(employees[i])) output.accept(employees[i]);
        }
    }
}
