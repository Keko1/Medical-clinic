package Entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-02T23:49:46")
@StaticMetamodel(Appointments.class)
public class Appointments_ { 

    public static volatile SingularAttribute<Appointments, String> patientName;
    public static volatile SingularAttribute<Appointments, Date> appDate;
    public static volatile SingularAttribute<Appointments, Integer> id;
    public static volatile SingularAttribute<Appointments, String> appStatus;

}