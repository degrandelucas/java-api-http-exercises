package models;

import dto.Food;
import dto.FoodInfo;

import java.util.List;

public class Meal {
    private String meal;
    private String drinkAlternative;
    private String category;
    private String country;

    public Meal(Food jsonMealResponse) {
        FoodInfo foodInfo = jsonMealResponse.meals().getFirst();
        this.meal = foodInfo.strMeal();
        this.drinkAlternative = foodInfo.strDrinkAlternate();
        this.category = foodInfo.strCategory();
        this.country = foodInfo.strArea();
    }

    @Override
    public String toString() {
        return "Refeicao='" + meal + '\'' +
                ", drinkAlternative='" + drinkAlternative + '\'' +
                ", category='" + category + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
