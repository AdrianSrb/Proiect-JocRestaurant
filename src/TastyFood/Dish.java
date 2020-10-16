package TastyFood;

import java.util.ArrayList;
import java.util.HashMap;

public class Dish {

    private int idDish;
    private DishEnum nameDish;

    public Dish(int idDish, DishEnum nameDish) {
        this.idDish=idDish;
        this.nameDish=nameDish;
    }
    public void setIdDish()
    {
        this.idDish=idDish;
    }
    public int getDishId(String nameDish)
    {
        return idDish;
    }
    public String getDishName(int idDish) {
        System.out.println(idDish);
     return null;
    }
//    public static void setRecipe(DishRecipe r) throws InvalidDishException{
//        if(DishRecipe.size()<10){
//            DishRecipe.add(r);
//        }else{
//            throw new InvalidDishException();
//        }
//    }

}
