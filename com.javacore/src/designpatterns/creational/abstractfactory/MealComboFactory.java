package designpatterns.creational.abstractfactory;

public interface MealComboFactory {
     MainCourse createMainCourse();
     Drink prepareDrink();
}
