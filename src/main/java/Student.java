    // Implement your Student class here

import java.util.Date;

public class Student {

    private int id;
    private static int idSeed = 10000;
    private String familyName;
    private String name;
    private Date birthday;
    private Course degree;

    private String domain = "hsrw.org";

    private static String degreeDescriptions[] = new String[] {
            "Mechanical Engineering, B.Sc.", 
            "Mechatronic Systems Engineering, B.Sc.",
            "Electrical and Electronics Engineering, B.Sc.",
            "Industrial Engineering, B.Sc.",
            "Biomaterials Science, B.Sc.",
            "Science Communication and Bionics, B.A./B.Sc.",
            "Mechanical Engineering, M.Sc.",
            "Bionics, M.Sc."
    };


    private Student(){
        this.id = idSeed++;
    }

    Student(String name, String familyName){
        this();
        this.name = name;
        this.familyName = familyName;
    }

    Student(String name, String familyName, Date birthday){
        this(name, familyName);
        this.birthday = birthday;
    }

    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getFamilyName(){
        return this.familyName;
    }

    public void setFamilyName(String familyName){
        this.familyName = familyName;
    }

    public int getID() {
        return id;
    }

    public Date getBirthday(){
        return this.birthday;
    }

    public void setBirthday(Date birthday){
        this.birthday = birthday;
    }

    public Course getDegree(){
        return this.degree;
    }

    public String getDegreeDescription(){

        if(this.degree == null){
            return "No course assigned";
        }

        return degreeDescriptions[this.degree.ordinal()];
    }

    public void setDegree(Course degree){
        this.degree = degree;
    }   
    
    public void setDegree(String degree){
        
       this.degree = Course.valueOf(degree);

    }

    public String getEmail(){
        return this.name + "." + this.familyName + "@"+ this.domain;
    }

}
