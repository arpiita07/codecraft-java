package corejava.stream.basic;

import java.time.LocalDate;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String department;
    private String designation;
    private double salary;
    private LocalDate joiningDate;
    private String city;
    private double rating;
    private boolean active;
    private List<String> skills;

    public Employee(int id, String name, int age, String gender, String department, String designation, double salary, LocalDate joiningDate, String city, double rating, boolean active, List<String> skills) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
        this.joiningDate = joiningDate;
        this.city = city;
        this.rating = rating;
        this.active = active;
        this.skills = skills;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public String getCity() {
        return city;
    }

    public double getRating() {
        return rating;
    }

    public boolean isActive() {
        return active;
    }
    public List<String> getSkills() {
        return skills;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", joiningDate=" + joiningDate +
                ", city='" + city + '\'' +
                ", rating=" + rating +
                ", active=" + active +
                ", skills=" + skills +
                '}';
    }




}
