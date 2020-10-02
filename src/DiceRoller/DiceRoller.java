package DiceRoller;
import java.util.Scanner;


public class DiceRoller {
    
    public static void main(String[] args) {
        int numDie;
        int numFaces;
        int Total;
        int Output;
        String Exit = "";
        Scanner DieType = new Scanner(System.in);
        System.out.println("Enter die in format '#d##'. Press enter to begin or"
            + " type 'stop' to end program.");
        
        while (true){
            Exit = DieType.nextLine();
            if (Exit.equalsIgnoreCase("stop")){
                break;
            }
            else{
                DieType.useDelimiter("[d\\s+]");
                numDie = DieType.nextInt();
                numFaces = DieType.nextInt();
        
                Die die1 = new Die();
                Total = 0;
                for(int i=0;i<numDie;i++){
                    Output = die1.roll(numFaces);
                    Total = Total + Output; 
                    System.out.println(Output);
                }
                System.out.println("Total: " + Total);
		System.out.println("Enter another die or type 'stop' to exit.");
                Exit = DieType.nextLine();
                if (Exit.equalsIgnoreCase("stop")){
                    break;
                }
            }
        }   
        
    }   
}