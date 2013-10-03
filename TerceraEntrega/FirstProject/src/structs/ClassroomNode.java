package structs;

import entities.Classroom;

/** 
 * Represents a node in the list ClassroomList
 * @author Mario Jiménez & Osvaldo Barrantes
 * @version 1.0 September, 2013
 */
public class ClassroomNode {
    
    /**
     * A Classroom instance
     * Information of a classroom entity
     * @see Classroom
     */
    private Classroom info;
    /** Next node in the list */
    private ClassroomNode next;

    /**
     * Constructor
     * @param info a Classroom instance
     * @see Classroom
     */
    public ClassroomNode(Classroom info) {
        this.info = info;
        this.next = null;
    }

    /**
     * Getter
     * @return a Classroom instance
     * @see Classroom
     */
    public Classroom getInfo() {
        return info;
    }

    /**
     * Getter
     * @return the next node in the list
     */
    public ClassroomNode getNext() {
        return next;
    }

    /**
     * Setter
     * @param info a Classroom instance
     * @see Classroom
     */
    public void setInfo(Classroom info) {
        this.info = info;
    }

    /**
     * Setter
     * Assign the next node in the list
     * @param next a ClassroomNode instance
     * @see ClassroomNode
     */
    public void setNext(ClassroomNode next) {
        this.next = next;
    }
    
}
