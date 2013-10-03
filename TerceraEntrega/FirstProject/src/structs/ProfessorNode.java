package structs;

import entities.Professor;

/**
 * Represents a node in the list Professor
 * @author Mario Jiménez & Osvaldo Barrantes
 * @version 1.0 September, 2013
 */
public class ProfessorNode {
    
    /**
     * A Professor instance
     * Information of a professor entity
     * @see Professor
     */
    private Professor info;
    /** Next node in the list */
    private ProfessorNode next;
    /**
     * A ProfessorCourse instance
     * Head of a sublist containing the courses assigned
     * to a professor
     * @see ProfessorCourse
     */
    private ProfessorCourse profCourse;

    /**
     * Constructor
     * @param info a Professor instance
     * @see Professor
     */
    public ProfessorNode(Professor info) {
        this.info = info;
        this.next = null;
        this.profCourse = null;
    }

    /**
     * Getter
     * @return a Professor instance
     * @see Professor
     */
    public Professor getInfo() {
        return info;
    }

    /**
     * Getter
     * @return the next node in the list
     */
    public ProfessorNode getNext() {
        return next;
    }

    /**
     * Getter
     * @return the head of the sublist containing the courses assigned
     * to the professor
     */
    public ProfessorCourse getProfCourse() {
        return profCourse;
    }

    /**
     * Setter
     * @param info a Professor instance
     * @see Professor
     */
    public void setInfo(Professor info) {
        this.info = info;
    }

    /**
     * Setter
     * Assign the next node in the list
     * @param next a ProfessorNode instance
     * @see ProfessorNode
     */
    public void setNext(ProfessorNode next) {
        this.next = next;
    }

    /**
     * Setter
     * @param profCourse a ProfessorCourse instance
     * @see ProfessorCourse
     */
    public void setProfCourse(ProfessorCourse profCourse) {
        this.profCourse = profCourse;
    }
    
    /**
     * Assigns a new course to this professor
     * @param course a CourseNode instance
     * @see CourseNode
     */
    public void addCourse(CourseNode course) {
        ProfessorCourse newNode = new ProfessorCourse(course);
        if (profCourse == null) {
            profCourse = newNode;
        } else {
            newNode.setNext(profCourse);
            profCourse = newNode;
        }
    }
    
    /**
     * Removes a course previously assigned to this professor
     * @param courseID the id of the course to be removed
     */
    public void removeCourse(String courseID) {
        if (profCourse.getCourse().getInfo().getId().compareTo(courseID) == 0) {
            profCourse = profCourse.getNext();
        } else {
            ProfessorCourse temp = profCourse;
            ProfessorCourse prev = null;
            while (temp.getCourse().getInfo().getId().compareTo(courseID) != 0) {     
                prev = temp;
                temp = temp.getNext();
            }
            prev.setNext(temp.getNext());
        }
    }
    
    
    /**
     * Gets the ProfessorCourses amount.
     * @param professor node of the professor to get the courses amount.
     * @return amount of ProfessorCourses.
     */
    public int getCoursesAmount(ProfessorNode professor) {
        int amount = 0;
        ProfessorCourse temp = professor.getProfCourse();
        
        while( temp != null ) {
            temp = temp.getNext();
            amount++;
        }
        
        return amount;
    }
    
    /**
     * Gets an array with the ProfessorCourses.
     * @param professor node of the professor to get the courses array.
     * @param amount quantity of ProfessorCourses.
     * @return array of ProfessorCourses.
     */
    public ProfessorCourse[] getCoursesArray(ProfessorNode professor, int amount) {
        ProfessorCourse[] coursesArray = new ProfessorCourse[amount];
        int counter = 0;
        ProfessorCourse temp = professor.getProfCourse();
        
        while( temp != null) {
            coursesArray[counter] = temp;
            temp = temp.getNext();
            counter++;
        }
        
        return coursesArray;
    }
    
}
