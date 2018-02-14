/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author lijianxi
 */
public class Business {
    private SupplierDirectory sd;
    private MasterOrderCatalog masterorderCatalog;

    public Business(){
        sd=new SupplierDirectory();
        masterorderCatalog=new MasterOrderCatalog();
    }
    public SupplierDirectory getSd() {
        return sd;
    }

    public void setSd(SupplierDirectory sd) {
        this.sd = sd;
    }

    public MasterOrderCatalog getMasterorderCatalog() {
        return masterorderCatalog;
    }

    public void setMasterorderCatalog(MasterOrderCatalog masterorderCatalog) {
        this.masterorderCatalog = masterorderCatalog;
    }

   
    
    
}
