package homework_nr_18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path ifile = Path.of("src/main/java/homework_nr_18/input.txt");
        List<String> records;

        {
            try {
                records = Files.readAllLines(ifile);
            } catch (IOException e) {
                System.out.println("Some IO exception occurred. Probably file doesn't exist.");
                return;
            }
        }

        List<Person> personList = new ArrayList<>();
        for(String record : records){
            try {
                personList.add(new Person(record.split(",")));
            } catch (WrongFormatException e) {
                System.out.println(e.getMessage());
                return;
            }
        }
        Person oldest;
        Person youngest;
        try {
            oldest = new Person(personList.stream().max(Comparator.comparingInt(Person::getAge)));
            youngest = new Person(personList.stream().min(Comparator.comparingInt(Person::getAge)));
        } catch (WrongFormatException e) {
            System.out.println(e.getMessage());
            return;
        }
        Float average = 0.0F;
        for(Person person : personList){
            average += person.getGrade();
        }
        average /= personList.toArray().length;

        System.out.println("The average grade is: " + average);
        System.out.println("The youngest person is: " + youngest.getName() + "(Age is: " + youngest.getAge() + ")");
        System.out.println("The oldest person is: " + oldest.getName() + "(Age is: " + oldest.getAge() + ")");

        Path ofile = Path.of("src/main/java/homework_nr_18/output.txt");
        try {
            Files.writeString(ofile,"The average grade is: " + average);
            Files.writeString(ofile,"\nThe youngest person is: " + youngest.getName() + "(Age is: " + youngest.getAge() + ")", StandardOpenOption.APPEND);
            Files.writeString(ofile,"\nThe oldest person is: " + oldest.getName() + "(Age is: " + oldest.getAge() + ")", StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Some IO exception occurred. Probably file doesn't exist.");
        }
    }

}
