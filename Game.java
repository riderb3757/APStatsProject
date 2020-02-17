import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a description of class game here.
 *
 * @author Rider Bishop
 * @version 2/16/2020
 */
public class Game
{
    // instance variables - replace the example below with your own
    
    private ArrayList<Card> cards = new ArrayList<>();
    private boolean done;
    

    /**
     * Constructor for objects of class game
     */
    public Game()
    {
        cards.add(new Card(true));
        
        for(int i = 0; i < 4; i++){
            cards.add(new Card());
        }
        
        done = false;
    }
    
    public void shuffle(){
        Collections.shuffle(cards);
    }

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
    
    public int winnings(){
        done = true;
        if(cards.size() == 5){
            return 100;
        }
        
        else if(cards.size() == 4){
            return 50;
        }
        
        else if(cards.size() == 3){
            return 20;
        }
        
        else if(cards.size() == 2){
            return 10;
        }
        
        else{
            return 5;
        }
    }
    
    public int runGame(){
        while(!done){
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
