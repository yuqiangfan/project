/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.OnlineStoreEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.AdvertisingOrganization;
import Business.UserAccount.UserAccount;
import UI.OnlineAdvertising.AdvertisingWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author PhythonNo1
 */
public class AdvertisingRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new AdvertisingWorkAreaJPanel(userProcessContainer, account, (AdvertisingOrganization)organization, (OnlineStoreEnterprise)enterprise);
    }
    
    
}
