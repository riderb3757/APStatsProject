/**
 * Here is the class file for the Card object.
 *
 * @author Rider Bishop
 * @version 2/16/2020
 */
public class Card
{    
    private boolean isAce;
    
    /**
     * If no parameter is entered, than the card will be a non-ace card
     */
    public Card()
    {
        isAce = false;
    }
    
    /**
     *  If the card is an ace, then set the boolean "isAce" to true
     */
    public Card(boolean isAce){
        this.isAce = isAce;
    }
    
    /**
     *  Return a boolean depending on if the card is an ace or not
     */    
    public boolean value(){
        return isAce;
    }
}
