package classes.bus.patient;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PatientList {

    List<Patient> patientList = new ArrayList();

    public void addToPatientList(Patient a){
        patientList.add(a);
    }

    public void getPatientByDiagnosis(String diagnosis){
        for(Patient c : patientList){
            if (c.getDiagnosis().equals(diagnosis))
                System.out.println(c.toString());
            }
        }
        List<Patient> getPatientByMedicCart(int diapasonStart, int diapasonEnd) {
            return patientList.stream()
                    .filter(patient -> patient.getMedicCard()>=diapasonStart && patient.getMedicCard()<=diapasonEnd)
                    .collect(Collectors.toList());
        }
    }



