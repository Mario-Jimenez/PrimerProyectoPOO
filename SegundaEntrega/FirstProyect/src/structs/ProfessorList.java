package structs;

import entities.Professor;

/**
 *
 * @author Mario Jiménez & Osvaldo Barrantes
 */
public class ProfessorList implements ListStruct {
    
    private ProfessorNode head;

    
    public ProfessorList() {
        this.head = null;
    }

    public ProfessorNode getHead() {
        return head;
    }

    public void setHead(ProfessorNode head) {
        this.head = head;
    }
    
    /**
     * Description: adds a new professor at the beginning of the list of
     * ProfessorList.
     * @param professor it's an instance of Professor.
     */
    public void add(Professor professor) {
        ProfessorNode newnode = new ProfessorNode(professor);
        
        if (head == null) {
            head = newnode;
        } else {
            newnode.setNext(head);
            head = newnode;
        }    
    }
    
    /**
     * Description: search for a match into the professors list.
     * @param id it's the professor id to look for.
     * @return the ProfessorNode found or null.
     */
    public ProfessorNode search(String id) {
        ProfessorNode temp = head;
        String realId;
        
        while (temp != null) {
            realId = temp.getInfo().getId();
            
            if (realId.compareTo(id) == 0) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }
}
