package be.intecbrussel.persons;

import java.util.ArrayDeque;
import java.util.Deque;

public class PersonList {


    Deque<Person> persons = new ArrayDeque<>();

    public void addPerson (Person person){
        if(person.getGender() == Gender.MAN){
            persons.offerFirst(person);
        }else if(person.getGender() == Gender.WOMAN){
            persons.offerLast(person);
        }else{
            System.out.println("Wrong");
        }
    }


    public void findCouples(){
        System.out.println("New couple:  ");
        System.out.println(persons.pollFirst());
        System.out.println(persons.pollLast());


    }

    @Override
    public String toString() {
        return  "Persons: " + persons;
    }
}
