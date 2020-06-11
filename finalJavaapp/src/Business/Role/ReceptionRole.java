/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.NutritionDiningRoomEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.ReceptionOrganization;
import Business.UserAccount.UserAccount;
import UI.GourmetReception.CustomerServiceWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author PhythonNo1
 */
public class ReceptionRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new CustomerServiceWorkAreaJPanel(userProcessContainer, account, (ReceptionOrganization)organization, (NutritionDiningRoomEnterprise)enterprise);
    }
    
    
}
