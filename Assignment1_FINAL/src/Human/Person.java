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
public class Person {
    String FirstName;
    String LastName;
    String Height;
    int age;
    String DOB;
    String Filename;
    Address personaddress;
    CreditCard personcreditcard;
    License personlicense;
    FinancialAccount personfinancialaccount;

    
    
    
    public Person() {
        personaddress=new Address();
        personcreditcard=new CreditCard();
        personlicense=new License();
        personfinancialaccount=new FinancialAccount();
    }

    
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getHeight() {
        return Height;
    }

    public void setHeight(String Height) {
        this.Height = Height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public Address getPersonaddress() {
        return personaddress;
    }

    public void setPersonaddress(Address personaddress) {
        this.personaddress = personaddress;
    }

    public CreditCard getPersoncreditcard() {
        return personcreditcard;
    }

    public void setPersoncreditcard(CreditCard personcreditcard) {
        this.personcreditcard = personcreditcard;
    }

    public License getPersonlicense() {
        return personlicense;
    }

    public void setPersonlicense(License personlicense) {
        this.personlicense = personlicense;
    }

    public FinancialAccount getPersonfinancialaccount() {
        return personfinancialaccount;
    }

    public void setPersonfinancialaccount(FinancialAccount personfinancialaccount) {
        this.personfinancialaccount = personfinancialaccount;
    }

    public String getFilename() {
        return Filename;
    }

    public void setFilename(String Filename) {
        this.Filename = Filename;
    }
    
    
    
    

  
}
