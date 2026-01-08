package service;

import model.Employee;
import util.FileUtil;
import java.util.*;
import java.io.*;

public class EmployeeService {

    private static final String FILE_PATH = "data/employees.txt";

    public void addEmployee(Employee emp) throws IOException {
        List<String> data = FileUtil.readFile(FILE_PATH);
        data.add(emp.toFileString());
        FileUtil.writeFile(FILE_PATH, data);
    }

    public List<Employee> getAllEmployees() throws IOException {
        List<String> data = FileUtil.readFile(FILE_PATH);
        List<Employee> employees = new ArrayList<>();

        for (String line : data) {
            String[] parts = line.split(",");
            employees.add(new Employee(
                    Integer.parseInt(parts[0]),
                    parts[1],
                    parts[2],
                    Double.parseDouble(parts[3])
            ));
        }
        return employees;
    }
}
