/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Policy;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Kinjal
 */
public class ProductCatalog {
    
    private List<Product> productCatalog;

    public ProductCatalog() {
    productCatalog = new ArrayList<Product>();
    }
    
    public List<Product> getProductCatalog(){
        return productCatalog;
    }
    
    
    public Product addProduct(String policyName, String description, String vehicleClass, String driverInsured, String policyMaxCover, String duration, String planBenefit, int policyPrice){
        Product p = new Product();
        p.setPolicyName(policyName);
        p.setDescription(description);
        p.setVehicleClass(vehicleClass);
        p.setDriverInsured(driverInsured);
        p.setPolicyMaxCover(policyMaxCover);
        p.setDuration(duration);
        p.setPlanBenefit(planBenefit);
        p.setPolicyPrice(policyPrice);
        productCatalog.add(p);
        return p;
    }
    
    public void removeProduct(Product p){
        productCatalog.remove(p);
    }
    
    public Product searchProduct(int id){
        for (Product product : productCatalog) {
            if(product.getPolicyNumber()==id){
                return product;
            }
        }
        return null;
    }
}
