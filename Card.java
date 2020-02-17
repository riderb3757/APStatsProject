
/**
 * Write a description of class Card here.
 *
 * @author Rider Bishop
 * @version 2/16/2020
 */
public class Card
{
    // instance variables - replace the example below with your own
    
    private boolean isAce;

    /**
     * Constructor for objects of class Card
     */
    public Card()
    {
        isAce = false;
    }
    
    public Card(boolean isAce){
        this.isAce = isAce;
    }
    
    public boolean value(){
        return isAce;
    }

}
