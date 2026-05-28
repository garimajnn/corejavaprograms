package designpatterns.creational.abstractfactory;

import designpatterns.creational.factory.Main;

public class NonVegCombo implements MealComboFactory{

    public MainCourse createMainCourse(){
        return new ChickenBurger();
    }
    public Drink prepareDrink(){
        return new Shake();
    }


}
