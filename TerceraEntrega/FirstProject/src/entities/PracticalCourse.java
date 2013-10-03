package entities;

/**
 * Represents a specific type of course entity
 * @author Mario Jiménez & Osvaldo Barrantes
 * @version 1.0 September, 2013
 * @see Course
 */
public class PracticalCourse extends Course {
    
    private String supportMaterial;
    private String operatingSystem;

    /**
     * Constructor
     * @param supportMaterial support material for the course
     * @param operatingSystem operating system for the course
     * @param id the id of the course
     * @param name the name of the course
     * @param credits the quantity of credits of the course
     * @param exclusive this course's exclusivity to the computer engineering school
     */
    public PracticalCourse(String supportMaterial, String operatingSystem, String id, String name, int credits, boolean exclusive) {
        super(id, name, credits, exclusive);
        this.supportMaterial = supportMaterial;
        this.operatingSystem = operatingSystem;
    }

    /**
     * Getter
     * @return support material for the course
     */
    public String getSupportMaterial() {
        return supportMaterial;
    }

    /**
     * Setter
     * @param supportMaterial support material for the course
     */
    public void setSupportMaterial(String supportMaterial) {
        this.supportMaterial = supportMaterial;
    }

    /**
     * Getter
     * @return operating system for the course
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * Setter
     * @param operatingSystem operating system for the course
     */
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    
}
