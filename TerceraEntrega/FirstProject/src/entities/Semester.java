package entities;

/**
 * Represents the semester entity
 * @author Mario Jiménez & Osvaldo Barrantes
 * @version 1.0 September, 2013
 */
public class Semester {
    
    /** The semester's number */
    private int id;

    /**
     * Constructor
     * @param id the semester's number
     */
    public Semester(int id) {
        this.id = id;
    }

    /**
     * Getter
     * @return the semester's number
     */
    public int getId() {
        return id;
    }

    /**
     * Setter
     * @param id the semester's number
     */
    public void setId(int id) {
        this.id = id;
    }
    
}
