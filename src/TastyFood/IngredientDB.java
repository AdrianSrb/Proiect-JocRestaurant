package TastyFood;

import java.util.Map;
import java.util.HashMap;
import java.util.*;


public class IngredientDB {

    static Map<Ingredients, Integer> mapIntQty = new HashMap<>();

    static {
        mapIntQty.put((Ingredients.FLOUR), 5);
        mapIntQty.put((Ingredients.EGGS), 2);
        mapIntQty.put((Ingredients.TOMATOES), 2);
        mapIntQty.put((Ingredients.PASTA), 2);
        mapIntQty.put((Ingredients.CHICKEN), 2);
        mapIntQty.put((Ingredients.CURRY_SAUCE), 2);
        mapIntQty.put((Ingredients.RICE), 3);
        mapIntQty.put((Ingredients.SALT), 2);
        mapIntQty.put((Ingredients.SUGAR), 2);
        mapIntQty.put((Ingredients.VANILLA), 2);
    }

    public static void afisareIng() {
        System.out.println("Lista cu ingrediente posibile este " + mapIntQty);
    }

    public static void afisareDoarUnu(Ingredients s) {
        System.out.println("Cantitatea ingredientului ales este: " + mapIntQty.get(s));
    }

    public static void updateQty(Ingredients s) {
        int q;
        q = mapIntQty.get(s);
        ++q;
        System.out.println("Dupa update ingredientul inserat are cantitatea : " + q + " \n ");
    }

    public static void adaugaIngredientNou(Ingredients ingredients, int i){

        mapIntQty.put(ingredients,i);
    }

}












