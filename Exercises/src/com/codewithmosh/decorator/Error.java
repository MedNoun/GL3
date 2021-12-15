package com.codewithmosh.decorator;

public class Error implements Artefact{
    private Artefact item;

    public Error(Artefact item) {
        this.item = item;
    }

    @Override
    public String render() {
        
        return item.render() + ", [Error]";
    }

   
    
}
