public class Student {

    String name;
    int age;
    String group;


      public Student(String name,int age,String group) {
          this.name = name;
          this.age = age;
          this.group = group;


      }

      public String getStudent () {
          System.out.printf("Student  : \n    %s    \n    %d    \n    %s",name,age,group);
          return "";


      }



}
