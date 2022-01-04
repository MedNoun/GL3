package com.codewithmosh.Observer;

public class Chart extends Observer {

    public Chart(DataSource data) {
        super(data);
    }

    @Override
    public void update() {
       System.out.println("Chart is being updated " + data.getValue());
        
    }

       
}
