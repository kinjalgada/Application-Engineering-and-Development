/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Policy;

/**
 *
 * @author Kinjal
 */

public class Product {
    
    private String policyName;
    private String description;
    private String vehicleClass;
    private String driverInsured;
    private String policyMaxCover;
    private String duration;
    private String planBenefit;
    private int policyPrice;
    private int policyNumber;

    private static int count =1000;

    public Product() {
    count++;
    policyNumber = count;
    }

    public String getPlanBenefit() {
        return planBenefit;
    }

    public void setPlanBenefit(String planBenefit) {
        this.planBenefit = planBenefit;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVehicleClass() {
        return vehicleClass;
    }

    public void setVehicleClass(String vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    public String getDriverInsured() {
        return driverInsured;
    }

    public void setDriverInsured(String driverInsured) {
        this.driverInsured = driverInsured;
    }

    public String getPolicyMaxCover() {
        return policyMaxCover;
    }

    public void setPolicyMaxCover(String policyMaxCover) {
        this.policyMaxCover = policyMaxCover;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getPolicyPrice() {
        return policyPrice;
    }

    public void setPolicyPrice(int policyPrice) {
        this.policyPrice = policyPrice;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    @Override
    public String toString() {
        return policyName; //To change body of generated methods, choose Tools | Templates.
    }
    

}
