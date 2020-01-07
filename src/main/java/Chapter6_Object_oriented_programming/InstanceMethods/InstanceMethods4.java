package Chapter7;

/**
 * Instance methods → Application as a class
 * You are given a class named Application with one string field name.
 * Create an instance method named run that takes an array of strings and returns nothing.
 * The method should output the name of the application and then all arguments, each on a new line.
 *
 * Here is an example of this method's output:
 *
 * SimpleApplication
 * arg1
 * arg2
 * arg3
 *
 * Sample Input 1:
 * SimpleApplication
 * arg1 arg2 arg3
 *
 * Sample Output 1:
 * SimpleApplication
 * arg1
 * arg2
 * arg3
 */
public class InstanceMethods4 {
    class Application {

        String name;

        // write a method here
        public void run(String[] args){
            new Application();
            System.out.println(this.name);
            for(String el : args){
                System.out.println(el);
            }

        }
    }
}

/*
class Application {

    String name;

    public void run(String[] args) {
        System.out.println(name);

        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
 */