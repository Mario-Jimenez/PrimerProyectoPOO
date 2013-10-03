package structs;

import entities.Professor;

/**
 * A list of professors
 * @author Mario Jiménez & Osvaldo Barrantes
 * @version 1.0 September, 2013
 * @see Professor
 */
public class ProfessorList {
    
    /** The head(first node) of the list*/
    private ProfessorNode head;
    
    /**
     * Constructor
     */
    public ProfessorList() {
        this.head = null;
    }

    /**
     * Getter
     * @return the head of the list
     */
    public ProfessorNode getHead() {
        return head;
    }

    /**
     * Setter
     * @param head a ProfessorNode instance
     * @see ProfessorNode
     */
    public void setHead(ProfessorNode head) {
        this.head = head;
    }
    
    /**
     * Adds a new professor at the beginning of the list ProfessorList.
     * @param professor it's an instance of Professor.
     * @see Professor
     */
    public void add(Professor professor) {
        ProfessorNode newNode = new ProfessorNode(professor);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }    
    }
    
    /**
     * Edits the information of a professor
     * @param id professor's id
     * @param name professor's name
     * @param school professor's school
     */
    public void edit(String id, String name, String school) {
        ProfessorNode temp = head;
        while (temp.getInfo().getId().compareTo(id) != 0) {                
            temp = temp.getNext();
        }
        temp.getInfo().setName(name);
        temp.getInfo().setSchool(school);
    }
    
    /**
     * Search for a match into the professors list.
     * @param id it's the professor's id to look for.
     * @return the ProfessorNode instance found or null.
     * @see ProfessorNode
     */
    public ProfessorNode search(String id) {
        ProfessorNode temp = head;
        while (temp != null) {
            if (temp.getInfo().getId().compareTo(id) == 0) {
                return temp;
            }
            temp = temp.getNext();
        }
        return temp;
    }
    
    /**
     * Deletes a professor from this list
     * @param id professor's id
     */
    public void delete(String id) {
        if (head.getInfo().getId().compareTo(id) == 0) {
            head = head.getNext();
        } else {
            ProfessorNode temp = head;
            ProfessorNode prev = null;
            while (temp.getInfo().getId().compareTo(id) != 0) {                
                prev = temp;
                temp = temp.getNext();
            }
            prev.setNext(temp.getNext());
        }
    }
    
}
