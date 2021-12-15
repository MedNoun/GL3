package com.codewithmosh.abstractFactory.Goals.WeightLoss;

import com.codewithmosh.abstractFactory.MealPlan;
import com.codewithmosh.abstractFactory.WorkoutPlan;
import com.codewithmosh.abstractFactory.Goals.GoalFactory;

public class WeightLossFactory implements GoalFactory{

    @Override
    public WorkoutPlan creatWorkoutPlan() {
        return new WeightLossWorkout();
    }

    @Override
    public MealPlan creatMealPlan() {
       return new WeighLossMealPlan();
    }
    
}
