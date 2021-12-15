package com.codewithmosh.abstractFactory;

import com.codewithmosh.abstractFactory.Goals.GoalFactory;

public class HomePage {
    private WorkoutPlan workoutPlan;
    private MealPlan mealPlan;

    public void setGoal(GoalFactory goal) {
        workoutPlan = goal.creatWorkoutPlan();
        mealPlan = goal.creatMealPlan();
        
    }
}
