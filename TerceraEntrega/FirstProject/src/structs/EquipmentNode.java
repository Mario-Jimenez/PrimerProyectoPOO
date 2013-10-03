package structs;

import entities.Equipment;

/**
 * Represents a node in the sublist of practical classroom's equipment
 * @author Mario Jiménez & Osvaldo Barrantes
 * @version 1.0 September, 2013
 */
public class EquipmentNode {
    
    /**
     * An Equipment instance
     * Information of an equipment entity
     * @see Equipment
     */
    private Equipment info;
    /** Next node in the list */
    private EquipmentNode next;

    /**
     * Constructor
     * @param info an Equipment instance
     * @see Equipment
     */
    public EquipmentNode(Equipment info) {
        this.info = info;
        this.next = null;
    }

    /**
     * Getter
     * @return an Equipment instance
     */
    public Equipment getInfo() {
        return info;
    }

    /**
     * Setter
     * @param info an Equipment instance
     */
    public void setInfo(Equipment info) {
        this.info = info;
    }

    /**
     * Getter
     * @return the next node in the list
     */
    public EquipmentNode getNext() {
        return next;
    }

    /**
     * Setter
     * Assign the next node in the list
     * @param next an EquipmentNode instance
     * @see EquipmentNode
     */
    public void setNext(EquipmentNode next) {
        this.next = next;
    }
    
}
