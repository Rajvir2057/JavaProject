import java.util.Scanner;

interface timestructure{

    String Time = "Simple_Time_Game";
    void timegameInput();
    void timecalculationMethod();
}

class Timegame implements timestructure{

    // declaring the fields.
    protected String name;
    protected int hour;
    protected int minute;

    // creating a constructor.
    public Timegame(String name, int hour, int minute){
        this.name = name;
        this.hour = hour;
        this.minute = minute;
    }
    @Override
    public void timegameInput(){
        
        //To show what output format is needed.
        System.out.println("\t"+"Please, Enter The Time In 24 Hour Timing");
        
        System.out.println("\t"+"...........");
        System.out.println("\t"+".    12   .");
        System.out.println("\t"+".11      1.");
        System.out.println("\t"+".10      2.");
        System.out.println("\t"+".9   *   3.");
        System.out.println("\t"+".8       4.");
        System.out.println("\t"+".7       5.");
        System.out.println("\t"+".    6    .");
        System.out.println("\t"+"...........");

        // creating a scanner to take the hour and min from the user.
        Scanner gameinput = new Scanner(System.in);
        
        System.out.print("Enter your name please: ");
        name = gameinput.nextLine();

        System.out.print("Enter the hour: ");
        hour = gameinput.nextInt();

        System.out.print("Enter the minute: ");
        minute = gameinput.nextInt();

        gameinput.close();
        
    }

    @Override
    public void timecalculationMethod(){
        // inorder to over ride in the sub class..
}
}

class Timecalculation extends Timegame{

    public Timecalculation(String name , int hour,int minute){
        super(name, hour, minute);
    }
    //using the timecalc method created..
    @Override
    public void timecalculationMethod(){
        
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
    
    }
}
//base class for implementation.
public class Timegreeting{
    public static void main(String[] args){
        // forming the objects out of the classes..
        Timecalculation timegame = new Timecalculation("",0,0 );

        System.out.println("\t"+"    Welcome to the " + "\""+timestructure.Time+ "\"");

        timegame.timegameInput();
        timegame.timecalculationMethod();
    }
}

