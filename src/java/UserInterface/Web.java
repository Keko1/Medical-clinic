/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Session.AppointmentsFacade;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Keko
 */

@Named
@RequestScoped


public class Web {
    
    @EJB
    private AppointmentsFacade uf;
    
    private Integer id; 
    private String patientName; 
    private String appStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(String appStatus) {
        this.appStatus = appStatus;
    }
    
    public void save () {
        try {
            uf.save(id, patientName, appStatus);
        } catch (Exception e) {
        }
    }
}
