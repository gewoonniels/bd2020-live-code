package org.example.mocking.greeter;

public class PersonDao {

    public Person get(int id) {
        // ga de database en haal een person op...
        return new Person(id, "Janssens");
    }

}
