package proj3;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {

    public static void main(String[] args) {



        Course java = new Course();
        java.setNamec("Java EE");
        java.setUnitc("10");

        Course matlab = new Course();
        matlab.setNamec("matlab");
        matlab.setUnitc("6");

        Course webdesign=new Course();
        webdesign.setNamec("webdesign");
        webdesign.setUnitc("8");

        //student1
        Student student1 = new Student();
        student1.setName("maryam");
        student1.setLastname("rasouli");

        ArrayList<Course> coursest1 = new ArrayList<>();
        coursest1.add(java);
        coursest1.add(matlab);
        student1.setCourse(coursest1);



        HashMap<Course, Integer> gradest1 = new HashMap<>();
        gradest1.put(java, 20);
        gradest1.put(matlab, 19);
        student1.setGrade(gradest1);

        //student2
        Student student2=new Student();
        student2.setName("sara");
        student2.setLastname("fateh");

        ArrayList<Course> coursest2= new ArrayList<>();
        coursest2.add(java);
        coursest2.add(webdesign);

        HashMap<Course, Integer> gradest2 = new HashMap<>();
        gradest2.put(java, 20);
        gradest2.put(webdesign, 18);

        student2.setCourse(coursest2);
        student2.setGrade(gradest2);

        //Allstudent
        ArrayList<Student> allstudent=new ArrayList<>();
        allstudent.add(student1);
        allstudent.add(student2);

        for(Student st:allstudent) {
            System.out.println("name:"+st.getName());
            System.out.println("last name:"+st.getLastname());
           for (Course doros : st.getCourse()) {
                System.out.println("course:"+doros.getNamec());
                System.out.println("unit:"+doros.getUnitc());
                System.out.println("grade:"+st.getGrade().get(doros));
            }
        }



    }
}
