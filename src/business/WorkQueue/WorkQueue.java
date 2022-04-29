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
    private ArrayList<PsychiatristWorkRequest> psychiatristWorkRequestList;
    private ArrayList<DrWorkRequest> DoctorworkRequestList;
    private ArrayList<PharmacistWorkRequest> PharmacistWorkRequest;
    private ArrayList<LabAssistantWorkRequest> LabAssistanceWorkRequest;

    

    public WorkQueue() {
        caseReporterWorkRequestList = new ArrayList<CaseReporterWorkRequest>();
        psychiatristWorkRequestList=new ArrayList<PsychiatristWorkRequest>();
        DoctorworkRequestList = new ArrayList<DrWorkRequest>();
        PharmacistWorkRequest = new ArrayList<PharmacistWorkRequest>();
        LabAssistanceWorkRequest = new ArrayList<LabAssistantWorkRequest>();

    }

    public ArrayList<PharmacistWorkRequest> getPharmacistWorkRequest() {
        return PharmacistWorkRequest;
    }

    public void setPharmacistWorkRequest(ArrayList<PharmacistWorkRequest> PharmacistWorkRequest) {
        this.PharmacistWorkRequest = PharmacistWorkRequest;
    }

    
    public ArrayList<DrWorkRequest> getDoctorworkRequestList() {
        return DoctorworkRequestList;
    }
    public ArrayList<LabAssistantWorkRequest> getLabAssistanceWorkRequest() {
        return LabAssistanceWorkRequest;
    }

    public void setDoctorworkRequestList(ArrayList<DrWorkRequest> DoctorworkRequestList) {
        this.DoctorworkRequestList = DoctorworkRequestList;
    }
   
    public void setCaseReporterWorkRequestList(ArrayList<CaseReporterWorkRequest> caseReporterWorkRequestList) {
        this.caseReporterWorkRequestList = caseReporterWorkRequestList;
    }

    public ArrayList<CaseReporterWorkRequest> getCaseReporterWorkRequestList() {
        return caseReporterWorkRequestList;
    }
    public ArrayList<PsychiatristWorkRequest> getPsychiatristWorkRequestList() {
        return psychiatristWorkRequestList;
    }
     public void setPsychiatristWorkRequestList(ArrayList<PsychiatristWorkRequest> psychiatristWorkRequestList) {
        this.psychiatristWorkRequestList = psychiatristWorkRequestList;
    }
     public void setLabAssistanceWorkRequest(ArrayList<LabAssistantWorkRequest> LabAssistanceWorkRequest) {
        this.LabAssistanceWorkRequest = LabAssistanceWorkRequest;
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