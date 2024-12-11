package models;

public class Meal {
    private String meal;
    private String drinkAlternative;
    private String category;
    private String country;

    public Meal(Meal jsonMealResponse) {
        
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
