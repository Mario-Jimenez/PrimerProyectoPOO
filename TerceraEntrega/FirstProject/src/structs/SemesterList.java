package structs;

import entities.Semester;

/**
 * A list of semesters
 * @author Mario Jiménez & Osvaldo Barrantes
 * @version 1.0 September, 2013
 * @see Semester
 */
public class SemesterList {
    
    /** The head(first node) of the list*/
    private SemesterNode head;

    /**
     * Constructor
     */
    public SemesterList() {
        head = null;
    }

    /**
     * Getter
     * @return the head of the list
     */
    public SemesterNode getHead() {
        return head;
    }

    /**
     * Setter
     * @param head a SemesterNode instance
     * @see SemesterNode
     */
    public void setHead(SemesterNode head) {
        this.head = head;
    }
    
    /**
     * Adds a new semester at the beginning of the list SemesterList
     * @param semester it's an instance of Semester
     * @see Semester
     */
    public void add(Semester semester) {
        SemesterNode newNode = new SemesterNode(semester);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }
    
    /**
     * Looks for a semester
     * @param id the semester's id
     * @return the SemesterNode instance found or null
     * @see SemesterNode
     */
    public SemesterNode search(int id) {
        SemesterNode temp = head;
        while (temp != null) {            
            if (temp.getInfo().getId() == id) {
                return temp;
            }
            temp = temp.getNext();
        }
        return temp;
    }
    
    /**
     * Deletes a semester from this list
     * @param id the semester's id
     */
    public void delete(int id) {
        if (head.getInfo().getId() == id) {
            head = head.getNext();
        } else {
            SemesterNode temp = head;
            SemesterNode prev = null;
            while (temp.getInfo().getId() != id) {                
                prev = temp;
                temp = temp.getNext();
            }
            prev.setNext(temp.getNext());
        }
    }
    
}
