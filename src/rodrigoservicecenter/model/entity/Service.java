package rodrigoservicecenter.model.entity;

import java.sql.Time;

public class Service {
    private int serviceId;
    private String serviceName;
    private String description;
    private Time estimatedDuration;
    private String vehicleCompatibility;
    private int price;

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Time getEstimatedDuration() {
        return estimatedDuration;
    }

    public void setEstimatedDuration(Time estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }

    public String getVehicleCompatibility() {
        return vehicleCompatibility;
    }

    public void setVehicleCompatibility(String vehicleCompatibility) {
        this.vehicleCompatibility = vehicleCompatibility;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
