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
     private ArrayList<LawyerWorkRequest> LawyerworkRequestList;
     

    

    public WorkQueue() {
        caseReporterWorkRequestList = new ArrayList<CaseReporterWorkRequest>();
        psychiatristWorkRequestList=new ArrayList<PsychiatristWorkRequest>();
        DoctorworkRequestList = new ArrayList<DrWorkRequest>();
        PharmacistWorkRequest = new ArrayList<PharmacistWorkRequest>();
        LabAssistanceWorkRequest = new ArrayList<LabAssistantWorkRequest>();
        LawyerworkRequestList=new ArrayList<LawyerWorkRequest>();
    }

    public ArrayList<LawyerWorkRequest> getLawyerworkRequestList() {
        return LawyerworkRequestList;
    }

    public void setLawyerworkRequestList(ArrayList<LawyerWorkRequest> LawyerworkRequestList) {
        this.LawyerworkRequestList = LawyerworkRequestList;
    }
    
    
    public ArrayList<PharmacistWorkRequest> getPharmacistWorkRequest() {
        return PharmacistWorkRequest;
    }

    public void setPharmacistWorkRequest(ArrayList<PharmacistWorkRequest> PharmacistWorkRequest) {
        this.PharmacistWorkRequest = PharmacistWorkRequest;
    }
    
    public ArrayList<LabAssistantWorkRequest> getLabAssistanceWorkRequest() {
        return LabAssistanceWorkRequest;
    }

    public void setDoctorworkRequestList(ArrayList<DrWorkRequest> DoctorworkRequestList) {
        this.DoctorworkRequestList = DoctorworkRequestList;
    }
   
     public ArrayList<CaseReporterWorkRequest> getCaseReporterWorkRequestList() {
        return caseReporterWorkRequestList;
     }
     
     public ArrayList<PsychiatristWorkRequest> getPsychiatristWorkRequestList() {
        return psychiatristWorkRequestList;
    }
     

    public void setCaseReporterWorkRequestList(ArrayList<CaseReporterWorkRequest> caseReporterWorkRequestList) {
        this.caseReporterWorkRequestList = caseReporterWorkRequestList;
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