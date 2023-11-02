import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {


        LocalDate date = LocalDate.of(2000, 1, 1);
        StudentJava studentJava1 = new StudentJava("Ali", date, "996500389438", "kyrgyz");
        StudentJava studentJava2 = new StudentJava("Jigit", LocalDate.of(1999, 4, 4), "996500384433", "kyrgyz");
        StudentJava studentJava3 = new StudentJava("Abu", LocalDate.of(2005, 2, 21), "996700389338", "uzbek");
        StudentJava studentJava4 = new StudentJava("Aiturgan", LocalDate.of(2002, 11, 23), "996503489438", "kazakh");
        StudentJava studentJava5 = new StudentJava("Nur", LocalDate.of(2009, 5, 16), "99650033438", "kyrgyz");

        StudentJava studentJava6 = new StudentJava();
        studentJava6.name = "Aslan";
        studentJava6.dateOfBirth = LocalDate.of(2003, 10, 25);
        studentJava6.phoneNumber = "996708986745";
        studentJava6.nation = "Uigur";


        StudentJava[] student = {studentJava1, studentJava2, studentJava3, studentJava4, studentJava5, studentJava6};

        for (StudentJava stud : student) {
            System.out.println(stud.studentKg());
        }


/////////////////////Student

//        Student student = new Student("Nurtazin", 19, "Java");
//        Student student1 = new Student("Jigit", 20, "Java");
//        Student student2 = new Student("Mirlan", 23, "Java");
//        Student student3 = new Student("Nur", 30, "JS");
//        Student student4 = new Student("Azim", 19, "JS");
//
//
//        Student[] students = {student, student1, student2, student3, student4};
//        int Java = 0;
//        int JS = 0;
//        int sum = 0;
//        for (Student st : students) {
//            System.out.println(st.getStudent());
//
//            if (st.group.equals("Java")) {
//                Java++;
//            } else JS++;
////Ariфметика
//            sum += st.age;
//
//        }
//        System.out.println("Java  :  " + Java);
//        System.out.println("Java  :  " + JS);
//
//
//        System.out.println("Arifmetika   :  " + sum / students.length);


    }

}


