/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.Employee.Employee;
//import business.Role.SystemAdminRole;
import business.UserAccount.UserAccount;

/**
 *
 * @author shah0
 */
public class ConfigureASystem {
     public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        return system;
    }
}
