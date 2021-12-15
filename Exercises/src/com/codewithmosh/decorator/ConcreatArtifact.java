package com.codewithmosh.decorator;

public class ConcreatArtifact implements Artefact{
    private String name;


    public ConcreatArtifact(String name) {
        this.name = name;
    }

    @Override
    public String render(){
        return name;
    }


    
}
