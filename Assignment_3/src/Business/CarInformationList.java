/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author stevefan
 */
public class CarInformationList {
    
    private ArrayList<Car> carList;
    private Date date;
    
    public CarInformationList(){
        
        this.carList = new ArrayList<Car>();
        
        Car car1 = new Car(true, "Ferrari", 2019, 1, 2, 1,"Red One", "Boston", true);
        Car car2 = new Car(true, "BMW", 2019, 1, 4, 2, "X1", "New York", true);
        Car car3 = new Car(true, "Toyota", 2018, 1, 4, 3, "T1", "Boston", true);
        Car car4 = new Car(true, "GM", 2018, 1, 4, 4, "G1", "New York", true);
        Car car5 = new Car(true, "Toyota", 2017, 1, 4, 5, "T2", "Chicago", true);
        Car car6 = new Car(true, "GM", 2017, 1, 4, 6, "G2", "Chicago", true);
        Car car7 = new Car(true, "Ferrari", 2016, 1, 4, 7, "", "Seattle", true);
        Car car8 = new Car(true, "BMW", 2016, 1, 4, 8, "X2", "Seattle", true);
        Car car9 = new Car(true, "Toyota", 2019, 1, 4, 9, "T3", "Austin", true);
        Car car10 = new Car(true, "GM", 2019, 1, 4, 10, "G3", "Austin", true);
        
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        
        date = new Date();
    }

    public ArrayList<Car> getCarInformationList() {
        return carList;
    }

    public void setCarInformationList(ArrayList<Car> carList) {
        this.carList = carList;
    }
    
    public Car addCar(){
        Car newCar = new Car();
        carList.add(newCar);
        return newCar;
    }
    
    
    public void deleteCar(Car car){
        carList.remove(car);
    }
    
    public ArrayList<Car> searchBrand(String brand){
        ArrayList<Car> showList = new ArrayList();
        for(Car car : this.carList){
            if(car.getBrand().equalsIgnoreCase(brand)){
                 showList.add(car);
            }
        }
        return showList;
    }
    
    public ArrayList<Car> searchYear(Integer year){
        ArrayList<Car> showList = new ArrayList();
        
        for(Car car : this.carList){
            if(year.equals(car.getManufactured_year())){
                showList.add(car);
            }
        }
        return showList;
    }

    public ArrayList<Car> searchCity(String city) {
        ArrayList<Car> showList = new ArrayList();
        for(Car car : this.carList){
            if(car.getAvailble_city().equalsIgnoreCase(city)){
                 showList.add(car);
            }
        }
        return showList;
    }

    public Car searchSerial(Integer serial) {
        for(Car car : this.carList){
            if(serial.equals(car.getSerial_num())){
                return car;
            }
        }
        boolean carEmpty = true;
        return null;
    }

    public ArrayList<Car> searchModel(String model) {
        ArrayList<Car> showList = new ArrayList();
        
        for(Car car : this.carList){
            if(model.equals(car.getModel_num())){
                showList.add(car);
            }
        }
        return showList;
    }
    
    public int checkAvail(){
        int count = 0;
        for (Car result : carList){
            if (result.isAvailable() == true){
                count ++;
            }
        }
        return count;
    }
    
    public int checkNotAvail(){
        int count = 0;
        for (Car result : carList){
            if (result.isAvailable() == false){
                count ++;
            }
        }
        return count;
    }

    public ArrayList<Car> checkMain() {
        ArrayList<Car> showList = new ArrayList();
        
        for (Car result : carList){
            if (result.isMaintenance_certificate() != true){
                showList.add(result);
            }
        }
        return showList;
    }

    public String listManu() {
        ArrayList<String> showList = new ArrayList();
        
        for (Car result : carList){
            String pointer = result.getBrand();
            if (! showList.contains(pointer)){
                showList.add(pointer);  
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (String s : showList){
            sb.append(s);
            sb.append("\t");
        }
        return sb.toString();
    }

    public Car checkSeats(Integer min, Integer max) {
        for(Car car : this.carList){
            if(min >= car.getMin_seats() && max <= car.getMax_seats()){
                return car;
            }
        }
        return null;
    }

    public Car findCar() {
        for (Car car : this.carList){
            if (car.isAvailable() == true){
                return car;
            }
        }
        return null;
    }

    public String timeUpdated() {
        return this.date.toString();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    
}