package classes.bus.student;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class StudentList {
    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student a) {
        studentList.add(a);
    }
    public void facultyPrint(String faculty) {
        for (Student st : studentList) {
            if (st.getFaculty().equals(faculty)) {
                System.out.println(st.toString());
            }
        }
    }
    public void facultyAndCoursePrint(String faculty, Integer course) {
        for (Student st : studentList) {
            if (st.getFaculty().equals(faculty) & st.getCourse().equals(course)) {
                System.out.println(st.toString());
            }
        }
    }
    public void groupPrint(Integer group) {
        studentList.stream()
                .filter(str -> str.getGroup().equals(group))
                .forEach(System.out::println);
    }
    public void studentAfterYear(LocalDate year) {
        for (Student st : studentList) {
            if (st.getDateOfBirth().isAfter(year)) {
                System.out.println(st.toString());
            }
        }
    }
}