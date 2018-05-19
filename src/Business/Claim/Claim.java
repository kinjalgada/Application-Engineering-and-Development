/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Claim;

import Business.OrderItem.OrderItem;
import java.util.Date;

/**
 *
 * @author user
 */
public class Claim {
    private int id;
    private String claimDesc;
    private int claimAmt;
    private Date claimRequestDate;
    private Date claimStatusUpdateDate;
    private String claimStatus;
    private OrderItem oi;
    private static int count = 1;
    
    public void Claim (){
        id=count;
        count++;
    }

    public OrderItem getOi() {
        return oi;
    }

    public void setOi(OrderItem oi) {
        this.oi = oi;
    }

    public int getClaimAmt() {
        return claimAmt;
    }

    public void setClaimAmt(int claimAmt) {
        this.claimAmt = claimAmt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClaimDesc() {
        return claimDesc;
    }

    public void setClaimDesc(String claimDesc) {
        this.claimDesc = claimDesc;
    }

    public Date getClaimRequestDate() {
        return claimRequestDate;
    }

    public void setClaimRequestDate(Date claimRequestDate) {
        this.claimRequestDate = claimRequestDate;
    }

    public Date getClaimStatusUpdateDate() {
        return claimStatusUpdateDate;
    }

    public void setClaimStatusUpdateDate(Date claimStatusUpdateDate) {
        this.claimStatusUpdateDate = claimStatusUpdateDate;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }
    
    @Override
    public String toString(){
        return claimDesc;
    }
    

}
