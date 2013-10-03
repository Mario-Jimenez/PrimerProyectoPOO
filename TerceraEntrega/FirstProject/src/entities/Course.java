package entities;

/**
 * Represents the course entity
 * @author Mario Jiménez & Osvaldo Barrantes
 * @version 1.0 September, 2013
 */
public abstract class Course {
    
    private String id;
    private String name;
    private int credits;
    /**
     * Indicates if this course belongs to the computer engineering career
     */
    private boolean exclusive;

    /**
     * Constructor
     * @param id the id of the course
     * @param name the name of the course
     * @param credits the quantity of credits for the course
     * @param exclusive this course's exclusivity to the computer engineering school
     */
    public Course(String id, String name, int credits, boolean exclusive) {
        this.id = id;
        this.name = name;
        this.credits = credits;
        this.exclusive = exclusive;
    }

    /**
     * Getter
     * @return the id of the course
     */
    public String getId() {
        return id;
    }

    /**
     * Getter
     * @return the name of the course
     */
    public String getName() {
        return name;
    }

    /**
     * Getter
     * @return the quantity of credits of the course
     */
    public int getCredits() {
        return credits;
    }

    /**
     * Getter
     * @return this course's exclusivity to the computer engineering school
     */
    public boolean isExclusive() {
        return exclusive;
    }

    /**
     * Setter
     * @param id the id of the course
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Setter
     * @param name the name of the course
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter
     * @param credits the quantity of credits for the course
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }

    /**
     * Setter
     * @param exclusive this course's exclusivity to the computer engineering school
     */
    public void setExclusive(boolean exclusive) {
        this.exclusive = exclusive;
    }
    
}
