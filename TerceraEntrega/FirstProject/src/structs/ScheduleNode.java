package structs;

import entities.Schedule;

/**
 * Represents a node in the sublist of schedules
 * @author Mario Jiménez & Osvaldo Barrantes
 * @version 1.0 September, 2013
 */
public class ScheduleNode {
    
    /**
     * A Schedule instance
     * Information of a schedule entity
     * @see Schedule
     */
    private Schedule info;
    /** Next node in the list */
    private ScheduleNode next;
    /**
     * The link to a node from the list ClassroomList
     * to access to the information of the classroom
     * that was assigned to this schedule
     */
    private ClassroomNode classroomLink;

    /**
     * Constructor
     * @param info a Schedule instance
     * @param classroomLink a ClassroomNode instance to link
     * @see Schedule
     * @see ClassroomNode
     */
    public ScheduleNode(Schedule info, ClassroomNode classroomLink) {
        this.info = info;
        this.next = null;
        this.classroomLink = classroomLink;
    }

    /**
     * Getter
     * @return a Schedule instance
     * @see Schedule
     */
    public Schedule getInfo() {
        return info;
    }

    /**
     * Setter
     * @param info a Schedule instance
     * @see Schedule
     */
    public void setInfo(Schedule info) {
        this.info = info;
    }

    /**
     * Getter
     * @return the next node in the list
     */
    public ScheduleNode getNext() {
        return next;
    }

    /**
     * Setter
     * Assign the next node in the list
     * @param next a ScheduleNode instance
     * @see ScheduleNode
     */
    public void setNext(ScheduleNode next) {
        this.next = next;
    }

    /**
     * Getter
     * @return the ClassroomNode link
     * @see ClassroomNode
     */
    public ClassroomNode getClassroomLink() {
        return classroomLink;
    }

    /**
     * Setter
     * @param classroomLink a ClassrooomNode instance
     * @see ClassroomNode
     */
    public void setClassroomLink(ClassroomNode classroomLink) {
        this.classroomLink = classroomLink;
    }
    
}
