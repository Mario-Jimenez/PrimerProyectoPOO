package structs;

import entities.Course;
import entities.Schedule;

/**
 * Represents a node in the list CourseList
 * @author Mario Jiménez & Osvaldo Barrantes
 * @version 1.0 September, 2013
 */
public class CourseNode {
    
    /**
     * A Course instance
     * Information of a course entity
     * @see Course
     */
    private Course info;
    private int group;
    /** Next node in the list */
    private CourseNode next;
    /**
     * A ScheduleNode instance
     * Head of a sublist containing the schedules assigned
     * to a group
     * @see ScheduleNode
     */
    private ScheduleNode scheduleLink;

    public CourseNode() {
    }

    /**
     * Constructor
     * @param info a Course instance
     * @param group number for the new group
     * @see Course
     */
    public CourseNode(Course info, int group) {
        this.info = info;
        this.group = group;
        this.next = null;
        this.scheduleLink = null;
    }

    /**
     * Getter
     * @return info of the group
     */
    public Course getInfo() {
        return info;
    }

    /**
     * Setter
     * @param info information of the group
     */
    public void setInfo(Course info) {
        this.info = info;
    }
    
    /**
     * Getter
     * @return number of the group
     */
    public int getGroup() {
        return group;
    }

    /**
     * Setter
     * @param group number of the group
     */
    public void setGroup(int group) {
        this.group = group;
    }

    /**
     * Getter
     * @return the next node in the list
     */
    public CourseNode getNext() {
        return next;
    }

    /**
     * Setter
     * Assign the next node in the list
     * @param next a CourseNode instance
     * @see CourseNode
     */
    public void setNext(CourseNode next) {
        this.next = next;
    }

    /**
     * Getter
     * @return the head of a sublist containing the schedules assigned
     * to a group
     */
    public ScheduleNode getScheduleLink() {
        return scheduleLink;
    }

    /**
     * Setter
     * @param scheduleLink a ScheduleNode instance
     * @see ScheduleNode
     */
    public void setScheduleLink(ScheduleNode scheduleLink) {
        this.scheduleLink = scheduleLink;
    }
    
    /**
     * Assigns a new schedule to this group and
     * the classroom where they receive the lesson
     * @param schedule a Schedule instance
     * @param classroom a ClassroomNode instance
     * @see Schedule
     * @see ClassroomNode
     */
    public void addSchedule(Schedule schedule, ClassroomNode classroom) {
        ScheduleNode newNode = new ScheduleNode(schedule, classroom);
        if (scheduleLink == null) {
            scheduleLink = newNode;
        } else {
            newNode.setNext(scheduleLink);
            scheduleLink = newNode;
        }
    }
    
    /**
     * Removes a schedule previously assigned to this group
     * @param day the day of the assigned schedule
     * @param start the start block of the assigned schedule
     */
    public void removeSchedule(CourseNode course, String day, int start) {
        if ((course.getScheduleLink().getInfo().getDay().compareTo(day) == 0) 
                && (course.getScheduleLink().getInfo().getStart() == start)) {
            course.scheduleLink = course.scheduleLink.getNext();
        } else {
            ScheduleNode temp = course.getScheduleLink();
            ScheduleNode prev = null;
            while (!((temp.getInfo().getDay().compareTo(day) == 0) 
                    && (temp.getInfo().getStart() == start))) {
                prev = temp;
                temp = temp.getNext();
            }
            prev.setNext(temp.getNext());
        }
    }
    
    /**
     * Gets the Schedules amount.
     * @param course node of the course to get the schedules amount.
     * @return amount of schedules..
     */
    public int getScheduleAmount(CourseNode course) {
        int amount = 0;
        ScheduleNode temp = course.getScheduleLink();
        
        while( temp != null ) {
            temp = temp.getNext();
            amount++;
        }
        
        return amount;
    }
    
    /**
     * Gets an array with the courses schedules.
     * @param course node of the course to get the schedule array.
     * @param amount quantity of schedules assigned to a course.
     * @return array of schedules.
     */
    public ScheduleNode[] getScheduleArray(CourseNode course, int amount) {
        ScheduleNode[] schedulesArray = new ScheduleNode[amount];
        int counter = 0;
        ScheduleNode temp = course.getScheduleLink();
        
        while( temp != null) {
            schedulesArray[counter] = temp;
            temp = temp.getNext();
            counter++;
        }
        
        return schedulesArray;
    }
    
    /**
     * Gets the remain credits to be assigned
     * @param course a CourseNode instance
     * @return remaining credits
     * @see CourseNode
     */
    public int getCreditsLeft(CourseNode course) {
        int creditsLeft;
        
        creditsLeft = course.getInfo().getCredits();
        ScheduleNode scheduleTemp = course.getScheduleLink();
        while (scheduleTemp != null) {            
            creditsLeft -= scheduleTemp.getInfo().getBlocks();
            scheduleTemp = scheduleTemp.getNext();
        }
        
        return creditsLeft;
    }
    
    
    public boolean checkProfessorSchedule (CourseNode course, String newDay, 
        int newStart, int newBlocks) {
        String day;
        int start;
        int blocks;
        ScheduleNode temp = course.scheduleLink;
        
        while ( temp != null ) {
            day = temp.getInfo().getDay();
            start = temp.getInfo().getStart();
            blocks = temp.getInfo().getBlocks();
            
            if ( day.compareTo(newDay) == 0 ) {
                if ( start == newStart ) {
                    return false;
                } 
                
                int back;
                int forward;
                back = newStart + newBlocks;
                forward = start + blocks;

                if ( forward > newStart) {
                    return false;
                }

                if ( start > back) {
                    return false;
                }
            }
            temp = temp.getNext();
        }
        return true;
    }
}
