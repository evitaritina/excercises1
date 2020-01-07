package Chapter7;

/**
 * Instance methods → Complex numbers
 * Jake wants to write a program that works with complex numbers. He created a class Complex that represents a complex number with its real and imaginary parts. Now he needs instance methods so that he can calculate the sum and difference of two complex numbers.
 *
 * Help Jake and create two instance methods for his class:
 *
 * add that takes another complex number as an argument and adds its corresponding fields to the current instance;
 * subtract that takes another complex number as an argument and subtracts its corresponding fields from the current instance;
 * Both methods should return nothing.
 *
 * Do not make the fields and methods private.
 */
public class InstanceMethods5 {
    class Complex {

        double real;
        double image;



        // write methods here
        public void add(Complex other){

            //       complex1.add(complex2);
            real = this.real + other.real;
            image =  this.image + other.image;
        }

        public void subtract(Complex complex2){
            //    complex1.subtract(complex2);
            real = this.real - complex2.real;
            image =  this.image - complex2.image;

        }
    }

}
/*
class Complex {

    double real;
    double image;

    void add(Complex other) {
        this.real += other.real;
        this.image += other.image;
    }

    void subtract(Complex other) {
        this.real -= other.real;
        this.image -= other.image;
    }
}
 */
