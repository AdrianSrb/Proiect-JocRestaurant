package TastyFood;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import static TastyFood.DishDB.Recipe;

public class DishRecipe {

    DishEnum nameDish;
    List<Ingredients> ingredients = new ArrayList<>();
    List<Integer> qty = new ArrayList<Integer>();
    int amount;

    public DishRecipe(){

    }
    public DishRecipe(DishEnum nameDish) {
        this.nameDish = nameDish;
    }
    public DishRecipe(DishEnum nameDish, Ingredients ingredients, int amount) {
        this.nameDish = nameDish;
        this.ingredients= Collections.singletonList(ingredients);
        this.amount=amount;
    }

    public void addIngredient(Ingredients ingredient) {
        ingredients.add(ingredient);
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
//    @Override
//    public String toString() {
//        return "DishRecipe{" + "nameDish=" + nameDish + ", ingredients=" + ingredients + ", amount for each ingredient is =" + qty +'}';
//    }
    public void addAmount(Integer amount) {
        qty.add(amount);
    }

    public String giveName(String DishRecipe) throws InvalidDishException{
        if(nameDish.isEmpty()){
            throw new InvalidDishException();
        }else {
            return "DishRecipe{" + "nameDish=" + nameDish + ", ingredients=" + ingredients + ", amount for each ingredient is =" + qty + '}';
        }
    }
}


