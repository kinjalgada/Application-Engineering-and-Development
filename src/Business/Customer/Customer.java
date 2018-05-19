/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Claim.Claim;
import Business.OrderItem.OrderItem;
import Business.Organization.Organization;
import Business.Policy.Product;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author user
 */
public class Customer {
       
    private String custName;
    private String phone;
    private String dob;
    private String email;
    private String ssn;
    private int custId;
    private int claimCounter=0;
    private Organization organization;
    
    private ArrayList<OrderItem> orderCustomerList;
    private ArrayList<Claim> claimCustomerList;
    
    private static int count =1;

    @Override
    public String toString() {
        return custName; //To change body of generated methods, choose Tools | Templates.
    }

    public Customer() {
    custId = count;
    count++;
    orderCustomerList = new ArrayList<>();
    claimCustomerList = new ArrayList<>();
    }
    
    public OrderItem addCustomerOrderItem(Product p, String autoNo, String status) {
        OrderItem o = new OrderItem();
        o.setPolicy(p);
        o.setAutomobileNo(autoNo);
        o.setStatus(status);
        orderCustomerList.add(o);
        return o;
    }

    public Claim addClaim(String desc, int amt, Date reqDate, String status, OrderItem oi){
        Claim claim = new Claim();
        claim.setClaimAmt(amt);
        claim.setClaimDesc(desc);
        claim.setClaimRequestDate(reqDate);
        claim.setClaimStatus(status);
        claim.setOi(oi);
        claimCustomerList.add(claim);
        return claim;
    }

    public ArrayList<Claim> getClaimCustomerList() {
        return claimCustomerList;
    }

    public void setClaimCustomerList(ArrayList<Claim> claimCustomerList) {
        this.claimCustomerList = claimCustomerList;
    }

    public int getClaimCounter() {
        return claimCounter;
    }

    public void setClaimCounter(int claimCounter) {
        this.claimCounter = claimCounter;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
    
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    
    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public ArrayList<OrderItem> getOrderCustomerList() {
        return orderCustomerList;
    }

    public void setOrderCustomerList(ArrayList<OrderItem> orderCustomerList) {
        this.orderCustomerList = orderCustomerList;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
