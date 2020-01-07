package Chapter7;

/**
 * Constructor → Account and its owner
 * There are two classes: Account with three fields (code, balance, owner) and
 * User with three fields (login, firstName, lastName).
 * Both classes have parameterized constructors.
 * See full declarations of these classes in the code template.
 * Do not be afraid of the static keyword. It's not important now.
 *
 * In the main method, create an instance of the Account class and pass it to the process method by calling process(account).
 * This method is already defined but hidden.
 *
 * The instance must have the following values of the fields:
 *
 * code: "123456",
 * balance: 1000,
 * owner: (login: "demo-user", firstName: "Alexander", lastName: "Schmidt").
 * Note that the owner is an instance of the User class.
 *
 * See provided template, do not change it.
 */

public class Constructor5 {
    //}
    public static void main(String[] args) {

        // create an instance of Account here
        User user = new User("demo-user", "Alexander", "Schmidt");
 //       Account account = new Account(123456, 1000, user);

        // pass it into process method
   //     process(account);
    }

    static class Account {

        private String code;
        private Long balance;
        private User owner;

        public Account(String code, Long balance, User owner) {
            this.code = code;
            this.balance = balance;
            this.owner = owner;
        }

        public String getCode() {
            return code;
        }

        public Long getBalance() {
            return balance;
        }

        public User getOwner() {
            return owner;
        }
    }

    static class User {

        private String login;
        private String firstName;
        private String lastName;

        public User(String login, String firstName, String lastName) {
            this.login = login;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getLogin() {
            return login;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }
}