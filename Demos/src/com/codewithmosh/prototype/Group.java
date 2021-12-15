package com.codewithmosh.prototype;

import java.util.ArrayList;

public class Group implements Component{

    public ArrayList<Component> l = new ArrayList<Component>();

    public void addComponent(Component a){
        l.add(a);
    }

    @Override
    public void render() {

        System.out.println("Rendering a group");
        for(Component a : l){
            a.render();
        }
        
    }

    @Override
    public Component clone() {
        System.out.println("Copying a group");
        Group new_group = new Group();
        for(Component a : l){
            new_group.addComponent(a.clone());
        }
        return new_group;
    }

    
}
