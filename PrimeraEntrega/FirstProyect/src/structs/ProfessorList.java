package structs;

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
    
}
