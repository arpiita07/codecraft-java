package corejava.stream.basic;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Mostasked {
    static void main() {
        List<Employee> employees = EmployeeData.getEmployees();
      //  1. sort by dept
        //employees.stream().sorted(Comparator.comparing(Employee::getDepartment)).forEach(System.out::println);
        //  2. find the highest salary (suppose we don't have getter setter how to do
        Employee maxSalary = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).distinct()
                .findFirst().orElse(null);
        //System.out.println(maxSalary.getSalary());
        //  3. Find the Top 3 Highest Salaries from a List of Employees
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .forEach(System.out::println);

        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .map(Employee::getSalary)
                .limit(3)
                .forEach(System.out::println);
        //  4. print the name of all department
       employees.stream().map(Employee::getDepartment).forEach(System.out::println);
        //  5. how many males and females employee are there
        Map<String, Long> myMap = employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
    }
}
