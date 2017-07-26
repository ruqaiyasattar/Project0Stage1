package mycook.dell.example.com.patientapp.model;

import com.activeandroid.Model;

import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by DELL on 7/20/2017.
 */

@Table(name = "PatientsTable")
public class Patient extends Model {
    public Patient() {
        super();
    }

    @Column( name = "Patient_name")
    private String PatientName;

    @Column( name = "Patient_Disease")
    private String PatientDisease;

    @Column( name = "Patient_Medician")
    private String PatientMedician;

    @Column( name = "Patient_date")
    private String PatientDate;

    @Column( name = "Patient_Cost")
    private int PatientCost;

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String patientName) {
        PatientName = patientName;
    }

    public String getPatientDisease() {
        return PatientDisease;
    }

    public void setPatientDisease(String patientDisease) {
        PatientDisease = patientDisease;
    }

    public String getPatientMedician() {
        return PatientMedician;
    }

    public void setPatientMedician(String patientMedician) {
        PatientMedician = patientMedician;
    }

    public String getPatientDate() {
        return PatientDate;
    }

    public void setPatientDate(String patientDate) {
        PatientDate = patientDate;
    }

    public int getPatientCost() {
        return PatientCost;
    }

    public void setPatientCost(int patientCost) {
        PatientCost = patientCost;
    }


}
