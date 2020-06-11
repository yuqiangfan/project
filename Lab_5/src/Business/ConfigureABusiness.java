/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Organization.AdminOrganization;
import Business.UserAccount.UserAccount;

/**
 *
 * @author stevefan
 */
public class ConfigureABusiness {
    
    public static Business configure(){
        // Three roles: LabAssistant, Doctor, Admin
        
        Business business = Business.getInstance();
        
        //create admin organization
        AdminOrganization adminOrganization = new AdminOrganization();
        
        // add created admin organization
        business.getOrganizationDirectory().getOrganizationList().add(adminOrganization);

        Employee employee = new Employee();
        employee.setName("Ben");
        
        //create a new account
        UserAccount account = new UserAccount();
        account.setUsername("lab");
        account.setPassword("lab");
        account.setRole("Lab Assistant");
        
        // assign the account to employee
        account.setEmployee(employee);
        
        // add the employee into admin organization
        adminOrganization.getEmployeeDirectory().getEmployeeList().add(employee);
        // add the account into admin organization
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account);
        
        
        
        Employee employee2 = new Employee();
        employee2.setName("Jackie");
        
        //create a new account
        UserAccount account2 = new UserAccount();
        account2.setUsername("doctor");
        account2.setPassword("doctor");
        account2.setRole("Doctor");
        
        // assign the account to employee
        account2.setEmployee(employee2);
        
        // add the employee into admin organization
        adminOrganization.getEmployeeDirectory().getEmployeeList().add(employee2);
        // add the account into admin organization
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account2);
        
        
        return business;
    }
    
}
