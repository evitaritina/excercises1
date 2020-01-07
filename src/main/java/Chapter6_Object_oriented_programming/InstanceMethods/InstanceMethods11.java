package Chapter7;

/**
 * Instance methods → Circle
 * Given is a class named Circle. This class has one field radius.of the double type.
 *
 * Create two instance methods for this class:
 *
 * getLength that returns the double representing the length of the circumference﻿ of this circle;
 * getArea that returns the double representing the area of this circle.
 * In your calculations, you may use the special constant Math.PI.
 *
 * Do not make the field and methods private.
 */
public class InstanceMethods11 {
    class Circle {

        double radius;

        // write methods here
        public double getLength(){
           return 2*radius* Math.PI;
        }
        public double getArea(){
            return Math.PI * radius * radius;

        }
    }
}
