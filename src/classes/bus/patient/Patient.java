package classes.bus.patient;

public class Patient {
    {
        idGenerator++;
    }
    private static int idGenerator = 0;
    private int id = idGenerator;
    private String surname;
    private String name;
    private String middleName;
    private String address;
    private int telephone;
    private int medicCard;
    private String diagnosis;

    public Patient(String surname, String name, String middleName, String address,
                   int telephone, int medicCard, String diagnosis) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.telephone = telephone;
        this.medicCard = medicCard;
        this.diagnosis = diagnosis;
    }

    public int getMedicCard() {
        return medicCard;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", telephone=" + telephone +
                ", medicCard=" + medicCard +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
