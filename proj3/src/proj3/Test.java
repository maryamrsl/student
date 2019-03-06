package proj3;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {

    public static void main(String[] args) {
        Course java = new Course();
        java.namec = "Java EE";
        java.pishniaz = "c";
        Course matlab = new Course();
        java.namec = "matlab";
        java.pishniaz = "pishniaz nadarad";
        Course webdesign=new Course();
        webdesign.namec="webdesign";
        webdesign.pishniaz = "pishniaz nadarad";

        //student1
        ArrayList<Course> coursest1 = new ArrayList<>();
        coursest1.add(java);
        coursest1.add(matlab);



        HashMap<Course, Integer> gradest1 = new HashMap<>();
        gradest1.put(java, 20);
        gradest1.put(matlab, 19);

        Student student1 = new Student();
        student1.name = "maryam";
        student1.lastname = "rasouli";
        student1.course()=coursest1;
        student1.grade()=gradest1;

        //student2
        ArrayList<Course> coursest2= new ArrayList<>();
        coursest2.add(java);
        coursest2.add(webdesign);



        HashMap<Course, Integer> gradest2 = new HashMap<>();
        gradest2.put(java, 20);
        gradest2.put(webdesign, 18);

        Student student2 = new Student();
        student2.name = "sara";
        student2.lastname = "fateh";
        student2.course()=coursest2;
        student2.grade()=gradest2;


    }
}
