package TastyFood;

import java.util.ArrayList;
import java.util.List;

import static TastyFood.DishDB.*;
import static TastyFood.DishEnum.CHICKEN_CURRY;
import static TastyFood.DishEnum.PASTA_CARBONARA;
import static TastyFood.IngredientDB.*;
import static TastyFood.DishRecipe.*;

public class DishService {
  public static void main(String[] args) throws InvalidDishException {


    System.out.println("dimensiunea mapDish este: " + mapIdTODish.size());
    System.out.println("dimensiunea mapIntQty este: " + mapIntQty.size());

    afisareDoarUnu(Ingredients.FLOUR);

    updateQty(Ingredients.SUGAR);

    afisareIng();

    adaugaIngredientNou(Ingredients.CANDY,4);

    System.out.println("Lista cu ingrediente + ingredientul nou adaugat este: ");
    afisareIng();

    adaugaDish(6, PASTA_CARBONARA);

    //System.out.println("mapa de ingrediente cu cantitatea aferenta este : " + mapIntQty);
    //System.out.print(mapIntQty.get("Flour"));
    System.out.println("Lista de dish-uri posibile este: " + mapIdTODish);
    System.out.println("dimensiunea mapDish dupa up este: " + mapIdTODish.size());
    System.out.println("dimensiunea mapIntQty dupa up este: " + mapIntQty.size());


//    List<DishEnum> listaDishRecipe = new ArrayList<>();
//    listaDishRecipe.add(DishEnum.CHICKEN_PIE);



//    switch (true){
//      case "adauga dish":
//      {
//        DishRecipe r = new DishDB(PASTA_CARBONARA,Ingredients.EGGS,2);
//        setRecipe(r);
//        break;
//      }
//    }
    DishRecipe r1 = new DishRecipe(DishEnum.CHICKEN_CURRY);
    r1.addIngredient(Ingredients.FLOUR);
    r1.addAmount(1);
    r1.addIngredient(Ingredients.CHICKEN);
    r1.addAmount(2);

    DishRecipe r2 = new DishRecipe(DishEnum.VANILLA_CAKE);
    r2.addIngredient(Ingredients.FLOUR);
    r2.addAmount(1);
    r2.addIngredient(Ingredients.SUGAR);
    r2.addAmount(1);
    r2.addIngredient(Ingredients.EGGS);
    r2.addAmount(3);
    r2.addIngredient(Ingredients.VANILLA);
    r2.addAmount(1);

    DishRecipe r3 = new DishRecipe(DishEnum.PASTA_ARRABIATA);
    r3.addIngredient(Ingredients.TOMATOES);
    r3.addAmount(2);
    r3.addIngredient(Ingredients.PASTA);
    r3.addAmount(1);
    r3.addIngredient(Ingredients.SALT);
    r3.addAmount(1);

    DishRecipe r4 = new DishRecipe(DishEnum.CHICKEN_CURRY);
    r4.addIngredient(Ingredients.CHICKEN);
    r4.addAmount(1);
    r4.addIngredient(Ingredients.RICE);
    r4.addAmount(1);
    r4.addIngredient(Ingredients.CURRY_SAUCE);
    r4.addAmount(2);

    DishRecipe r5 = new DishRecipe(DishEnum.FRIED_RICE);
    r5.addIngredient(Ingredients.RICE);
    r5.addAmount(1);
    r5.addIngredient(Ingredients.EGGS);
    r5.addAmount(3);


   // System.out.println("reteta pentru r5 este: " + r5.toString());
    String t =  r5.giveName("Fride_Rice");
    System.out.println(t);
    //System.out.println(r5.giveName());
    System.out.println("primul dish din lista este: " + mapIdTODish.get(1));

      normalOrSpecial(6,DishEnum.CHICKEN_CURRY);


  }

}

