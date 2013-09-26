/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Osvaldo08CR
 */
public class Classroom {
    
    private String id;
    private String name;
    private String location;
    private int capacity;
    private boolean schedule[][];

    public Classroom(String id, String name, String location, int capacity, boolean[][] schedule) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.schedule = schedule;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean[][] getSchedule() {
        return schedule;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setSchedule(boolean[][] schedule) {
        this.schedule = schedule;
    }
    
    
    
}
