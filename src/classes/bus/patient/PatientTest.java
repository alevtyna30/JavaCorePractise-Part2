package classes.bus.patient;

import java.util.List;

public class PatientTest {
    public static void main(String[] args) {

        Patient patient1 = new Patient("Popov", "Oleg", "Oleksandrovych", "Kyiv",
                4553, 789, "depression");
        Patient patient2 = new Patient("Ostapchyk", "Oleg", "Oleksandrovych", "Lviv",
                4553, 123, "Alzheimer");
        Patient patient3 = new Patient("Kornet", "Oleg", "Mykolayovich", "Poltava",
                4553, 952, "flu");
        Patient patient4 = new Patient("Uhno", "Oleg", "Andriyovich", "Kharkiv",
                4553, 749, "covid-19");
        Patient patient5 = new Patient("Shevchenko", "Oleg", "Ivanovych", "Kyiv",
                4553, 761, "cold");
        Patient patient6 = new Patient("Franko", "Ivan", "Petrovych", "Kyiv",
                4553, 299, "covid-19");

        PatientList list = new PatientList();

        list.addToPatientList(patient1);
        list.addToPatientList(patient2);
        list.addToPatientList(patient3);
        list.addToPatientList(patient4);
        list.addToPatientList(patient5);
        list.addToPatientList(patient6);

        list.getPatientByDiagnosis("covid-19");

        List<Patient> listByMedicalCard = list.getPatientByMedicCart(299, 761);
            System.out.println(listByMedicalCard);
        }
    }

