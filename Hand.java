import java.util.ArrayList;

/**
 * Hand models a hand of cards held by a player.
 * 
 * @author Lynn Marshall 
 * @author Ahmed Abdelrazik
 * @version 1.1 October 19, 2019
 *
 */
public class Hand
{
    /** 
     * The cards are stored in an array-list implementation of the
     * List collection.
     */
    private ArrayList<Card> cards;

    /**
     * Constructs a new, empty hand.
     */
    public Hand()
    {   
        cards = new ArrayList<Card>();
    }
    
    /**
     * Adds the specified card to this hand.
     */
    public void addCard(Card aCard)
    {
        cards.add(aCard);
    }
     
   /**
     * Removes a card from this hand. Cards are removed in the order in
     * which they were added to the hand.
     */
    public Card playCard()
    {
        Card aCard = cards.get(0);
        cards.remove(0);
        return aCard;
    }

    /**
     * Returns the number of cards that are currently in this hand.
     */    
    public int size()
    {
        return cards.size();
    }

    /**
     * Determines if this hand is empty.
     */    
    public boolean isEmpty()
    {
        return cards.isEmpty();
    }

    /**
     * Returns a String that lists the ranks (but not the suits) of all the 
     * cards in this hand, starting with the first card and finishing with
     * the last card. For example, if the first card is the two of hearts, 
     * the second card is the five of diamonds, and the last card is the
     * queen of clubs, the String returned by this method will be: "2 5 12".
     */
    public String toString()
    {
        String cardRank = "";
        for(int i = 0; i < size(); i++)
        {
            Card aCard = cards.get(i);
            cardRank += aCard.rank();
            cardRank += " ";
        }
        return cardRank.trim();
    }
}
