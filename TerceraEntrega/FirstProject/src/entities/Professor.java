package entities;

/**
 * Represents the professor entity
 * @author Mario Jiménez & Osvaldo Barrantes
 * @version 1.0 September, 2013
 */
public class Professor {
    
    private String id;
    private String name;
    private String school;

    /**
     * Constructor
     * @param id professor's id
     * @param name professor's name
     * @param school professor's school
     */
    public Professor(String id, String name, String school) {
        this.id = id;
        this.name = name;
        this.school = school;
    }

    /**
     * Getter
     * @return professor's id
     */
    public String getId() {
        return id;
    }

    /**
     * Getter
     * @return  professor's name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter
     * @return professor's school
     */
    public String getSchool() {
        return school;
    }

    /**
     * Setter
     * @param id professor's id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Setter
     * @param name professor's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter
     * @param school professor's school
     */
    public void setSchool(String school) {
        this.school = school;
    }
    
}
