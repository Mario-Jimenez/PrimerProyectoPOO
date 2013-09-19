package entities;

/**
 *
 * @author Mario Jiménez & Osvaldo Barrantes
 */
public class PracticalCourse extends Course {
    
    private String supportMaterial;
    private String operatingSystem;

    public PracticalCourse(String supportMaterial, String operatingSystem, String id, String name, int credits, boolean exclusive) {
        super(id, name, credits, exclusive);
        this.supportMaterial = supportMaterial;
        this.operatingSystem = operatingSystem;
    }

    public String getSupportMaterial() {
        return supportMaterial;
    }

    public void setSupportMaterial(String supportMaterial) {
        this.supportMaterial = supportMaterial;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    
}
