 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise.EnterpriseType;
import static Business.Enterprise.Enterprise.EnterpriseType.NutritionDiningRoom;
import static Business.Enterprise.Enterprise.EnterpriseType.Supplier;
import static Business.Enterprise.Enterprise.EnterpriseType.OnlineStore;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author PhythonNo1
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    
    public enum Type{
        Admin("Admin Organization", NutritionDiningRoom), 
        Chef("Chef Organization", NutritionDiningRoom), 
        Dietician("Dietician Organization", NutritionDiningRoom),
        Reception("Reception Organization", NutritionDiningRoom),
        NutritionPurchase("Nutrition Purchase Organization", NutritionDiningRoom),
        SupplierPurchase("Supplier Purchase Organization", Supplier),
        Farmer("Farmer Organization", Supplier),
        OnlineStorePurchase("Online Store Purchase Organization", OnlineStore),
        Advertising("Advertising Organization", OnlineStore);
        
        
        private String value;
        private EnterpriseType enterpriseType;
        private Type(String value, EnterpriseType enterpriseType) {
            this.value = value;
            this.enterpriseType = enterpriseType;
        }
        public String getValue() {
            return value;
        }
        public EnterpriseType getEnterpriseType() {
            return enterpriseType;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }
//    public Type getType() {
//        return enterpriseType;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
