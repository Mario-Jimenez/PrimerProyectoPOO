package entities;

/**
 * Represents the equipment entity
 * @author Mario Jiménez & Osvaldo Barrantes
 * @version 1.0 September, 2013
 */
public class Equipment {
    
    private String name;
    private int quantity;

    /**
     * Constructor
     * @param name equipment's name
     * @param quantity equipment's quantity
     */
    public Equipment(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    /**
     * Getter
     * @return equipment's name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter
     * @param name equipment's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter
     * @return equipment's quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Setter
     * @param quantity equipment's quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
