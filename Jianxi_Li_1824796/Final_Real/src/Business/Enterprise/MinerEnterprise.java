/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author lijianxi
 */
public class MinerEnterprise extends Enterprise {

    public MinerEnterprise(String name, int id) {
        super(name, EnterpriseType.Miner, id);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
