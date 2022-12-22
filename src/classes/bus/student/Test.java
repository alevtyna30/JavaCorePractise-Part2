package classes.bus.student;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
       Student st1 = new Student("Петренко","Василь", "Миколайович",
               LocalDate.of(1987,9,25), "Полтава",
               5676123,"Фінанси", 4, 1);
        Student st2 = new Student("Іваненко","Петро", "Сергійович",
                LocalDate.of(2001,1,13), "Київ",
                5676345,"Право", 1, 1);
        Student st3 = new Student("Сергієнко","Марина", "Василівна",
                LocalDate.of(2009,10,27), "Харків",
                8776123,"Економіка", 3, 3);
        Student st4 = new Student("Полякова","Ольга", "Іванівна",
                LocalDate.of(1999,4,6), "Житомир",
                5675623,"Право", 5, 3);
        Student st5 = new Student("Безуглий","Олександр", "Петрович",
                LocalDate.of(2002,12,5), "Київ",
                5690123,"Маркетинг", 1, 4);
        Student st6 = new Student("Петренко","Степан", "Петрович",
                LocalDate.of(2005,6,5), "Харків",
                5676123,"Фінанси", 3, 1);

        StudentList newList = new StudentList();
        newList.addStudent(st1);
        newList.addStudent(st2);
        newList.addStudent(st3);
        newList.addStudent(st4);
        newList.addStudent(st5);
        newList.addStudent(st6);

        newList.groupPrint(1);
        newList.facultyPrint("Право");
        newList.facultyAndCoursePrint("Фінанси", 3);
        newList.studentAfterYear(LocalDate.of(1999, 1, 1));
        newList.groupPrint(1);











    }
}
