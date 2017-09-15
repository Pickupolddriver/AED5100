/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Human;

/**
 *
 * @author lijianxi
 */
public class CreditCard {
    public String CCType;
    public String CreditLine;//信用额度
    public String CCExpiredate;
    public String CreditCardID;
    public String CCPIN;

    public String getCCType() {
        return CCType;
    }

    public void setCCType(String CCType) {
        this.CCType = CCType;
    }

    public String getCreditLine() {
        return CreditLine;
    }

    public void setCreditLine(String CreditLine) {
        this.CreditLine = CreditLine;
    }

    public String getCCExpiredate() {
        return CCExpiredate;
    }

    public void setCCExpiredate(String CCExpiredate) {
        this.CCExpiredate = CCExpiredate;
    }

    public String getCreditCardID() {
        return CreditCardID;
    }

    public void setCreditCardID(String CreditCardID) {
        this.CreditCardID = CreditCardID;
    }

    public String getCCPIN() {
        return CCPIN;
    }

    public void setCCPIN(String CCPIN) {
        this.CCPIN = CCPIN;
    }

    
   
    
}
