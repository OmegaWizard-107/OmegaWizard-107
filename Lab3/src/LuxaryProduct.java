/**
 * LuxaryProduct class that represents items that are to be taxed
 */
public class LuxaryProduct implements Product{
    private String name;
    private double basePrice;

    /**
     * Constructor that takes in two parameters to intialize the fields of this object
     * @param name name of the item
     * @param basePrice price of the item without tax
     */
    public LuxaryProduct(String name, double basePrice){
        this.name = name;
        this.basePrice = basePrice;
    }

    /**
     * Method to get the totalPrice of the Product with applicable tax
     * (Luxary products are taxed)
     */
    @Override
    public double getTotalPrice() {
        return basePrice * 1.0575;
    }

    /**
     * Method to see if the product is taxable
     * Since this is a luxary product, it is taxable
     */
    @Override
    public boolean isTaxable() {
        return true;
    }
    
    /**
     * Method to return the name and price without tax of the item, rounded to two decimals
     */
    @Override
    public String toString() {
        return name + " $" + String.format("%.2f", basePrice);
    }
    
}
