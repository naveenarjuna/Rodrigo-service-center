package rodrigoservicecenter.model.entity;

import java.sql.Time;
import java.sql.Date;

public class Appointment {
    private int appointmentId;
    private Customer customer;
    private Vehicle vehicle;
    private String status;
    private String serviceName;
    private String description;
    private Date scheduledDate;
    private Time scheduledTime;

    public Appointment(int appointmentId, Customer customer, Vehicle vehicle, String status, String serviceName, String description, Date scheduledDate, Time scheduledTime) {
        this.appointmentId = appointmentId;
        this.customer = customer;
        this.vehicle = vehicle;
        this.status = status;
        this.serviceName = serviceName;
        this.description = description;
        this.scheduledDate = scheduledDate;
        this.scheduledTime = scheduledTime;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Date getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(Date scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public Time getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(Time scheduledTime) {
        this.scheduledTime = scheduledTime;
    }
}
