package entities;

/**
 *
 * @author Mario Jiménez & Osvaldo Barrantes
 */
public class TheoricalCourse extends Course {
    
    private String webSite;

    public TheoricalCourse(String webSite, String id, String name, int credits, boolean exclusive) {
        super(id, name, credits, exclusive);
        this.webSite = webSite;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }
    
}
