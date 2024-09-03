package interoperability;


import interoperability.kotlincode.CarKt;
import interoperability.kotlincode.SingletonObj;
import interoperability.kotlincode.StaticCar;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
      StaticCar.topLevel();
      StaticCar.print("java string");

      CarKt carKt = new CarKt("blue", "BMW", 2021);
      System.out.println(carKt.model);
      System.out.println(carKt.getColor());

      CarKt.carCamp();

//        SingletonObj.INSTANCE.doSomething(); // INSTANCE is single instance
        SingletonObj.doSomething(); // after using JvmStatic

//        System.out.println("isAuto = "+CarKt.Companion.isAuto());
        System.out.println("isAuto = "+CarKt.isAuto); // after using @JvmField
        System.out.println("Constant = "+CarKt.constant); // for constant no annotation is required

//        carKt.printMe(null);

        try { // need to add annotation @Throw(exception.clas)
          StaticCar.doIO();
        }catch (IOException e) {
          System.out.println("IOException");
        }

        StaticCar.defaultArg("The numbe is :", 4);
        StaticCar.defaultArg("The numbe is :"); // use @JvmOverloads annotation
    }

}
