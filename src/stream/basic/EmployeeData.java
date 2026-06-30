package stream.basic;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class EmployeeData {
    public static List<Employee> getEmployees() {

            return Arrays.asList(

                    new Employee(101, "Alice", 28, "Female", "IT", "Developer",
                            75000, LocalDate.of(2020, 5, 15),
                            "Bangalore", 4.5, true,
                            Arrays.asList("Java", "Spring", "SQL")),

                    new Employee(102, "Bob", 35, "Male", "HR", "Manager",
                            95000, LocalDate.of(2017, 3, 20),
                            "Hyderabad", 4.2, true,
                            Arrays.asList("Recruitment", "Leadership")),

                    new Employee(103, "Charlie", 30, "Male", "IT", "Developer",
                            80000, LocalDate.of(2019, 7, 10),
                            "Pune", 4.8, true,
                            Arrays.asList("Java", "Microservices", "AWS")),

                    new Employee(104, "David", 45, "Male", "Finance", "Manager",
                            120000, LocalDate.of(2014, 1, 5),
                            "Mumbai", 4.0, false,
                            Arrays.asList("Accounting", "Excel")),

                    new Employee(105, "Eva", 26, "Female", "IT", "QA",
                            65000, LocalDate.of(2022, 8, 12),
                            "Chennai", 4.7, true,
                            Arrays.asList("Selenium", "Java")),

                    new Employee(106, "Frank", 38, "Male", "Sales", "Executive",
                            70000, LocalDate.of(2018, 9, 18),
                            "Delhi", 3.9, true,
                            Arrays.asList("Negotiation", "CRM")),

                    new Employee(107, "Grace", 32, "Female", "IT", "Architect",
                            150000, LocalDate.of(2015, 4, 8),
                            "Bangalore", 4.9, true,
                            Arrays.asList("Java", "AWS", "System Design")),

                    new Employee(108, "Henry", 29, "Male", "Support", "Engineer",
                            55000, LocalDate.of(2021, 11, 25),
                            "Kolkata", 3.8, false,
                            Arrays.asList("Linux", "Networking")),

                    new Employee(109, "Ivy", 41, "Female", "Finance", "Analyst",
                            90000, LocalDate.of(2016, 6, 30),
                            "Mumbai", 4.1, true,
                            Arrays.asList("Excel", "Power BI")),

                    new Employee(110, "Jack", 24, "Male", "IT", "Intern",
                            30000, LocalDate.of(2024, 2, 1),
                            "Bangalore", 4.3, true,
                            Arrays.asList("Java", "Git")),

                    new Employee(111, "Kevin", 33, "Male", "Sales", "Manager",
                            110000, LocalDate.of(2018, 10, 11),
                            "Delhi", 4.6, true,
                            Arrays.asList("Leadership", "CRM")),

                    new Employee(112, "Lily", 27, "Female", "HR", "Executive",
                            60000, LocalDate.of(2023, 1, 20),
                            "Hyderabad", 4.4, true,
                            Arrays.asList("Communication", "Recruitment"))

            );
        }

}
