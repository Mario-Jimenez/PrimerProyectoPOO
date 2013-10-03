package entities;

import structs.EquipmentNode;

/**
 * Represents a specific type of classroom entity
 * @author Mario Jiménez & Osvaldo Barrantes
 * @version 1.0 September, 2013
 * @see Classroom
 */
public class PracticalClassroom extends Classroom {
    
    /** The head(first node) of the list*/
    private EquipmentNode head;

    /**
     * Constructor
     * @param id classroom's id
     * @param name classroom's name
     * @param location classroom's location
     * @param capacity classroom's capacity
     */
    public PracticalClassroom(String id, String name, String location, int capacity) {
        super(id, name, location, capacity);
        this.head = null;
    }

    /**
     * Getter
     * @return the head of the list
     */
    public EquipmentNode getHead() {
        return head;
    }

    /**
     * Setter
     * @param head an EquipmentNode instance
     * @see EquipmentNode
     */
    public void setHead(EquipmentNode head) {
        this.head = head;
    }
    
    /**
     * Assigns a new equipment to this practical classroom
     * @param equipment an Equipment instance
     * @see Equipment
     */
    public void addEquipment(Equipment equipment) {
        EquipmentNode newNode = new EquipmentNode(equipment);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }
    
    /**
     * Edits the quantity of an equipment
     * @param name the name of the equipment
     * @param quantity the new quantity to be assign
     */
    public void editEquipment(String name, int quantity) {
        EquipmentNode temp = head;
        while (temp.getInfo().getName().compareTo(name) != 0) {            
            temp = temp.getNext();
        }
        temp.getInfo().setQuantity(quantity);
    }
    
    /**
     * Removes an equipment previously assigned to this practical classroom
     * @param name the name of the equipment
     */
    public void deleteEquipment(String name) {
        if (head.getInfo().getName().compareTo(name) == 0) {
            head = head.getNext();
        } else {
            EquipmentNode temp = head;
            EquipmentNode prev = null;
            while (temp.getInfo().getName().compareTo(name) != 0) {                
                prev = temp;
                temp = temp.getNext();
            }
            prev.setNext(temp.getNext());
        }
    }
    
}
