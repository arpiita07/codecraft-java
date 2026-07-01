package corejava.stream.basic;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employeesorting {
    public static void main(String[] args) {

        List<Employee> emp  = EmployeeData.getEmployees();
       // 1. Sort by salary asending
        List<Double> op = emp.stream().sorted(Comparator.comparing(Employee::getSalary)).map(Employee::getSalary).toList();
        System.out.println(op);
        // 2. sort by salary desending
        List<Double> op1 = emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).map(Employee::getSalary).toList();
        System.out.println(op1);
        //3. Sort by age
        emp.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);

        //4. Sort by name
        emp.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

        //5. Sort by department
        System.out.println(emp.stream().sorted(Comparator.comparing(Employee::getDepartment)).
                map(Employee::getDepartment).distinct().toList());
        //6. Sort by department, then salary (descending)
        List<Employee> output = emp.stream().sorted(Comparator.comparing(Employee::getDepartment)
                        .thenComparing(Comparator.comparing(Employee::getSalary).reversed()))
                //.forEach(System.out::println);
               .toList();
        System.out.println(output);

        //7. Sort by city, then name
        emp.stream().sorted(Comparator.comparing(Employee::getCity).thenComparing(Employee::getName)).forEach(System.out::println);
        //8. Top 3 highest salaries
        List<Double> highSal = emp.stream().sorted(Comparator.comparing(Employee::getSalary)).limit(3).map(Employee::getSalary).toList();
        System.out.println("highsal is "+highSal);
        //9. Second highest salary employee
        Double secondHighestSalary = emp.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.naturalOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(secondHighestSalary);
        //11. Sort employees by name alphabetically
      emp.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
        //12. Sort employees by length of name
        emp.stream()
                .sorted(Comparator.comparingInt(e -> e.getName().length()))
                .map(Employee::getName)
                .forEach(System.out::println);
        //13. Sort by multiple fields (complex real interview)
        //Given a list of Employee objects, sort the employees first by department (ascending), then by salary (descending),
        // and finally by name (ascending)

        emp.stream().sorted(Comparator.comparing(Employee::getDepartment).
                        thenComparing(Comparator.comparing(Employee::getSalary)).reversed()
                        .thenComparing(Employee::getName)).forEach(System.out::println);
        //14. Sort active employees only, then by salary
        //Given a list of employees, return only those employees whose salary is greater than ₹50,000, and sort them by salary in ascending order.
        emp.stream().filter(emp1 -> emp1.getSalary() >50000).sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

       // Given a list of employees where each employee has an active status, return only the active employees sorted by salary in descending order.
          emp.stream().filter(emp2 -> emp2.isActive()).sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);

        //15. Sort by custom condition (female first, then male)
        //Given a list of employees with a gender field ("Female" or "Male"), sort the employees so that all
        // female employees appear first,
        // followed by male employees. Within each gender, sort by name.
        System.out.println("----------------");
        emp.stream().sorted(Comparator.comparing(Employee::getGender).thenComparing(Employee::getName)).forEach(System.out::println);

        //16. Sort by salary but null-safe (if salary can be null)
        emp.stream().sorted(Comparator.comparing(Employee::getSalary, Comparator.nullsFirst(Comparator.naturalOrder())
              )).forEach(System.out::println);
        //17. Sort by rating (highest first)
        //Each employee has a performance rating (1.0–5.0). Sort all employees by rating in descending order. If two employees have the same rating, sort them by name.
        System.out.println("----------------");
        emp.stream()
                .sorted(
                         Comparator.comparing(Employee::getRating).reversed()
                        .thenComparing(Comparator.comparing(Employee::getName))
                ).forEach(System.out::println);


    }
}
