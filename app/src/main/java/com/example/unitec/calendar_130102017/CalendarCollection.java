package com.example.unitec.calendar_130102017;

import java.util.ArrayList;

/**
 * Created by Unitec on 13/10/2017.
 */

public class CalendarCollection {
    public String date="";
    public String event_message="";
    public static ArrayList<CalendarCollection> date_collection_arr;

    public CalendarCollection(String date,String event_message){

        this.date=date;
        this.event_message=event_message;

    }
}
