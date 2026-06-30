package designpattern.creational.builder;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String address;

    private Employee(EmployeeBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
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

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    // Builder class is INSIDE Employee
    public static class EmployeeBuilder {
        private int id;
        private String name;
        private int age;
        private String address;

        public EmployeeBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public EmployeeBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Employee build(){
            return new Employee(this);

        }
    }
}
