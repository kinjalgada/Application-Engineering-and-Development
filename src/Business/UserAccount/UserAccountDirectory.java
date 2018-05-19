/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Customer.Customer;
import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory(){
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public UserAccount authenticateUser(String userName, String password){
        for(UserAccount ua : userAccountList){
            if(ua.getUserName().equals(userName) && ua.getPassword().equals(password)){
                return ua;
            }
        }
        return null;
    }
    
    public UserAccount createUserAccount(String userName, String password, Employee employee, Customer customer, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUserName(userName);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setCustomer(customer);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUserNameIsUnique(String userName){
        for(UserAccount ua: userAccountList){
            if(ua.getUserName().equals(userName)){
                return false;
            }
        }
        return true;
    }
}
