/*
 * Driver class to instantiate four products (two necessary and two luxury) and store them into a Product array, print out each item in the array, and display the total cost of the items
 */
public class Driver {
    public static void main(String[] args) {
        double totalCost = 0;
        Product[] Product = new Product[4];

        // creates four products (two necessary and two luxury)
        Product p1 = new NecessaryProduct("Cheese", 1.50);
        Product p2 = new LuxaryProduct("Soda", 3.50);
        Product p3 = new NecessaryProduct("Bread", 2.25);
        Product p4 = new LuxaryProduct("Candy", 2.00);
        
        // adds the products to the arrays
        Product[0] = p1;
        Product[1] = p2;
        Product[2] = p3;
        Product[3] = p4;

        // prints out the array and adds up the total cost
        for (int i = 0; i < 4; i++){
            System.out.println(Product[i]);
            totalCost += Product[i].getTotalPrice();
        }

        // prints cost of all items with tax combined, rounded to two decimals 
        System.out.printf("\nThe total cost is $%.2f\n", totalCost); 
    }
}
