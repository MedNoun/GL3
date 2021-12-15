package com.codewithmosh.abstractFactory.Goals;

import com.codewithmosh.abstractFactory.MealPlan;
import com.codewithmosh.abstractFactory.WorkoutPlan;

public interface GoalFactory {
    WorkoutPlan creatWorkoutPlan();
    MealPlan creatMealPlan();
}
