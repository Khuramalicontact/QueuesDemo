package be.intecbrussel.persons;

import java.util.ArrayDeque;
import java.util.Deque;

public class PersonApp {
    public static void main(String[] args) {

       PersonList personList = new PersonList();

        Person person1 = new Person(Gender.MAN,"Keess");
        Person person2 = new Person(Gender.WOMAN,"Sofie");
        Person person3 = new Person(Gender.MAN,"Jan");
        Person person4 = new Person(Gender.WOMAN,"Natasja");

        personList.addPerson(person1);
        personList.addPerson(person2);
        personList.addPerson(person3);
        personList.addPerson(person4);

        System.out.println(personList);

        System.out.println("\n");
        personList.findCouples();
        System.out.println("\n");
        personList.findCouples();





    }
}
