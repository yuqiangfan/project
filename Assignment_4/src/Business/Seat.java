/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author PythonNo1
 */
public class Seat {
    private int colGroup;
    private String colPosition;
    private int row;
    private int price;
    private boolean availability;
    private Flight flight;
    private Person person;
    
    static final int maxRow = 25;
    
    public int getColGroup() {
        return colGroup;
    }

    public void setColGroup(int colGroup) {
        this.colGroup = colGroup;
    }

    public String getColPosition() {
        return colPosition;
    }

    public void setColPosition(String colPosition) {
        this.colPosition = colPosition;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
}
