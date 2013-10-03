package structs;

import entities.PracticalCourse;
import entities.TheoryCourse;

/**
 * A list of courses
 * @author Mario Jiménez & Osvaldo Barrantes
 * @version 1.0 September, 2013
 * @see PracticalCourse
 * @see TheoryCourse
 */
public class CourseList {
    
    /** The head(first node) of the list*/
    private CourseNode head;

    /**
     * Constructor
     */
    public CourseList() {
        this.head = null;
    }

    /**
     * Getter
     * @return the head of the list
     */
    public CourseNode getHead() {
        return head;
    }

    /**
     * Setter
     * @param head a CourseNode instance
     * @see CourseNode
     */
    public void setHead(CourseNode head) {
        this.head = head;
    }
    
    /**
     * Adds a new theory course at the beginning of the list CourseList
     * @param course it's an instance of TheoryCourse
     * @see TheoryCourse
     */
    public void add(TheoryCourse course, int group) {
        CourseNode newNode = new CourseNode(course, group);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }
    
    /**
     * Adds a new practical course at the beginning of the list CourseList
     * @param course it's an instance of PracticalCourse
     * @see PracticalCourse
     */
    public void add(PracticalCourse course, int group) {
        CourseNode newNode = new CourseNode(course, group);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }
    
    /**
     * Edits the information of a theory course
     * @param course instance of TheoryCourse
     * @param name the name of the course
     * @param credits the quantity of credits of the course
     * @param exclusvie this course's exclusivity to the computer engineering 
     * school
     * @param webSite the web site of the course
     * @see TheoryCourse
     */
    public void edit(TheoryCourse course, String name, int credits, 
            boolean exclusive, String webSite) {
        course.setName(name);
        course.setCredits(credits);
        course.setExclusive(exclusive);
        course.setWebSite(webSite);
    }
    
    /**
     * Edits the information of a practical course
     * @param course instance of PracticalCourse
     * @param name the name of the course
     * @param exclusvie this course's exclusivity to the computer engineering 
     * school
     * @param credits the quantity of credits of the course
     * @param supportMaterial support material for the course
     * @param operatingSystem operating system for the course
     * @see PracticalCourse
     */
    public void edit(PracticalCourse course, String name, int credits, 
            boolean exlusive, String supportMaterial, String operatingSystem) {
        
        course.setName(name);
        course.setCredits(credits);
        course.setExclusive(exlusive);
        course.setSupportMaterial(supportMaterial);
        course.setOperatingSystem(operatingSystem);
    }
    
    /**
     * Looks for a course
     * @param id the course's id
     * @param group the course's group
     * @return the CourseNode instance found or null
     * @see CourseNode
     */
    public CourseNode search(String id, int group) {
        CourseNode temp = head;
        while (temp != null) {                
            if ((temp.getInfo().getId().compareTo(id) == 0) && (temp.getGroup() == group)) {
                return temp;
            }
            temp = temp.getNext();
        }
        return temp;
    }
    
    /**
     * Deletes a course from this list
     * @param id the course's id
     */
    public void delete(String id) {
        if (head.getInfo().getId().compareTo(id) == 0) {
            head = head.getNext();
        } else {
            CourseNode temp = head;
            CourseNode prev = null;
            while (temp.getInfo().getId().compareTo(id) != 0) {                
                prev = temp;
                temp = temp.getNext();
            }
            prev.setNext(temp.getNext());
        }
    }
    
}
