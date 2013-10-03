package entities;

/**
 * Represents the schedule entity
 * @author Mario Jiménez & Osvaldo Barrantes
 * @version 1.0 September, 2013
 */
public class Schedule {
    
    private String day;
    /**
     * The start block (references an hour) of the lesson
     */
    private int start;
    /**
     * The quantity of blocks (hours) the lesson lasts
     */
    private int blocks;

    /**
     * Constructor
     * @param day the day of the lesson
     * @param start the start block (references an hour) of the lesson
     * @param blocks the quantity of blocks (hours) the lesson lasts
     */
    public Schedule(String day, int start, int blocks) {
        this.day = day;
        this.start = start;
        this.blocks = blocks;
    }

    /**
     * Getter
     * @return the day of the lesson
     */
    public String getDay() {
        return day;
    }

    /**
     * Getter
     * @return the start block (hour)
     */
    public int getStart() {
        return start;
    }

    /**
     * Getter
     * @return the quantity of blocks (hours) the lesson lasts
     */
    public int getBlocks() {
        return blocks;
    }

    /**
     * Setter
     * @param day the day of the lesson
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * Setter
     * @param start the start block (hour)
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * Setter
     * @param blocks the quantity of blocks (hours) the lesson lasts
     */
    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }
    
}
