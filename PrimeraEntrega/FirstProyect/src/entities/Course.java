package entities;

/**
 *
 * @author Mario Jiménez & Osvaldo Barrantes
 */
public abstract class Course {
    
    private String id;
    private String name;
    private int credits;
    private boolean exclusive;

    public Course(String id, String name, int credits, boolean exclusive) {
        this.id = id;
        this.name = name;
        this.credits = credits;
        this.exclusive = exclusive;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public boolean isExclusive() {
        return exclusive;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setExclusive(boolean exclusive) {
        this.exclusive = exclusive;
    }
    
}
