package com.codewithmosh.factory;

import java.util.Date;

import com.codewithmosh.factory.Georgian_Calendar.Georgian;

public class Scheduler {
    protected Calendar calendar;

    protected void createCalendar(){
        calendar = new Georgian();
    }

    public void schedule(Event event) {
        var today = new Date();
        createCalendar();
        calendar.addEvent(event, today);
    }
}
