package rodrigoservicecenter.model.entity;

import java.sql.Date;

public class Vehicle {
    private String vehicleId;
    private Customer customer;
    private String model;
    private int year;
    private String fuelType;
    private Date lastServicedDate;
    private int mileage;

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Date getLastServicedDate() {
        return lastServicedDate;
    }

    public void setLastServicedDate(Date lastServicedDate) {
        this.lastServicedDate = lastServicedDate;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
