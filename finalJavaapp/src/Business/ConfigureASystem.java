/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.AdminRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.Organization.Organization;

/**
 *
 * @author PhythonNo1
 */
public class ConfigureASystem {
    public static EcoSystem configure(){
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
    
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");    
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        //test
        if (system.getNetworkList().isEmpty()) {
            Network network = system.createAndAddNetwork();
            network.setName("Boston");
            
            for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
                if(type.getValue().equals("Nutrition Dining Room")) {
                    Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise("Gourmet", type);
                    Employee employee2 = enterprise.getEmployeeDirectory().createEmployee("Gourmet Admin");
                    UserAccount account = enterprise.getUserAccountDirectory().createUserAccount("gadmin", "gadmin", employee2, new AdminRole());
                    
                }
                
                if(type.getValue().equals("Supplier")) {
                    Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise("Farm", type);
                    Employee employee2 = enterprise.getEmployeeDirectory().createEmployee("Farm Admin");
                    UserAccount account = enterprise.getUserAccountDirectory().createUserAccount("fadmin", "fadmin", employee2, new AdminRole());
                }
                
                if(type.getValue().equals("Online Store")) {
                    Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise("Promotion", type);
                    Employee employee2 = enterprise.getEmployeeDirectory().createEmployee("Advertising Admin");
                    UserAccount account = enterprise.getUserAccountDirectory().createUserAccount("adadmin", "adadmin", employee2, new AdminRole());
                }   
            }
            
        }
        
        return system;
    }
}
