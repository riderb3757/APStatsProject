import java.util.Scanner; 

/**
 * Write a description of class Start here.
 *
 * @author Rider Bishop
 * @version 2/16/2020
 */
public class Start
{
    // instance variables - replace the example below with your own
    
    private float numberOfTrials;
    private float totalMoney;    
    
    public Start(){
        totalMoney = 0;
    }

    /**
     * Run this method to run trials of the simulation. 
     */
    public void main(){
        totalMoney = 0;
        
        
        System.out.println("Here is the program to run a simulation of Problem 20\n\n");
        
        System.out.println("An ace and 4 cards are shuffled and placed face down on a table");
        System.out.println("The customer gets to turn over one card at a time, looking for the ace.");
        System.out.println("The person wins $100 if the ace is picked first, $50 if second and $20, 10 or 5 if it is the third, fourth or fifth card chosen.");
        
        System.out.println("Enter a number of trials.");
        Scanner sc = new Scanner(System.in);
        numberOfTrials = sc.nextInt();
        
        for(int i = 0; i < numberOfTrials; i++){
            Game g = new Game();
            g.shuffle();
            
            System.out.println(g.printCards());
            
            totalMoney+=g.runGame();
        }       
        
        System.out.println("The total amount of money from all " + numberOfTrials + " simulations is $" + totalMoney);
        System.out.println("The average amount of money gained from each trial is $" + totalMoney/numberOfTrials);
    }
}
