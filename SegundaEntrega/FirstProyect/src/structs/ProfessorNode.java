package structs;

import entities.Professor;

/**
 *
 * @author Mario Jiménez & Osvaldo Barrantes
 */
public class ProfessorNode {
    
    private Professor info;
    private ProfessorNode next;
    private ProfessorCourse profCourse;

    public ProfessorNode(Professor info) {
        this.info = info;
        this.next = null;
        this.profCourse = null;
    }

    public Professor getInfo() {
        return info;
    }

    public ProfessorNode getNext() {
        return next;
    }

    public ProfessorCourse getProfCourse() {
        return profCourse;
    }

    public void setInfo(Professor info) {
        this.info = info;
    }

    public void setNext(ProfessorNode next) {
        this.next = next;
    }

    public void setProfCourse(ProfessorCourse profCourse) {
        this.profCourse = profCourse;
    }
    
}
