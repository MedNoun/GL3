package com.codewithmosh.factory;

import com.codewithmosh.factory.Arabi_Calendar.Arabi;

public class ArabiScheduler extends Scheduler{
    @Override
    protected void createCalendar(){
        this.calendar = new Arabi();
    }
    
}
