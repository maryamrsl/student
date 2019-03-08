package proj3;


import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    public String name;
    public String lastname;
    public ArrayList<Course> course;
    public HashMap<Course, Integer> grade;

 public void setName(String Name){
     name=Name;
 }
 public String getName(){
     return name;
 }

    public void setLastname(String Lastname){
        lastname=Lastname;
    }
    public String getLastname(){
        return lastname;
    }

    public void setCourse(ArrayList<Course> Course){
        course=Course;
    }
    public  ArrayList<Course> getCourse(){
        return course;
    }

    public void setGrade(HashMap<Course,Integer> Grade){
        grade=Grade;
    }
    public HashMap<Course,Integer> getGrade(){
     return grade;
    }

}