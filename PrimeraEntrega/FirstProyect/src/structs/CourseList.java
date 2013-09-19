package structs;

/**
 *
 * @author Mario Jiménez & Osvaldo Barrantes
 */
public class CourseList implements ListStruct {
    
    private CourseNode head;

    public CourseList() {
        this.head = null;
    }

    public CourseNode getHead() {
        return head;
    }

    public void setHead(CourseNode head) {
        this.head = head;
    }
    
}
