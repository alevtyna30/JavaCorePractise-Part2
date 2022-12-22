package classes.bus.student;

import java.time.LocalDate;

public class Student {

    {

        idGenerator++;
    }

    private static int idGenerator = 0;
    private int id = idGenerator;
    private String surname;
    private String name;
    private String middleName;
    private LocalDate dateOfBirth;
    private String address;
    private int telephone;
    private String faculty;
    private Integer course;
    private Integer group;


    public Student(String surname, String name, String stepName, LocalDate dateOfBirth, String address,
                   int telephone, String faculty, Integer course, Integer group) {
        this.surname = surname;
        this.name = name;
        this.middleName = stepName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.telephone = telephone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFaculty() {
        return faculty;
    }

    public Integer getCourse() {
        return course;
    }

    public Integer getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", stepName='" + middleName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address='" + address + '\'' +
                ", telephone=" + telephone +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group=" + group +
                '}';
    }
}