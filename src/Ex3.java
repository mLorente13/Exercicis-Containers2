import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("John", 1990));
        persons.add(new Person("Mary", 1981));
        persons.add(new Person("Tom", 2000));
        persons.add(new Person("Elisabeth", 1999));
        Collections.sort(persons, new PersonBirthComparator());
        System.out.println(persons);
        Collections.sort(persons, new PersonNameComparator());
        System.out.println(persons);
    }
}

class Person {
    int birthYear;
    String name;

    Person(String name, int birthYear) {
        this.birthYear = birthYear;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s %d", name, birthYear);
    }
}

class PersonBirthComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.birthYear - p2.birthYear;
    }
}

class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.name.compareTo(p2.name);
    }
}
