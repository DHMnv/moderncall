package com.example.dhmxl.moderncall.data.model;

/**
 * Created by dhmxl on 10/11/16. for moderncall android app
 */
public class Student {

    public static final String TAG = Student.class.getSimpleName();
    public static final String TABLE = "students";
    // Labels Table Columns names
    public static final String KEY_StudentId = "StudentId";
    public static final String KEY_Name = "Name";
    public static final String Key_Matricule = "Matricule";
    public static final String Key_Level = "Level";
    public static final String Key_Phone = "Phone";

    private String studentId;
    private String name;
    private String matricule;
    private String level;
    private String phone;

    //setter and getter for studentId

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // setters and getters for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //setter and getter for matricule
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    //setter and getter for phone

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    // setter and getter for level
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
