package Chapter7;

/**
 * Objects → Army
 * You decide to recall the happy days of your childhood and play Heroes. Of course, you need the army.

 * 1. Your task is to create objects: 5 Unit, 3 Knight, 1 General, 1 Doctor.
 *
 * 2. Don't forget to give them names!
 */
   class Unit {
      String nameUnit;

      public Unit(String name){
          nameUnit = name;
      }
  }

  class Knight {
      String nameKnight;

      public Knight(String name){
          nameKnight = name;
      }
  }

  class General {
      String nameGeneral;

      public General(String name){
          nameGeneral = name;
      }
  }

  class Doctor {
      String nameDoctor;

      public Doctor(String name){
          nameDoctor = name;
      }
  }

public class Objects3 {
    public static void createArmy(){
        new Unit("unit1");
        new Unit("unit2");
        new Unit("unit3");
        new Unit("unit4");
        new Unit("unit5");
        new Knight("knight1");
        new Knight("knight2");
        new Knight("knight3");
        new General("general");
        new Doctor("doctor");


    }

}
