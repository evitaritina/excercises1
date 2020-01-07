package Chapter7;

/**
 * Instance methods → In a box
 * You are given a class named Box that has three double fields.
 *
 * Create an instance method to calculate the volume of the box. The method must be named getVolume.
 * It should take no arguments and return a double result.
 *
 * Do not make the fields and method private!
 */

public class InstanceMethods3 {
    class Box {

        double height;
        double width;
        double length;

        // write a method here
        public double getVolume(){
            double res;
            res = this.height * this.width * this.length;
            return res;

        }
    }
}
/*
class Box {

    double height;
    double width;
    double length;

    double getVolume() {
        return height * width * length;
    }
}
 */