package designpattern.creational.builder;

public class Client {
    public static void main(String[] args) {
        Employee emp =  new Employee.EmployeeBuilder()
                .setId(1)
                .setName("John")
                .setAge(25)
                .setAddress("Bangalore")
                .build();
    }
}
