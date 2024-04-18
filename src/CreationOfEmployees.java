import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class CreationOfEmployees {

    private static CreationOfEmployees creationOfEmployees;
    private List<Person> persons;

    private CreationOfEmployees() {
        persons = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            int personAge = ThreadLocalRandom.current().nextInt(20, 70);
            double personSalary = ThreadLocalRandom.current().nextDouble(20_000, 150_000);
            persons.add(new Person("Person " + i, personAge, Math.floor(personSalary), new Department("Department " + 1 + i % 3)));
        }
    }

    public static CreationOfEmployees getInstance() {
        if (creationOfEmployees == null) {
            creationOfEmployees = new CreationOfEmployees();
            return creationOfEmployees;
        }
        return creationOfEmployees;
    }

    public List<Person> getPersons() {
        return this.persons;
    }
}


