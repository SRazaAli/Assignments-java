

package com.mycompany.mavenproject2;
import java.util.ArrayList;
class Course{
    private String courseCode,courseName,courseCreditHours;
    
    //constructor
    Course(String courseCode,String courseName, String courseCreditHours){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseCreditHours = courseCreditHours;
    }
    //methods
    public String getCourseCode(){
        return courseCode;
    }
    public String getCourseName(){
        return courseName;
    }
    public String getCourseCreditHours(){
        return courseCreditHours;
    }
    
}

class Faculty{
    private String facultyName,facultyDesignation,facultyEmail,facultyContact;
    private int facultySalary, facultyId;
    private ArrayList<Course> courseList = new ArrayList<Course>();
    
    //constructor
    Faculty(String facultyName, String facultyDesignation, String facultyEmail, String facultyContact, int facultySalary, int facultyId){
        this.facultyName = facultyName;
        this.facultyDesignation = facultyDesignation;
        this.facultyEmail = facultyEmail;
        this.facultyContact = facultyContact;
        this.facultySalary = facultySalary;
        this.facultyId = facultyId;
    }
    //methods
    public void assignCourse(Course course){
        courseList.add(course);
    }
    public String getFacultyName(){
        return facultyName;
    }
    public String getFacultyDesgination(){
        return facultyDesignation;
    }
    public String getFacultyEmail(){
        return facultyEmail;
    }
    public String getFacultyContact(){
        return facultyContact;
    }
    public int getFacultySalary(){
        return facultySalary;
    }
    public int getFacultyId(){
        return facultyId;
    }
    public void printAll(){
        System.out.println("Faculty Name : "+facultyName+"\n"+
                "Faculty Designation : "+facultyDesignation + "\n"+
                "Faculty Email : "+ facultyEmail+ "\n"+
                "Faculty Contact : "+facultyContact+"\n"+
                "Faculty Salary : "+facultySalary+"\n"+
                "Faculty Id : "+facultyId+"\n=============== Faculty Courses =============== \n");
                for(int i = 0;i<courseList.size();i++){
                    System.out.println( "* Course "+(i+1)+" : ");
                    System.out.println("Course code : "+courseList.get(i).getCourseCode());
                    System.out.println("CourseName : "+courseList.get(i).getCourseName());
                    System.out.println("CourseCreditHours : "+courseList.get(i).getCourseCreditHours());

                }
    }
}

class Department{
    private String departmentName;
    private ArrayList<Faculty> departmentFaculty = new ArrayList<Faculty>();
    private ArrayList<Course> offeredCourses = new ArrayList<Course>();
    
    //methods
    Department(String departmentName){
        this.departmentName = departmentName;
    }
    
    public void facultyList(Faculty faculty){ //assigning faculty
        departmentFaculty.add(faculty);
    }
    public void courseList(Course course){
        offeredCourses.add(course);
    }
    public void printAll(){
        System.out.println("Department Name : "+departmentName);
        System.out.println("============= Faculty List =============");
        for (int i = 0; i <departmentFaculty.size() ; i++) {
            System.out.println("* Faculty "+(i+1));
            System.out.println("Faculty Name : "+departmentFaculty.get(i).getFacultyName()+"\n"+
                "Faculty Designation : "+departmentFaculty.get(i).getFacultyDesgination()+ "\n"+
                "Faculty Email : "+ departmentFaculty.get(i).getFacultyEmail()+ "\n"+
                "Faculty Contact : "+departmentFaculty.get(i).getFacultyContact()+"\n"+
                "Faculty Salary : "+departmentFaculty.get(i).getFacultySalary()+"\n"+
                "Faculty Id : "+departmentFaculty.get(i).getFacultyId());
        }
        System.out.println("============= Course List =============");

        for (int i = 0; i <offeredCourses.size() ; i++) {
                            System.out.println("* Course "+(i+1));
                    System.out.println("Course code : "+offeredCourses.get(i).getCourseCode());
                    System.out.println("CourseName : "+offeredCourses.get(i).getCourseName());
                    System.out.println("CourseCreditHours : "+offeredCourses.get(i).getCourseCreditHours());
        }
    }
}
public class Mavenproject2 {

    public static void main(String[] args) {
        //Two objects of course
        Course c1 = new Course("0000","oop","12");
        Course c2 = new Course("001","CP","18");
        //Three objs of Faculty 
        Faculty f1 = new Faculty("Syed Raza","Lecturer","asyedraza85632@gmail.com","121212121",24000,1234);
        Faculty f2 = new Faculty("Aimen","TA","aimen@gmail.com","232323232",10000,1248);
        Faculty f3 = new Faculty("Muskan","Lecturer","muskan123@gmail.com","98989898",15000,1233);
        //Three objs of Department
        Department d1 = new Department("Computer Science");
        Department d2 = new Department("IPP");
        Department d3 = new Department("Maritime");

        //Assigning faculty to depart
        d1.facultyList(f1);
        d1.facultyList(f2);
        d1.facultyList(f3);
        //Assigning Courses to depart
        d1.courseList(c1);
        d1.courseList(c2);

        //assigning courses to faculty
        f1.assignCourse(c1);
        f1.assignCourse(c2);
//        f1.printAll();
        d1.printAll(); //printing faculty and courses in a depart
    }
}
