package Business.OrderItem;

import Business.Policy.Product;
import java.util.Date;

public class OrderItem {

    private Product policy;
    private String automobileNo;
    private String status;
    private Date purchaseDate;
    private Date expiryDate;
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Product getPolicy() {
        return policy;
    }
    
    public void setPolicy(Product policy) {
        this.policy = policy;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
    
    public String getAutomobileNo() {
        return automobileNo;
    }

    public void setAutomobileNo(String automobileNo) {
        this.automobileNo = automobileNo;
    }
    
    @Override
    public String toString() {
        return policy.getPolicyName();
    }
}
