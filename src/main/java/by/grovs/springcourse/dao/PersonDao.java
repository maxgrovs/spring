package by.grovs.springcourse.dao;

import by.grovs.springcourse.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDao {

    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "pit"));
        people.add(new Person(++PEOPLE_COUNT, "fil"));
        people.add(new Person(++PEOPLE_COUNT, "sofa"));
        people.add(new Person(++PEOPLE_COUNT, "nika"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(final int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);

    }
}
