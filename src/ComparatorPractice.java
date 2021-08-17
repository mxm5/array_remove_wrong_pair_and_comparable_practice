import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorPractice {



    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>(
                List.of(
                        new Person("Priscilla", "Wagner"),
                        new Person("Tom", "Parker"),
                        new Person("the", "result"),
                        new Person("Elvis", "Presley"),
                        new Person("Priscilla", "Wagner"),
                        new Person("Tom", "Parker")
                )
        );



        System.out.println("========================================");
        System.out.println("before sorting");
        System.out.println();
        for (Person person : people)
            System.out.printf(
                    "\t\t%-15s %-15s \n",person.getFirstName() , person.getLastName()
            );
        System.out.println("========================================");
        System.out.println("after sorting");
        System.out.println();
        Collections.sort(people);
        for (Person person : people)
            System.out.printf(
                    "\t\t%-15s %-15s \n",person.getFirstName() , person.getLastName()
            );
        System.out.println("========================================");

    }
}
