package com.codewithmosh.Observer;

public class SpreadSheet extends Observer{

    public SpreadSheet(DataSource data) {
        super(data);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void update() {
        System.out.println("Updating spreadsheet" + data.getValue());
        
    }

    
    
}
