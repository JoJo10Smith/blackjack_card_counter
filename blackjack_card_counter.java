
import java.util.Scanner;
import java.util.HashMap;

class blackjack_card_counter {

    int getStats(int current_player_count, ){
        //Declare variables that will be used to calculate statistics
        int totalCards,cardUnder21,cardEqual21,cardOver21;
        totalCards = 0;
        cardUnder21 = 0;
        cardEqual21 = 0;
        cardOver21 = 0;
        //loop through the count of each card and increment variables
        for (Map.Entry mapElement : cardCount.entrySet()) {
            int currentCardValue = (int)mapElement.getKey();
            int cardCardCount = ((int)mapElement.getValue());

            totalCards += currentCardCount;

            if (currentCardValue < 21){
                cardUnder21 += currentCardCount;
            }else if(currentCardValue > 21){
                cardOver21 += currentCardCount;
            }else{
                cardEqual21 += currentCardCount;
            }
        //print the stats to the user
        System.out.println("Under count: ");
        System.out.println("Equal count: ");
        System.out.println("Over count: ");
        return 0;
    }
    }

    boolean updateDeck(int currentPlayerCount, int nextCard){
        if (cardCount.get(nextCard) == 1){
            return false;
        }else{
            if (currentPlayerCount + nextCard > 21){
                return false;
            else{
                cardCount.put(nextCard,cardCount.get(nextCard)-1);
                return true;
            }
            }
        }
    }

    public static void main(String[] args) {
        public static HashMap<Integer, Integer>cardCount = new HashMap<Integer, Integer>();
        boolean GAME_ON = true;
        int player_count = 0;
        int dealer_count = 0;
        //populate the hashmap
        for (int card = 1; card < 12; card++){
            cardCount.put(card,4);
        }

        while (GAME_ON){

        }

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter name, age and salary:");

    // String input
        String name = myObj.nextLine();

    // Numerical input
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

    // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}