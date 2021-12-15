package com.codewithmosh.factory.Arabi_Calendar;

import java.util.Date;

import com.codewithmosh.factory.Calendar;
import com.codewithmosh.factory.Event;

public class Arabi implements Calendar{

    @Override
    public void addEvent(Event event, Date date) {
        System.out.println("Adding an event on the given date. in the arabian ");
    }
    
}
