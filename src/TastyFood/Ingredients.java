package TastyFood;

import java.util.List;

public enum Ingredients {

    FLOUR("FLOUR"), EGGS("EGGS"), TOMATOES("TOMATOES"),
    PASTA("PASTA"), CHICKEN("CHICKEN"), CURRY_SAUCE("CURRY_SAUCE"),
    RICE("RICE"), SALT("SALT"), SUGAR("SUGAR"), VANILLA("VANILLA"),
    CANDY("CANDY");


    private String nameIngrediente;

    private Ingredients(String nameIngrediente) {

        this.nameIngrediente = nameIngrediente;
    }
    public String getName(String nameIngrediente) {
        return this.nameIngrediente;
    }
    private String returnName(){
       return nameIngrediente;
    }
}