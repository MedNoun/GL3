package com.codewithmosh;

import com.codewithmosh.prototype.Circle;
import com.codewithmosh.prototype.Component;
import com.codewithmosh.prototype.ContextMenu;
import com.codewithmosh.prototype.Group;
import com.codewithmosh.prototype.Square;
import com.codewithmosh.builder.MovieBuilder;
import com.codewithmosh.builder.PdfDocumentBuilder;
import com.codewithmosh.builder.Presentation;
import com.codewithmosh.builder.PresentationBuilder;
import com.codewithmosh.builder.Slide;

public class Main {
    public static void main(String[] args) {
        Presentation p = new Presentation();
        p.addSlide(new Slide("hello"));
        p.addSlide(new Slide("My name is mohamed Sahnoun"));
        PresentationBuilder p2 = new MovieBuilder();
        p.export(p2);


        // prototype :
        // ContextMenu cont = new ContextMenu();
        // Square s1 = new Square();
        // Circle c1 = new Circle();
        // Square s2 = new Square();
        // Circle c2 = new Circle();
        // Square s3 = new Square();
        // Circle c3 = new Circle();
        // Group g1 = new Group();
        // Group g2 = new Group();
        // g1.addComponent(s1);
        // g1.addComponent(c1);
        // g2.addComponent(s2);
        // g2.addComponent(c2);
        // cont.render(g1);
        // cont.render(g2);
        // Component comp = cont.duplicate(g1);
        // comp.render();
        // s3.render();
        // c3.render();
        

    }
}