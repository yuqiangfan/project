/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;
import Business.Organization.Organization;

/**
 *
 * @author PhythonNo1
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
//    public ArrayList<Organization> getChef() {
//        for (Organization org : getOrganizationList()){
//            if (org.getSupportedRole().equals(Type.Chef.getValue()) )
//            return Chef;
//        }
//        return organizationList;
//    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Dietician.getValue())){
            organization = new DieticianOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Chef.getValue())){
            organization = new ChefOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Reception.getValue())){
            organization = new ReceptionOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.NutritionPurchase.getValue())){
            organization = new NutritionPurchaseOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.SupplierPurchase.getValue())){
            organization = new SupplierPurchaseOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Farmer.getValue())){
            organization = new FarmerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Advertising.getValue())){
            organization = new AdvertisingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.OnlineStorePurchase.getValue())){
            organization = new OnlineStorePurchaseOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}