/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.NutritionDiningRoomEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DieticianOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.GourmetDietician.DieticianWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author PhythonNo1
 */
public class DieticianRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new DieticianWorkAreaJPanel(userProcessContainer, account, (DieticianOrganization)organization, (NutritionDiningRoomEnterprise)enterprise, network);
    }
    
    
}
