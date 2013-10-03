package entities;

/**
 * Represents the classroom entity
 * @author Mario Jiménez & Osvaldo Barrantes
 * @version 1.0 September, 2013
 */
public abstract class Classroom {
    
    private String id;
    private String name;
    private String location;
    private int capacity;
    /**
     * This variable is used to indicate when this classroom is occupied
     * according to an schedule of 5x9 blocks (5 days, 9 blocks a day)
     */
    private boolean schedule[][];

    /**
     * Constructor
     * @param id classroom's id
     * @param name classroom's name
     * @param location classroom's location
     * @param capacity classroom's capacity
     */
    public Classroom(String id, String name, String location, int capacity) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.schedule = new boolean[7][11];
    }

    /**
     * Getter
     * @return classroom's id
     */
    public String getId() {
        return id;
    }

    /**
     * Getter
     * @return classroom's name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter
     * @return classroom's location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Getter
     * @return classroom's capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Getter
     * @return classroom's occupied schedule
     */
    public boolean[][] getSchedule() {
        return schedule;
    }

    /**
     * Setter
     * @param id classroom's id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Setter
     * @param name classroom's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter
     * @param location classroom's location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Setter
     * @param capacity classroom's capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Setter
     * @param schedule classroom's occupied schedule
     */
    public void setSchedule(boolean[][] schedule) {
        this.schedule = schedule;
    }
    
}
