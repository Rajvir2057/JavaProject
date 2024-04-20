import java.util.Scanner;

public class Bank{

    // declaring the options..
    public String name;
    public int age;
    public double cash;
    public double withdraw;
    public double deposit;
  
    // scanner 
    Scanner customerdata = new Scanner(System.in);

    // constructor..
    public Bank( String n, int a ,double c, double w , double d){
        this.name = n;
        this.age = a;
        this.cash = c;
        this.withdraw = w;
        this.deposit = d;
    }

    // creating methods.
    // this one is for taking data from the customer.

    public void customerInformation(){

        System.out.println("Welcome to Rajbank.");

        System.out.print("Enter your name: ");
        name = customerdata.nextLine();

        System.out.print("Enter your age: ");
        age = customerdata.nextInt();

        System.out.print("Enter the cash you have in the bank: ");
        cash = customerdata.nextInt();

        System.out.println("Select the choices below: ");
        System.out.println("1.withdraw");
        System.out.println("2.deposit");
        System.out.println("3.exit");

        System.out.print("Enter your choice: ");
        int choice = customerdata.nextInt();

        switch(choice){
            case 1:
            withdrawMethod();
                break;
            case 2:
            depositMethod();
                break;
            case 3:
                System.exit(0); //(0 here means ending the code succesfully)
                break;
            default:    // Code to execute if none of the case values match expression
                System.out.println(name + ", you have entered an invalid choice.");
                break;
        }
    }

    public void withdrawMethod(){
        System.out.print("Enter the amount to withdraw: ");
        withdraw = customerdata.nextInt();

        cash = withdrawingCash();
        System.out.println(name + " you have withdrawn: " + withdraw + " your balance now is =  " + cash);

    }

    public void depositMethod(){
        
        System.out.print("Enter the amount to deposit: ");
        deposit = customerdata.nextInt();

        cash= depositingCash();
        System.out.println(name + " you have deposited: " + deposit + " your balance now is =  "+ cash);

    }

    // calculating the withdraw and deposit..
    public double withdrawingCash(){
        return cash - withdraw;
    }
    
    public double depositingCash(){
        return cash + deposit;
    }

    // creating condtions for succesful entry 
    public void bankConditions(){

        if(age <= 17){
            System.out.println(name + ", you are under 18 years old to hava a bank account.");
        }

        if (cash == 0){
            System.out.println(name + ", you have no cash in your bank account.");
        }
        else{
            System.out.println(name + ", you have cash in your bank account.");
        }

        if (withdraw == 0){
            System.out.println(name + ", you have no cash to withdraw.");
        }
        else{
            System.out.println(name + ", you have cash to withdraw.");
        }
        if (deposit == 0){
            System.out.println(name + ", you have no cash to deposit.");
        }
    }

    public static void main(String[] args){

        Bank Customer = new Bank("", 0, 0, 0, 0);

        Customer.customerInformation();
        Customer.bankConditions();

        System.out.println(Customer.name + ", Thank you for choosing RajBank.");

    }
}
// need a try block here.  for negative time and string input..