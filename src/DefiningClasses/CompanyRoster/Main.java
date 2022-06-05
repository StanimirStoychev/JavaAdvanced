package DefiningClasses.CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Employee> employeeList = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] personInfo = scanner.nextLine().split("\\s+");
            String name = personInfo[0];
            double salary = Double.parseDouble(personInfo[1]);
            String position = personInfo[2];
            String department = personInfo[3];
            Employee employee = null;

            if (personInfo.length == 6) {
                String email = personInfo[4];
                int age = Integer.parseInt(personInfo[5]);
                employee = new Employee(name, salary, position, department, email, age);
            } else if (personInfo.length == 4) {
                employee = new Employee(name, salary, position, department);
            } else if (personInfo.length == 5) {
                if (personInfo[4].matches("\\d+")) {
                    int personAge = Integer.parseInt(personInfo[4]);
                    employee = new Employee(name, salary, position, department, personAge);
                } else {
                    String personEmail = personInfo[4];
                    employee = new Employee(name, salary, position, department, personEmail);
                }
            }
            boolean depExists = departmentList.stream().filter(dep -> dep.getName().equals(department)).count() >= 1;
            if (!depExists) {
                departmentList.add(new Department(department));
            }
            Department currentDepartment = departmentList.stream().filter(dep -> dep.getName().equals(department)).findFirst().get();
            currentDepartment.getEmployees().add(employee);
        }
        Department highestPaidDepartment = departmentList.stream()
                .max(Comparator.comparingDouble(department -> department.calculateAverageSalary())).get();
        System.out.printf("Highest Average Salary: %s%n", highestPaidDepartment.getName());

        highestPaidDepartment.getEmployees().stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(System.out::println);
    }
}
