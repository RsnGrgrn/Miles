public class Main {
    public static void main(String[] args) {
        int ticketPrice = 40000;
        int milesPrice = 20;
        int addMiles = 0;

        if (ticketPrice >= 20){
            addMiles = ticketPrice / milesPrice;
        }
        System.out.println("Количество бонусных миль = " + addMiles);
    }
}