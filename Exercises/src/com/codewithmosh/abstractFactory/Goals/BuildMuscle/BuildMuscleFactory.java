package com.codewithmosh.abstractFactory.Goals.BuildMuscle;

import com.codewithmosh.abstractFactory.MealPlan;
import com.codewithmosh.abstractFactory.WorkoutPlan;
import com.codewithmosh.abstractFactory.Goals.GoalFactory;

public class BuildMuscleFactory implements GoalFactory{

    @Override
    public WorkoutPlan creatWorkoutPlan() {
        return new BuildMuscleWorkout();
    }

    @Override
    public MealPlan creatMealPlan() {
        return new BuildMuscleMealPlan();
    }
    
}
