package com.example.dhmxl.moderncall;

/**
 * Created by dhmxl on 10/12/16.
 */

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ModernCallDbHandler extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "ModernCallDb";

    // modernCall  table name
    private static final String TABLE_STUDENTS = "students";
    private static final String TABLE_INFORMATION = "information";

    // students Table Columns names
    public static final String KEY_StudentId = "StudentId";
    public static final String KEY_Name = "Name";
    public static final String Key_Matricule = "Matricule";
    public static final String Key_Level = "Level";
    public static final String Key_Phone = "Phone";

    // information Table columns name

    public static final String KEY_InformationId = "InformationId";
    public static final String KEY_Course = "Course";
    public static final String KEY_Datt = "Date";
    public static final String KEY_Present = "Present";
    public static final String KEY_Absent = "Absent";

    public ModernCallDbHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_STUDENTS_TABLE = "CREATE TABLE " + TABLE_STUDENTS + "("
                + KEY_StudentId + " INTEGER PRIMARY KEY autoincrement," + KEY_Name
                + " TEXT not null," + Key_Matricule + " TEXT not null," + Key_Level + "TEXT not null," + Key_Phone + "TEXT not null" + ")";
        db.execSQL(CREATE_STUDENTS_TABLE);

        String CREATE_INFORMATION_TABLE = "CREATE TABLE " + TABLE_INFORMATION
                + "(" + KEY_InformationId + " INTEGER PRIMARY KEY autoincrement,"
                + KEY_Course + " TEXT not null," + KEY_Datt + " TEXT not null," + KEY_Present + "TEXT not null," + KEY_Absent + "TEXT not null,"
                + ")";
        db.execSQL(CREATE_INFORMATION_TABLE);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_STUDENTS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_INFORMATION);
        // Create tables again
        onCreate(db);
    }

}
