/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Osvaldo08CR
 */
public class Schedule {
    
    private String day;
    private int start;
    private int blocks;

    public Schedule() {
    }

    public Schedule(String day, int start, int blocks) {
        this.day = day;
        this.start = start;
        this.blocks = blocks;
    }

    public String getDay() {
        return day;
    }

    public int getStart() {
        return start;
    }

    public int getBlocks() {
        return blocks;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }
    
    
    
}
