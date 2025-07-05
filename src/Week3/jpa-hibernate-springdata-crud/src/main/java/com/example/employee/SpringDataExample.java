package com.example.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataExample implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDataExample.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Employee emp = new Employee("Jane Smith", "HR", 60000);
        employeeRepository.save(emp);
        System.out.println("Employee saved using Spring Data JPA: " + emp);
    }
}
