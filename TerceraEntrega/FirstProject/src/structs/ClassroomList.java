package structs;

import entities.PracticalClassroom;
import entities.TheoryClassroom;

/**
 * A list of classrooms
 * @author Mario Jiménez & Osvaldo Barrantes
 * @version 1.0 September, 2013
 * @see PracticalClassroom
 * @see TheoryClassroom
 */
public class ClassroomList {
    
    /** The head(first node) of the list*/
    private ClassroomNode head;

    /**
     * Constructor
     */
    public ClassroomList() {
        this.head = null;
    }

    /**
     * Getter
     * @return the head of the list
     */
    public ClassroomNode getHead() {
        return head;
    }

    /**
     * Setter
     * @param head a ClassroomNode instance
     * @see ClassroomNode
     */
    public void setHead(ClassroomNode head) {
        this.head = head;
    }
    
    /**
     * Adds a new theory classroom at the beginning of the list ClassroomList
     * @param classroom it's an instance of TheoryClassroom
     * @see TheoryClassroom
     */
    public void add(TheoryClassroom classroom) {
        ClassroomNode newNode = new ClassroomNode(classroom);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }
    
    /**
     * Adds a new practical classroom at the beginning of the list ClassroomList
     * @param classroom it's an instance of PracticalClassroom
     * @see PracticalClassroom
     */
    public void add(PracticalClassroom classroom) {
        ClassroomNode newNode = new ClassroomNode(classroom);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }
    
    /**
     * Edits the information of a theory classroom
     * @param id classroom's id
     * @param name classroom's name
     * @param airConditioning classroom's air conditioning availability
     * @param multimediaEquipment classroom's multimedia equipment availability
     */
    public void edit(String id, String name, boolean airConditioning, boolean multimediaEquipment) {
        ClassroomNode temp = head;
        while (temp.getInfo().getId().compareTo(id) != 0) {            
            temp = temp.getNext();
        }
        temp.getInfo().setName(name);
        ((TheoryClassroom)temp.getInfo()).setAirConditioning(airConditioning);
        ((TheoryClassroom)temp.getInfo()).setMultimediaEquipment(multimediaEquipment);
    }
    
    /**
     * Edits the information of a practical classroom
     * @param id classroom's id
     * @param name classroom's name
     */
    public void edit(String id, String name) {
        ClassroomNode temp = head;
        while (temp.getInfo().getId().compareTo(id) != 0) {            
            temp = temp.getNext();
        }
        temp.getInfo().setName(name);
    }
    
    /**
     * Looks for a classroom
     * @param id the classroom's id
     * @return the ClassroomNode instance found or null
     * @see ClassroomNode
     */
    public ClassroomNode search(String id) {
        ClassroomNode temp = head;
        while (temp != null) {            
            if (temp.getInfo().getId().compareTo(id) == 0) {
                return temp;
            }
            temp = temp.getNext();
        }
        return temp;
    }
    
    /**
     * Deletes a classroom from this list
     * @param id classroom's id
     */
    public void delete(String id) {
        if (head.getInfo().getId().compareTo(id) == 0) {
            head = head.getNext();
        } else {
            ClassroomNode temp = head;
            ClassroomNode prev = null;
            while (temp.getInfo().getId().compareTo(id) != 0) {
                prev = temp;
                temp = temp.getNext();
            }
            prev.setNext(temp.getNext());
        }
    }
    
    /**
     * Gets the Classrooms amount.
     * @param classroom node of the classroom to get the classrooms amount.
     * @return amount of Classrooms.
     */
    public int getClassroomsAmount() {
        int amount = 0;
        ClassroomNode temp = head;
        
        while( temp != null ) {
            temp = temp.getNext();
            amount++;
        }
        
        return amount;
    }
    
    /**
     * Gets an array with the ClassroomNode.
     * @param amount quantity of ClassroomNode.
     * @return array of ClassroomNode.
     */
    public ClassroomNode[] getClassroomArray(int amount) {
        ClassroomNode[] classroomArray = new ClassroomNode[amount];
        int counter = 0;
        ClassroomNode temp = head;
        
        while( temp != null) {
            classroomArray[counter] = temp;
            temp = temp.getNext();
            counter++;
        }
        
        return classroomArray;
    }
    
    /**
     * Adds a schedule to the classroomNode
     * @param classroom
     * @param day
     * @param start
     * @param amount
     * @return true if successfull.
     */
    public boolean add (ClassroomNode classroom, int day, int start, 
            int amount) {
        boolean schedule[][] = classroom.getInfo().getSchedule();
        int row = start;
        
        
        while (row < amount) {
            if(schedule[row][day] == true){
                return false;
            }
            row++;
        }
        
        while (start < amount) {
            schedule[start][day] = true;
            start++;
        }
        
        return true;
    }
    
}
