/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author lijianxi
 */
public class AirlinerDirectory {
    
    private ArrayList<Airliner> airlinerDirectory;
    
    public AirlinerDirectory(){
        airlinerDirectory=new ArrayList<Airliner>();
    }

    public ArrayList<Airliner> getAirlinerList() {
        return airlinerDirectory;
    }

    public void setAirlinerList(ArrayList<Airliner> airlinerList) {
        this.airlinerDirectory = airlinerList;
    }
    
    public Airliner addAirliner(){
        Airliner a1=new Airliner();
        this.airlinerDirectory.add(a1);
        return a1;
    }
    
    public void deleteAirliner(Airliner a1){
        airlinerDirectory.remove(a1);
    }
}
