package sealedClass;


// sealed class must have a subclass
//  class inheriting sealed class
//       ---------> can be either sealed,non-sealed,final
// permits should be the last keyword of the class after extends and implement


sealed class A extends Object implements SealedInterface permits B,C{

}
// here if I write final then none of the class can iherit B
final class B extends A{

}
//here if C allows only then class can inherit it
sealed class C extends A permits D{

}

// if a class is non-sealed then cny of the class can inherit it
non-sealed class D extends C{

}
class E extends D{

}



public class Main {

}
