package entities;

/**
 * Represents a specific type of classroom entity
 * @author Mario Jiménez & Osvaldo Barrantes
 * @version 1.0 September, 2013
 * @see Classroom
 */
public class TheoryClassroom extends Classroom {
    
    private boolean airConditioning;
    private boolean multimediaEquipment;

    /**
     * Constructor
     * @param airConditioning classroom's air conditioning availability
     * @param multimediaEquipment classroom's multimedia equipment availability
     * @param id classroom's id
     * @param name classroom's name
     * @param location classroom's location
     * @param capacity classroom's capacity
     */
    public TheoryClassroom(boolean airConditioning, boolean multimediaEquipment, String id, String name, String location, int capacity) {
        super(id, name, location, capacity);
        this.airConditioning = airConditioning;
        this.multimediaEquipment = multimediaEquipment;
    }

    /**
     * Getter
     * @return classroom's air conditioning availability
     */
    public boolean isAirConditioning() {
        return airConditioning;
    }

    /**
     * Setter
     * @param airConditioning classroom's air conditioning availability
     */
    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    /**
     * Getter
     * @return classroom's multimedia equipment availability
     */
    public boolean isMultimediaEquipment() {
        return multimediaEquipment;
    }

    /**
     * Setter
     * @param multimediaEquipment classroom's multimedia equipment availability
     */
    public void setMultimediaEquipment(boolean multimediaEquipment) {
        this.multimediaEquipment = multimediaEquipment;
    }
    
}
