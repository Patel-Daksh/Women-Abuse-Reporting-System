/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author dax98
 */
public class Victim {
     String victimName;
    Integer victimAge;
      ArrayList <Victim> victims= new ArrayList<Victim>();

    public ArrayList<Victim> getVictims() {
        return victims;
    }

    public void setVictims(ArrayList<Victim> victims) {
        this.victims = victims;
    }
    public void addVictim(Victim c)
    {
        victims.add(c);
    }

    public String getVictimName() {
        return victimName;
    }

    public void setVictimName(String victimName) {
        this.victimName = victimName;
    }

    public Integer getVictimAge() {
        return victimAge;
    }

    public void setVictimAge(Integer victimAge) {
        this.victimAge = victimAge;
    }
}
