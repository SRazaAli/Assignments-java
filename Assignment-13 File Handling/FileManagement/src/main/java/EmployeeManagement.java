
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;



public class EmployeeManagement {

    public static void main(String[] args) {
        // Initial employee data
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Muhammad Raza", "CS", "1234567890", "Manager", "50000", "Active"));
        employees.add(new Employee("Muskan Khan", "CS", "9876543210", "Assistant", "40000", "Active"));
        employees.add(new Employee("Ali", "IT", "5555555555", "Developer", "60000", "Active"));

        // Write employee data to a file
        writeToEmployeeFile("EmployeeData.txt", employees);

        // Display initial employee data
        System.out.println("Initial Employee Data:");
        readEmployeeFile("EmployeeData.txt");

        // Update records for the second and third employee
        employees.get(1).setSalary("45000"); // Update salary for Jane Smith
        employees.get(2).setStatus("Inactive"); // Update status for Alice Johnson

        // Write updated employee data to a new file
        writeToEmployeeFile("UpdatedEmployeeInfo.txt", employees);

        // Display updated employee data
        System.out.println("\nUpdated Employee Data:");
        readEmployeeFile("UpdatedEmployeeInfo.txt");
    }

    // Function to write employee data to a file
    public static void writeToEmployeeFile(String filename, List<Employee> employees) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (Employee employee : employees) {
                writer.println(employee.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Function to read employee data from a file
    public static void readEmployeeFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
