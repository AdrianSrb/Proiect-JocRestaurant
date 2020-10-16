package TastyFood;


public enum DishEnum {
    CHICKEN_PIE ("CHICKEN_PIE"),
    VANILLA_CAKE("VANILLA_CAKE"),
    PASTA_ARRABIATA("PASTA_ARRABIATA"),
    CHICKEN_CURRY("CHICKEN_CURRY"),
    FRIED_RICE("FRIED_RICE"),
    PASTA_CARBONARA("CARBONARA");

    private String nameDish;

    private DishEnum(String nameDish) {
        this.nameDish=nameDish;
    }
    private String getName(String nameDish) {
        return this.nameDish;
    }

    public boolean isEmpty() {
        System.out.println("nume invalid");
        return false;
    }
}

