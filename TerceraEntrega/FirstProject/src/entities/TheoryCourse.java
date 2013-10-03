package entities;

/**
 * Represents a specific type of course entity
 * @author Mario Jiménez & Osvaldo Barrantes
 * @version 1.0 September, 2013
 * @see Course
 */
public class TheoryCourse extends Course {
    
    private String webSite;

    /**
     * Constructor
     * @param webSite the web site of the course
     * @param id the id of the course
     * @param name the name of the course
     * @param credits the quantity of credits of the course
     * @param exclusive this course's exclusivity to the computer engineering school
     */
    public TheoryCourse(String webSite, String id, String name, int credits, boolean exclusive) {
        super(id, name, credits, exclusive);
        this.webSite = webSite;
    }

    /**
     * Getter
     * @return the web site of the course
     */
    public String getWebSite() {
        return webSite;
    }

    /**
     * Setter
     * @param webSite the web site of the course
     */
    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }
    
}
