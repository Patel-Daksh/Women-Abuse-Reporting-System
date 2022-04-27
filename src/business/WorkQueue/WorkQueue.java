/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author moksh
 */
public class WorkQueue {
    
    private ArrayList<CaseReporterWorkRequest> caseReporterWorkRequestList;

    public WorkQueue() {
        caseReporterWorkRequestList = new ArrayList<CaseReporterWorkRequest>();
    }
    
    public void setCaseReporterWorkRequestList(ArrayList<CaseReporterWorkRequest> caseReporterWorkRequestList) {
        this.caseReporterWorkRequestList = caseReporterWorkRequestList;
    }

    public ArrayList<CaseReporterWorkRequest> getCaseReporterWorkRequestList() {
        return caseReporterWorkRequestList;
    }
    
    public int getcountbytypesa(String type)
    {
        int count=0;
        
        for(CaseReporterWorkRequest hp: caseReporterWorkRequestList)
        {
            
            if(hp.getAssaultType().equalsIgnoreCase(type))
            {
                count++;
            }
        }
        return count;
    }

}