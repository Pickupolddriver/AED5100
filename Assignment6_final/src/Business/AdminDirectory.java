/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author raywa
 */
public class AdminDirectory {
    
    public ArrayList <Admin> adminList;
    public AdminDirectory(){
        adminList = new ArrayList<Admin>();
    }

    public ArrayList<Admin> getAdminList() {
        return adminList;
    }

    public void setAdminList(ArrayList<Admin> adminList) {
        this.adminList = adminList;
    }
    public Admin addAdmin(){
        Admin a = new Admin();
        adminList.add(a);
        return a;
    }
    
}
