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
public class RehabilitationCaretakerWorkRequest extends WorkRequest {
     public RehabilitationCaretakerWorkRequest rehabCaretakerWorkReq;
    private ArrayList<Victim> children = new ArrayList<Victim>();
    public RehabilitationCaretakerWorkRequest getRehabCaretakerWorkReq() {
        return rehabCaretakerWorkReq;
    }

    public void setRehabCaretakerWorkReq(RehabilitationCaretakerWorkRequest rehabCaretakerWorkReq) {
        this.rehabCaretakerWorkReq = rehabCaretakerWorkReq;
    }
     public ArrayList<Victim> getChildren() {
        return children;
    }
     public void addChild(Victim c){
         children.add(c);
     }

    public void setChildren(ArrayList<Victim> children) {
        this.children = children;
    }
}
