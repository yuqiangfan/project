/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SupplierEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.FarmerOrganization;
import Business.UserAccount.UserAccount;
import UI.SupplierPurchase.PurchaseWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author PhythonNo1
 */
public class FarmerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new PurchaseWorkAreaJPanel(userProcessContainer, account, (SupplierEnterprise)enterprise,(FarmerOrganization)organization, network);
    }
    
    
}
