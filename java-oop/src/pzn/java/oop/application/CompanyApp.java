package pzn.java.oop.application;

import pzn.java.oop.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("American House");

        //System.out.println(company.getName());

        Company.Employee employee = company.new Employee();
        employee.setName("Ekko");
        System.out.println(employee.getCompany());
        System.out.println(employee.getName());

        Company company1 = new Company();
        company1.setName("Empty");

        Company.Employee employee1 = company1.new Employee();
        System.out.println(employee1.getCompany());
    }
}
