/**
 * NecessaryProduct class that represents items that are to not be taxed
 */

public class NecessaryProduct implements Product {
    private String name;
    private double basePrice; 

    /**
     * Constructor that takes in two parameters to intialize the fields of this object
     * @param name name of the item
     * @param basePrice price of the item without tax
     */
    public NecessaryProduct(String name, double basePrice){
        this.name = name;
        this.basePrice = basePrice;
    }

    /**
     * Method to get the totalPrice of the Product with applicable tax
     * (Necessary products are not taxed)
     */
    @Override
    public double getTotalPrice() {
        return basePrice;
    }

    /**
     * Method to see if the product is taxable
     * Since this is a Necessary product, it is not taxable
     */
    @Override
    public boolean isTaxable() {
        return false;
    }

    /**
     * Method to return the name and price without tax of the item, rounded to two decimals
     */
    @Override
    public String toString() {
        return name + " $" + String.format("%.2f", basePrice);
    }
    
}
