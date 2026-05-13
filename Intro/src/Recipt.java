public class Recipt {

    public static void main(String[] args){
        
        String customer;
        int numberOfItems;
        int tendered;
        
        
        tendered = 40;
        numberOfItems = 17;
        customer = "Stacey";

        double appleCost;
        double iceCreamCost;
        double ricePoundCost;
        double change;

        ricePoundCost = 1.39;
        iceCreamCost = 3.59;
        appleCost = 0.60;

        double appleTotal;
        double iceCreamTotal;
        double riceTotal;
        double totalCost;
        double averageCost;
        
        appleTotal = appleCost * 12;
        iceCreamTotal = iceCreamCost * 2;
        riceTotal = 3 * (ricePoundCost * 2);
        totalCost = riceTotal + iceCreamTotal + appleTotal;
        averageCost = totalCost / numberOfItems;
        change = tendered - totalCost;

        System.out.println("---------------------");
        System.out.println("Customer: " + customer);
        System.out.println("Number of items: " + numberOfItems);
        System.out.println("Total cost: " + totalCost);
        System.out.println("Average Cost Per Item: " + averageCost);
        System.out.println("tendered: " + tendered + "$");
        System.out.println("change: " + change);
        System.out.println("---------------------");

    }

}