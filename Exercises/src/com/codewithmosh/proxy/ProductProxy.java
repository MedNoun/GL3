package com.codewithmosh.proxy;

public class ProductProxy implements ProductInterface {
    private static DbContext dbcontext = new DbContext();

    @Override
    public int getId() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
    }
    
    
}
