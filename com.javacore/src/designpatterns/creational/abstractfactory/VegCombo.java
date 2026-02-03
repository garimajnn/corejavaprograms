package designpatterns.creational.abstractfactory;

public class VegCombo implements MealComboFactory{
    public MainCourse createMainCourse(){
        return new Burger();
    }
    public Drink prepareDrink(){
        return new OrangeJuice();
    }
}
