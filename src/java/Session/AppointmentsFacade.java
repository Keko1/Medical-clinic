/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entity.Appointments;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Keko
 */
@Stateless
public class AppointmentsFacade extends AbstractFacade<Appointments> {

    @PersistenceContext(unitName = "Medical_clinicPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AppointmentsFacade() {
        super(Appointments.class);
    }
    
    public void save (Integer id, String patientName, String appStatus) {
    
        try {
            Appointments appObj = new Appointments (id,patientName,appStatus);
            em.persist(appObj);
            
        }catch (Exception e){
            throw new EJBException (e.getMessage());
        }
    }
    
}
