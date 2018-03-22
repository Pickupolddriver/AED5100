/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author raywa
 */
public class Bank {

    private String nameOnCard;
    private long cardNumber;
    private String expDate;
    private int secureCode;
    private double balance;

    public void changeBalance(double summoney) {
        this.balance = this.getBalance() - summoney;
        //Pay attention to the signal of the money and how to use it.
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Bank() {
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public int getSecureCode() {
        return secureCode;
    }

    public void setSecureCode(int secureCode) {
        this.secureCode = secureCode;
    }

}
