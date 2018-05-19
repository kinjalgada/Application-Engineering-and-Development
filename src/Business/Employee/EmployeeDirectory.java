/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name, String phone, String email, String dob){
        Employee employee = new Employee();
        
        employee.setName(name);
        employee.setDob(dob);
        employee.setEmail(email);
        employee.setPhone(phone);
        
        employeeList.add(employee);
        
        return employee;
    }
    
    public void removeEmployee(Employee e){
        employeeList.remove(e);
    }
}