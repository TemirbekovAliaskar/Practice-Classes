import java.time.LocalDate;
import java.util.Locale;

import static java.lang.StringTemplate.STR;

public class StudentJava {
    String name;
    LocalDate dateOfBirth;
    String phoneNumber;
    String nation;

    public StudentJava(String name,LocalDate dateOfBirth,String phoneNumber,String nation){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.nation = nation;
    }

    public StudentJava (){}

    public String studentKg() {
        return (STR. """

                       Students:
                 Name:  \{ name }
                 dateOfBirdh:  \{ dateOfBirth }
                 Phonenumber:  \{ phoneNumber }
                 Nation:  \{ nation }


                """ );
    }

}
