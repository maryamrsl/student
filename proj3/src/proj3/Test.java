package proj3;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {

    public static void main(String[] args) {



        Course java = new Course();
        java.namec = "Java EE";
        java.unitc = "10";

        Course matlab = new Course();
        matlab.namec = "matlab";
        matlab.unitc = "6";

        Course webdesign=new Course();
        webdesign.namec="webdesign";
        webdesign.unitc = "8";

        //student1
        Student student1 = new Student();
        student1.name = "maryam";
        student1.lastname = "rasouli";

        ArrayList<Course> coursest1 = new ArrayList<>();
        coursest1.add(java);
        coursest1.add(matlab);
        student1.course=coursest1;



        HashMap<Course, Integer> gradest1 = new HashMap<>();
        gradest1.put(java, 20);
        gradest1.put(matlab, 19);
        student1.grade=gradest1;

        //student2
        Student student2=new Student();
        student2.name="sara";
        student2.lastname="fateh";

        ArrayList<Course> coursest2= new ArrayList<>();
        coursest2.add(java);
        coursest2.add(webdesign);

        HashMap<Course, Integer> gradest2 = new HashMap<>();
        gradest2.put(java, 20);
        gradest2.put(webdesign, 18);

        student2.course=coursest2;
        student2.grade=gradest2;

        //Allstudent
        ArrayList<Student> allstudent=new ArrayList<>();
        allstudent.add(student1);
        allstudent.add(student2);

        for(Student st:allstudent) {
            System.out.println("name:"+st.name);
            System.out.println("last name:"+st.lastname);
            for (Course doros : st.course) {
                System.out.println("course:"+doros.namec);
                System.out.println("unit:"+doros.unitc);
                System.out.println("grade:"+st.grade.get(doros));
            }
        }



    }
}
