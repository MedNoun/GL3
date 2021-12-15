package com.codewithmosh.decorator;

public class Main implements Artefact{
    private Artefact element;
    

    public Main(Artefact element) {
        this.element = element;
    }


    @Override
    public String render() {
        return element.render() + ", [Main]";
    }

    
}
