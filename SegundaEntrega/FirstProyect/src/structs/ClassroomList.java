/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structs;

/**
 *
 * @author Osvaldo08CR
 */
public class ClassroomList {
    
    private ClassroomNode head;
    
    public ClassroomList(ClassroomNode head) {
        this.head = head;
    }

    public ClassroomNode getHead() {
        return head;
    }

    public void setHead(ClassroomNode head) {
        this.head = head;
    }
    
    
}
