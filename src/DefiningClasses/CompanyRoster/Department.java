package DefiningClasses.CompanyRoster;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Department {
    private String name;
    private List<Employee> employees;

    public double calculateAverageSalary() {
    return employees.stream().mapToDouble(Employee::getSalary).average().orElse(0);
    }

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
