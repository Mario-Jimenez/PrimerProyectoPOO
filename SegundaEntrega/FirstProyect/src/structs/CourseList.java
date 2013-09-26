package structs;

import entities.Course;
import javax.swing.DefaultListModel;

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
    
    /**
     * Description: adds a new course at the beginning of the list of courses.
     * @param course it's an instance of Course.
     */
    public void add(Course course) {
        
        CourseNode newnode = new CourseNode(course);
        
        if (head == null) {
            head = newnode;
        } else {
            newnode.setNext(head);
            head = newnode;
        }    
        
    }
    
    /**
     * Description: search for a match into the courses list.
     * @param id it's the course id to look for.
     * @return the CourseNode found or null.
     */
    public CourseNode search(String id) {
        CourseNode temp = head;
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
    
    /**
     * Description: adds the course's gruop and name into a DefaultListModel.
     * @param professor
     * @return model with ProfessorCourses' data.
     */
    public DefaultListModel getCourses(ProfessorNode professor) {
        DefaultListModel model = new DefaultListModel();
        ProfessorCourse courses = professor.getProfCourse();
        
        if (courses == null) {
            model.addElement("Error 404: information not found.");
            return model;
        }
        
        while (courses != null) {
            model.addElement(courses.getCourse().getGruop()+"  |  "
                    + courses.getCourse().getInfo().getName());
            courses = courses.getNext();
        }
        
        return model;
    }
}
