package homework_nr_18;

import java.util.Optional;

public class Person {
    private String name;
    private Integer age;
    private Float grade;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Float getGrade() {
        return grade;
    }

    public Person(Person person){
        this.name = person.getName();
        this.age = person.getAge();
        this.grade = person.getGrade();
    }

    public Person(Optional<Person> person) throws WrongFormatException{
        if(person.isEmpty()) throw new WrongFormatException("There isn't any person in this file!");
        this.name = person.get().getName();
        this.age = person.get().getAge();
        this.grade = person.get().getGrade();
    }

    public Person(String name, Integer age, Float grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Person(String[] format) throws WrongFormatException {
        if(format.length != 3) throw new WrongFormatException("Number of arguments doesn't match.");
        this.name = format[0];
        try {
            this.age = Integer.valueOf(format[1]);
            this.grade = Float.valueOf(format[2]);
        } catch (NumberFormatException e){
            throw new WrongFormatException("Number format doesn't match.");
        }
    }
}
