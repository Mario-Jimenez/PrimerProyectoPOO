/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structs;

import entities.Classroom;

/**
 *
 * @author Osvaldo08CR
 */
class ClassroomNode {
    
    private Classroom info;
    private ClassroomNode next;

    public Classroom getInfo() {
        return info;
    }

    public ClassroomNode getNext() {
        return next;
    }

    public void setInfo(Classroom info) {
        this.info = info;
    }

    public void setNext(ClassroomNode next) {
        this.next = next;
    }
    
    
    
}
