package Chapter7;

/**
 * Instance methods → Simulating a clock
 * You are given a class Clock. It has two int fields: hours and minutes.
 * The clock has a minute scale from 0 to 59 and an hour scale from 1 to 12.
 * The clock does not know whether it's day or night (no AM or PM).
 *
 * Add the method next that increases the value of minutes by 1.
 * The minutes must be reset to zero when the current hour ends. Do not forget to change hours as well.
 *
 * Do not make the fields and methods private.
 */
public class InstanceMethods13 {
    class Clock {

        int hours = 12;
        int minutes = 0;

        // the next method here
        public void next(){
            minutes = minutes + 1;
            if(minutes > 59){
                minutes = 0;
                hours = hours < 12 ? hours +1 : 1;

            }

        }
    }
}
/*
class Clock {

    int hours = 12;
    int minutes = 0;

    public void next() {
        if (minutes < 59) {
            minutes += 1;
        } else {
            minutes = 0;

            if (hours < 12) {
                hours += 1;
            } else {
                hours = 1;
            }
        }
    }


}
 */