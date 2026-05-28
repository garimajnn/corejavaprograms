package designpatterns.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        MealComboFactory vegFactory=Factory.getCombo("veg");
        vegFactory.createMainCourse().getMainCourse();
        vegFactory.prepareDrink().getDrink();;

        // client->factory->abstractfactory(which wil create multiple objects)
    }
}
