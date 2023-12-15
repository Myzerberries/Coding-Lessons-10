public class BankAccount {
    private int accountNumber = 0;
    private double accountBalance = 0.00;
    private String customerName = "Default";
    private String customerEmail = "Default Email";
    private long customerPhoneNumber = 0;

    //Below is a constructor we've just created:
    public BankAccount(){
        this(12345, 39.28, "Jim Bob Bobert", "JBB@Bob.com", 123_456_7891);  //Here we have chained the constructor by calling the other constructor
        System.out.println("Empty constructor called");                                                             //and passing parameters into it from the no args constructor.
    }                                                                                                               //What this does is calls the other constructor with parameters if the no args constructor is called,
                                                                                                                    //and sets those parameters as the default values. This is optional. this() must always be the first line executed.
    //By creating parameters in the constructor below, we can pass values to these parameters to assign values to our
    //fields, instead of calling a bunch of setters.
    public BankAccount(int number, double balance, String customerName, String email, long phone){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = number;            //Another valid way to assign a value to a field is by calling a setter
        this.accountBalance = balance;          //here, although there are conflicting opinions on doing that: "setNumber(number);"
        this.customerName = customerName;
        customerEmail = email;                  //It's common practice to make the parameter names the same as the field
        customerPhoneNumber = phone;            //names, but it's not required. If you do make them the same, using the
    }                                           //this. notation is required.


    //IntelliJ can create constructors for us, as seen below:
    public BankAccount(String customerName, String customerEmail, long customerPhoneNumber) {
        this(12345, 100.55, customerName, customerEmail, customerPhoneNumber);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.customerPhoneNumber = customerPhoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public long getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhoneNumber(long customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public double depositFunds(double deposit){
        deposit += accountBalance;
        return deposit;
    }

    public double withdrawFunds(double withdraw){
        withdraw = accountBalance - withdraw;
        return withdraw;
    }
}

//Having multiple constructors, as seen above (One empty constructor and one constructor with parameters), is called
//constructor overloading.
//Constructor overloading is declaring multiple constructors, with different formal parameters.
//The number of parameters can be different between constructors, or the number of parameters is the same between
//two constructors, but their types or order of the types differ.

//Constructor chaining is when one constructor explicitly calls another overloaded constructor.
//You can call a constructor only from another constructor.
//You must use the special statement this() to execute another constructor, passing it arguments if required.
//And this() must be the first executable statement, if it's used from another constructor.
