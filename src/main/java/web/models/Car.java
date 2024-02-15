package web.models;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String brand;
    private String model;
    private String series;
    
    public Car(String brand, String model, String series) {
        this.brand = brand;
        this.model = model;
        this.series = series;
    }
    
    public Car () {}
    
    @Override
    public String toString() {
        return "Car  " + brand + " -- " + model + " -- " + series;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public String getSeries() {
        return series;
    }
    
    public void setSeries(String series) {
        this.series = series;
    }
}