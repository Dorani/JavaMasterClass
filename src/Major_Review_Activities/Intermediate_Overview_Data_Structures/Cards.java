package Major_Review_Activities.Intermediate_Overview_Data_Structures;

import java.util.Arrays;

public class Cards {

    public static void main(String[] args) {
        //Create a deck of cards from scratch

        //Initialize arrays with respective card values
        String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

//        //Randomize them for testing purposes
//        int i = (int) (Math.random() * RANKS.length);
//        int j = (int) (Math.random() * SUITS.length);
//        System.out.println(RANKS[i] + "of " + SUITS[j]);

        //Create a deck of cards using the above arrays:
        String[] deck = new String[RANKS.length * SUITS.length];
        for(int i = 0; i < RANKS.length; i++) {
            for(int j = 0; j < SUITS.length; j++) {
                deck[SUITS.length* i+j] = RANKS[i] + " of " + SUITS[j];
            }
        }
        //Output the cards of the deck:
        for (String cards : deck) {
            System.out.println(cards);
        }

        //Shuffle Deck:
            //First, we ensure that the cards in the d  eck after we shuffle are the same as the
            //cards in the deck before the shuffle by using the 'exchange idiom'

            //Second, we ensure that the shuffle is random by choosing uniformly from the cards chosen
        int n = deck.length;
        System.out.println("---------");
        System.out.println("The deck's total length is " + deck.length);
        System.out.println("---------");
        for (int i = 0 ; i < n; i++) {
            int randomCard = (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCard];
            deck[randomCard] = temp;
        }
        //Shuffled deck output
        System.out.println(Arrays.toString(deck));
    }
}
