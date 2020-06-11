/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author PhythonNo1
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        
        for (UserAccount ua : userAccountList)
//          {  System.out.println("username is :"+ua.getUsername()+" and pw is "+ua.getPassword()+" ");
       // { System.out.println("user name is :["+ua.getUsername()+"], and user password is :["+ua.getPassword()+"]");
        
        	if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
         for (UserAccount ua : userAccountList)
//          {  System.out.println("username is :"+ua.getUsername()+" and pw is "+ua.getPassword()+" ");
        { System.out.println("user name is :["+ua.getUsername()+"], and user password is :["+ua.getPassword()+"]");
        
        	}
//            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
//                return ua;
//            }
        return null;
    }
    public UserAccount showpw(){
        for (UserAccount ua : userAccountList)
//          {  System.out.println("username is :"+ua.getUsername()+" and pw is "+ua.getPassword()+" ");
        { System.out.println("user name is :["+ua.getUsername()+"], and user password is :["+ua.getPassword()+"]");
        
        	}
//            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
//                return ua;
//            }
        return null;
    }
    
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
