import java.util.ArrayList;
import java.util.Collections;

/**
 * Here is a class to create a single trial of the game.
 *
 * @author Rider Bishop
 * @version 2/20/2020
 */
public class Game
{    
    private ArrayList<Card> cards = new ArrayList<>();
    private boolean done;
   
    /**
     * Create a Object and add cards to the ArrayList of cards.
     */
    public Game()
    {
        cards.add(new Card(true));
        
        for(int i = 0; i < 4; i++){
            cards.add(new Card());
        }        
        done = false;
    }
    
    /**
     *  Randomize the ArrayList to simulate shuffling the cards. 
     */
    public void shuffle(){
        Collections.shuffle(cards);
    }
    
    /**
     *  Convert the value of the cards to a string, with "ace" referring to an ace and "*" referring to a non-ace card. 
     */
    public String printCards(){
        String result = "";
        
        for(Card c: cards){
            if(c.value()){
                result+="ace ";
            }
            else{
                result+="* ";
            }
        }
        return result;
    }
    
    /** 
     *  Calculate the amount of money won from the game based on how many cards are left. 
     */    
    public int winnings(){
        done = true;
        
        //If the first card picked is an ace, than the player wins $100. 
        if(cards.size() == 5){
            return 100;
        }
        
        //If the second card picked is an ace, than the player wins $50.
        else if(cards.size() == 4){
            return 50;
        }
        
        //If the third card picked is an ace, than the player wins $20.
        else if(cards.size() == 3){
            return 20;
        }
        
        //If the fourth card picked is an ace, than the player wins $10.
        else if(cards.size() == 2){
            return 10;
        }
        
        //If the last card is an ace, than the player wins $5.
        else{
            return 5;
        }
    }
    
    /**
     *  Play the game to determine how much money is won.
     */
    public int runGame(){
        while(!done){
            //if the selected card is an ace, the game is over and the winnings are returned. 
            if(cards.get(0).value()){
                return winnings();
            }
            else{
                cards.remove(0);
            }
        }
        return 0;
    }
}
