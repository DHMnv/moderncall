package com.example.dhmxl.moderncall.data.model;

import java.util.Date;

/**
 * Created by dhmxl on 10/11/16.
 */
public class Information {

    public static final String TAG = Information.class.getSimpleName();
    public static final String TABLE = "Information";
    // Labels Table Columns names
    public static final String KEY_InformationId = "InformationId";
    public static final String KEY_Course = "Course";
    public static final String KEY_Datt = "Date";
    public static final String KEY_Present = "Present";
    public static final String KEY_Absent = "Absent";


    private String informationId;
    private String course;
    private String date;
    private String absent;
    private String present;

    // setters and getters

    public String getCourse() {
        return course;
    }

    public void setCourse(String Course) {
        this.course = course;
    }

    public String getInformationId() {
        return informationId;
    }

    public void setInformationId(String ref) {
        this.informationId = ref;
    }

    public String getAbsent() {
        return absent;
    }

    public void setAbsent(String absent) {
        this.absent = absent;
    }

    public String getPresent() {
        return present;
    }

    public void setPresent(String present) {
        this.present = present;
    }

    public String getDate() {

        return date;
    }

    public void setDate(String date) {

        this.date = date;
    }
}
