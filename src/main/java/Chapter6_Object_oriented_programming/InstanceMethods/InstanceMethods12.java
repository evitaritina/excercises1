package Chapter7;

/**
 * Instance methods → Car
 * You want to create a program that models the behavior of cars.
 * For this purpose, you've created a class named Car containing three fields:
 * the int field yearModel, the string field make, and the int field speed.
 *
 * You want to add functionality to your cars, so you need methods. Add the following instance methods to your class:
 *
 * accelerate that adds 5 to the speed each time it's called;
 * brake that subtracts 5 from the speed field each time it's called, the speed cannot be less than zero.
 * Do not make the fields and methods private.
 */
public class InstanceMethods12 {
    class Car {

        int yearModel;
        String make;
        int speed;
        public void accelerate(){
            speed = speed + 5;

        }
        public void brake(){
            speed = (speed - 5) < 0 ? 0 : speed - 5;
        }
    }
}
/*
class Car {

    int yearModel;
    String make;
    int speed;

    public void accelerate() {
        this.speed += 5;
    }

    public void brake() {
        this.speed -= 5;
        this.speed = speed < 0 ? 0 : speed;
    }
}
 */