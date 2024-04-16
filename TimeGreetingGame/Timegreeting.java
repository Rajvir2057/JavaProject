import java.util.Scanner;

public class Timegreeting{
    public static void main(String[] args){

        //To show what output format is needed.
        System.out.println("please enter the time in 24 hr timing..");

        // creating a scanner to take the hour and min from the user.
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name please: ");
        String name = input.nextLine();

        System.out.print("Enter the hour: ");
        int hour = input.nextInt();

        System.out.print("Enter the minute: ");
        int minute = input.nextInt();
        
        // if for getting the input to greet..
        
        if((hour >= 1) && (hour <= 11) && (minute >=0)){
            System.out.println(name + ", Good Morning!");
        }

        else if((hour >= 12) && (hour <= 16) && (minute >= 0)){
            System.out.println(name + ", Good Afternoon!");
        }

        else if((hour >= 17) &&(hour <= 19) && (minute >= 0)){
            System.out.println(name + ", Good Evening!");
        }
        
        else if((hour >= 21)&&(hour <= 24) && (minute >= 0)){
            System.out.println(name + ", Good Night!");
        }

        else{
        System.out.println("hmmm... wonder y.");
        }
        // if you dont know the time... 
        input.close();
    }
}