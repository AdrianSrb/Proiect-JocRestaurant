package TastyFood;

public class SpecialDish extends Dish {

    double timePr;
    public SpecialDish(int idDish, DishEnum nameDish, int timePr) {
        super(idDish, nameDish);
        this.timePr=timePr;
    }
}
