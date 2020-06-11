/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.net.ssl.ManagerFactoryParameters;
import javax.swing.JPanel;

/**
 *
 * @author PhythonNo1
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Chef("Chef"),
        Dietician("Dietician"),
        Reception("Reception"),
        NutritionPurchaseman("Purchaseman"),
        Farmer("Farmer"),
        SupplierPurchaseman("Purchaseman"),
        Advertising("Advertising"),
        OnlineStorePurchaseman("Purchaseman");

        private RoleType() {
        }
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise,
            Network network,
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}