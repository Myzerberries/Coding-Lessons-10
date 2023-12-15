public class Main {

    //A constructor is used in the creation of an object, that's an instance of a class.
    //It is a special type of code block that has a specific name and parameters, much like a method.
    //It has the same name as the class itself, and it doesn't return any values.
    //You never include a return type from a constructor, not even void.
    //You can, and should, specify an appropriate access modifier to control who should be able to
    //create new instances of the class.

    //public Account() {            <-----This is the class declaration.
    //Constructor code is code to be executed as the object is created.}

    public static void main(String[] args) {

        //When you type new, and the name of the class, and then parentheses, this is actually calling the constructor.
        //We didn't explicitly create a constructor in the BankAccount class, so Java created one for us. This is called
        //the default constructor.
        //If a class contains no constructor declarations, then a default constructor is implicitly declared.
        //This constructor has no parameters, and is often called the no-args constructor.
        //If a class contains any other constructor declarations, then a default constructor is not implicitly declared.

        //The purpose of the constructor is to initialize the object that we're creating, and do whatever else we need
        //to happen, while the object is being instantiated. This means we don't have to write as many calls to setters.
        //It's only called once, at the start, when we're creating the object.

        //A class can have one or many constructors, one of which can be a no args constructor.

        //Below we changed the constructor called to be the one with parameters in it, when we instantiated this object.
        //This sets the field values to the values passed in by these parameters.
        BankAccount bankAccount = new BankAccount(1, 52, "Joe", "Joe@Joe.com",
                555_888_1234L);

        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getAccountBalance());

        //Because the object above was instantiated with a constructor containing parameters, the setters below are commented
        //out, as they are no longer needed.
        //bankAccount.setAccountBalance(3_125.00);
        //bankAccount.setAccountNumber(196_552_3178);
        //bankAccount.setCustomerEmail("JBobert@gmail.com");
        //bankAccount.setCustomerName("Joseph Bobert");
        //bankAccount.setCustomerPhoneNumber(555_888_1234L);


        System.out.println("New balance after deposit is " + bankAccount.depositFunds(89));
        System.out.println("New balance after withdrawal is " + bankAccount.withdrawFunds(50.00));

        BankAccount myAccount = new BankAccount("Peepeehead", "Pee@poo.toilet",
                123_456_78911L);
        System.out.println("Account No: " + myAccount.getAccountNumber() + "; name " + myAccount.getCustomerName());

    }

}
