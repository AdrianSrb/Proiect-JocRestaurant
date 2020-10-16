package TastyFood;

import java.time.temporal.TemporalAmount;
import java.util.*;

public class DishDB extends DishRecipe{

    static List<DishRecipe> Recipe = new ArrayList<>();
    static Map<Integer, DishEnum> mapIdTODish = new HashMap<>();
        static{
            mapIdTODish.put(1,(DishEnum.CHICKEN_PIE));
            mapIdTODish.put(2,(DishEnum.VANILLA_CAKE));
            mapIdTODish.put(3,(DishEnum.PASTA_ARRABIATA));
            mapIdTODish.put(4,(DishEnum.CHICKEN_CURRY));
            mapIdTODish.put(5,(DishEnum.FRIED_RICE));
    }
    public DishDB(DishEnum nameDish, Ingredients ingredients, int amount) {
            super(nameDish, ingredients, amount);
    }
    //  -	add a normal dish to the collection of existing dishes;
        public static void adaugaDish(int i, DishEnum dish){
            mapIdTODish.put(i,dish);
        }
       public static void setRecipe(DishRecipe r) throws InvalidDishException{
            if(Recipe.size()<10){
              Recipe.add(r);
            }else{
                throw new InvalidDishException();
            }
       }
    public static void normalOrSpecial(int i, DishEnum dish){
        for (Map.Entry<Integer,DishEnum> entry : mapIdTODish.entrySet()){
            if (mapIdTODish.equals(DishEnum.CHICKEN_PIE) || mapIdTODish.equals(DishEnum.PASTA_ARRABIATA) ||
                    mapIdTODish.equals(DishEnum.FRIED_RICE) || mapIdTODish.equals(DishEnum.PASTA_CARBONARA)) {
                mapIdTODish.put(i,dish);
                  System.out.println("Dish ul este normal");
                  break;
            }else{
                mapIdTODish.put(i,dish);
                 System.out.println("Dish ul este special");
            }
        }
    }
}

