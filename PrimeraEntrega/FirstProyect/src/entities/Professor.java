package entities;

/**
 *
 * @author Mario Jiménez & Osvaldo Barrantes
 */
public class Professor {
    
    private String id;
    private String name;
    private String school;

    public Professor(String id, String name, String school) {
        this.id = id;
        this.name = name;
        this.school = school;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    
}
