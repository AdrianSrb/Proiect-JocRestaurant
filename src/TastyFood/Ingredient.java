package TastyFood;

import TastyFood.Ingredients;

public class Ingredient {

    private int id;
    static Ingredients nameIng;

    public Ingredient(int id, Ingredients nameIng,int amount) {
        this.id=id;
        this.nameIng=nameIng;
    }
    public void setId(int id) {

        this.id = id;
    }
    public static void setNameIng(Ingredients nameIng) {

        Ingredient.nameIng = nameIng;
    }

    public int getId(int id) {

        return this.id;
    }
    public Ingredients getNameIng(Ingredients nameIng) {
        System.out.println(this.nameIng);
        return null;
    }

    public boolean equals(Ingredients ing) {

        return super.equals(ing);
    }

    @Override
    public int hashCode() {

        return super.hashCode();
    }
}
