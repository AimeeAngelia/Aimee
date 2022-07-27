package Study;

public class Restaurant {
    public static void main(String[] args) {
        System.out.println("Welcome, how many people are there for dinner?");
        int numberOfPeople = 9;
        System.out.println("There are " + numberOfPeople + " people for dinner.");
        if (numberOfPeople <= 4){
            System.out.println("Please dine at a table for 4 in the lobby.");
        }else if (numberOfPeople >4 && numberOfPeople <= 8){
            System.out.println("Please dine at a table for 8 in the lobby.");
        }else if (numberOfPeople >8 && numberOfPeople <= 16){
            System.out.println("Please dine in the upstairs box.");
        }else {
            System.out.println("Sorry, our store temporarily has such a big box.");
        }
    }

}
