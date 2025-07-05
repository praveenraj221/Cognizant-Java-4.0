package com.example.employee;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class HibernateExample {

    private static SessionFactory factory;

    public static void main(String[] args) {
        try {
            factory = new Configuration().configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Employee.class)
                    .buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        HibernateExample example = new HibernateExample();
        Employee emp = new Employee("John Doe", "IT", 50000);
        Integer empId = example.addEmployee(emp);
        System.out.println("Employee added with ID: " + empId);

        factory.close();
    }

    public Integer addEmployee(Employee employee) {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer employeeID = null;

        try {
            tx = session.beginTransaction();
            employeeID = (Integer) session.save(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        return employeeID;
    }
}
