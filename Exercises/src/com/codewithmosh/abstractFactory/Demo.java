package com.codewithmosh.abstractFactory;

import com.codewithmosh.abstractFactory.Goals.BuildMuscle.BuildMuscleFactory;

public class Demo {
    public static void show() {
        var homePage = new HomePage();
        homePage.setGoal(new BuildMuscleFactory());
    }
}
