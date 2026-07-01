package corejava.stream.basic;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeFilter {
    static void main() {
        List<Employee> emp = EmployeeData.getEmployees();
        //1. Filter employees whose salary is greater than ₹50,000.
        emp.stream().filter(e1 ->e1.getSalary()>50000).forEach(System.out::println);
        //2. Filter employees whose age is greater than 30.
        emp.stream().filter(e1 ->e1.getAge()>30).forEach(System.out::println);
        // 3. Filter employees belonging to the "IT" department.
        emp.stream().filter(e1 ->e1.getDepartment().equalsIgnoreCase("IT")).forEach(System.out::println);
        // 4. Filter employees whose name starts with 'A'.
        emp.stream().filter(e1 ->e1.getName().startsWith("A")).forEach(System.out::println);
        //5. Filter employees whose name ends with 'n'.
        emp.stream().filter(e1 ->e1.getName().endsWith("n")).map(Employee::getName).forEach(System.out::println);
        //6. Filter employees whose salary lies between ₹40,000 and ₹80,000.
        emp.stream().filter(e1 ->e1.getSalary()>40000 && e1.getSalary() < 80000).forEach(System.out::println);
        //7. Find all female employees.
        emp.stream().filter(e1 ->e1.getGender().equalsIgnoreCase("Female")).forEach(System.out::println);
        // 8.Find employees with a rating greater than 4.
        emp.stream().filter(e1 ->e1.getRating()>4).forEach(System.out::println);
        // 9. Find employees having more than 5 years of experience.
        emp.stream().filter(e -> Period.between(e.getJoiningDate(), LocalDate.now()).getYears() > 5).forEach(System.out::println);
        //10. Get names of employees whose salary is greater than ₹60,000.
        List<String> op = emp.stream().filter(e1 -> e1.getSalary() > 60000).map(Employee::getName).collect(Collectors.toList());
        System.out.println(op);
        //11. Get email IDs of employees from the HR department.
        List<Integer> op1 = emp.stream().filter(e1 -> e1.getDepartment() == "HR").map(Employee::getId).toList();
        System.out.println(op1);
        // 12. Get salaries of employees older than 30.
        System.out.println("-----------------------------------");
        emp.stream().filter(e1 -> e1.getAge() >30).map(Employee::getSalary).forEach(System.out::println);
        //13. Convert names of employees with salary greater than ₹50,000 to uppercase.
        emp.stream().filter(e1-> e1.getSalary() >50000).map(e -> e.getName().toUpperCase()).forEach(System.out::println);
        //14. Filter employees whose salary is greater than ₹50,000 and sort them by salary.
        emp.stream().filter(e1-> e1.getSalary() >50000).sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
        //15. Filter employees from the IT department and sort them by name.
        emp.stream().filter(e1-> e1.getDepartment().equalsIgnoreCase("IT")).
                sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
        //16. Filter female employees and sort them by rating descending.
        emp.stream().filter(e1-> e1.getGender().equalsIgnoreCase("Female")).
                sorted(Comparator.comparing(Employee::getRating)).forEach(System.out::println);
        //17. Count employees whose salary is greater than ₹70,000.
        long c = emp.stream().filter(e1 -> e1.getSalary() > 70000).count();
        System.out.println("-------------------------------------------------");
        System.out.println(c);
         //18. Count employees in each department
        Map<String, Long> departmentCount = emp.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()
                ));

        departmentCount.forEach((dept, count) ->
                System.out.println(dept + " : " + count)
        );
        //19. Find the first employee whose salary is greater than ₹60,000.
        Optional<Employee> op2 = emp.stream().filter(e1 -> e1.getSalary() > 70000).findFirst();
        System.out.println(op2.get());
        //20. Find any employee from the HR department.
        Employee op3 =  emp.stream().filter(e1 -> e1.getDepartment().equalsIgnoreCase("HR")).findAny().get();
        System.out.println(op3);
        // filter+match , 21. Check if all employees have salary greater than ₹30,000.
        boolean allHaveSalaryGreaterThan30000 = emp.stream()
                .allMatch(e -> e.getSalary() > 30000);
        System.out.println(allHaveSalaryGreaterThan30000);
        //22. Check if any employee belongs to Finance
        boolean anyEmployeeBelongsToFinance = emp.stream().anyMatch(e -> e.getDepartment().equalsIgnoreCase("Finance"));
        System.out.println(anyEmployeeBelongsToFinance);
        //23.Check if no employee has a negative salary.
        boolean anyEmployeeNegetiveSalary = emp.stream().noneMatch(e -> e.getSalary()<0);
        System.out.println(anyEmployeeNegetiveSalary);
        //Filtering + Collect 24. Collect all employees with salary greater than ₹50,000 into a List.
        List<Employee> op4 = emp.stream().filter(e -> e.getSalary() > 50000).collect(Collectors.toList());
        System.out.println(op4);
        //25. Collect names of employees starting with 'S'
        List<String> names = emp.stream()
                .filter(e -> e.getName().startsWith("S"))
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println("--------------------------------------");
        System.out.println(names);
        //26.Collect departments of employees older than 35
        List<String> empDept = emp.stream().filter(e -> e.getAge() > 35).map(Employee::getDepartment).distinct()
                .collect(Collectors.toList());
        System.out.println(empDept);
        //Filtering + Distinct  27. Get distinct department names.
        List<String> empOp = emp.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
        System.out.println(empOp);
        //28. Get distinct salaries greater than ₹50,000.
        List<Employee> op5 = emp.stream().filter(e -> e.getSalary() > 50000).distinct().toList();
        System.out.println(op5);
        //29.  Find distinct employee names.
        


    }
}
