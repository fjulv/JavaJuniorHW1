import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CreationOfEmployees creationOfEmployees = CreationOfEmployees.getInstance();
        List<Person> persons = creationOfEmployees.getPersons();

        for (Person p : persons) {
            System.out.println(p);
        }

        System.out.println("--------------------------");

        System.out.println(Homework.countPersons(persons, 30, 80000));
        System.out.println("--------------------------");

        System.out.println(Homework.averageSalary(persons, "11"));
        System.out.println("--------------------------");

        Map<Department, List<Person>> departmentListMap = Homework.groupByDepartment(persons);
        for (Map.Entry<Department, List<Person>> entry : departmentListMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
        System.out.println("--------------------------");

        System.out.println(Homework.maxSalaryByDepartment(persons));
        System.out.println("--------------------------");


        System.out.println(Homework.groupPersonNamesByDepartment(persons));
        System.out.println("--------------------------");

        System.out.println(Homework.minSalaryPersons(persons));
    }
}


