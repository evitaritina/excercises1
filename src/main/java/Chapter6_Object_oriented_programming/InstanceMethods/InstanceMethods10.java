package Chapter7;

/**
 * Instance methods → Counter
 * You are given a class named Counter. Write two instance methods:
 *
 * inc that increases the value of the field current by one;
 * getCurrent that returns the current value;
 * Do not make the field and methods private.
 */
public class InstanceMethods10 {
    class Counter {

        int current;

        // write your methods here
        public void inc(){
            this.current += 1;
        }
        public int getCurrent(){
            return this.current;
        }

    }
}
/*
class Counter {

    int current;

    public void inc() {
        current++;
    }

    public int getCurrent() {
        return current;
    }
}
 */
