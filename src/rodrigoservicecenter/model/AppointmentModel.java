package rodrigoservicecenter.model;

import rodrigoservicecenter.connect.connect;
import rodrigoservicecenter.model.entity.Appointment;
import rodrigoservicecenter.model.entity.Customer;
import rodrigoservicecenter.model.entity.Vehicle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AppointmentModel {

    private final CustomerModel customerModel;
    private final VehicleModel vehicleModel;

    public AppointmentModel(CustomerModel customerModel, VehicleModel vehicleModel) {
        this.customerModel = new CustomerModel();
        this.vehicleModel = new VehicleModel();
    }

    // Create an appointment
    public boolean createAppointment(Appointment appointment) {
        connect db = new connect();
        Connection con = db.createConnection();

        String sql = "INSERT INTO Appointment (appointmentId, customerId, vehicleId, status, serviceName, description, scheduledDate, scheduledTime) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, appointment.getAppointmentId());
            ps.setInt(2, appointment.getCustomer().getCustomerId());
            ps.setString(3, appointment.getVehicle().getVehicleId());
            ps.setString(4, appointment.getStatus());
            ps.setString(5, appointment.getServiceName());
            ps.setString(6, appointment.getDescription());
            ps.setDate(7, appointment.getScheduledDate());
            ps.setTime(8, appointment.getScheduledTime());

            int rows = ps.executeUpdate();
            return rows > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    // Update an existing appointment
    public boolean updateAppointment(Appointment appointment) {
        connect db = new connect();
        Connection con = db.createConnection();

        String sql = "UPDATE Appointment SET customerId = ?, vehicleId = ?, status = ?, serviceName = ?, description = ?, scheduledDate = ?, scheduledTime = ? "
                + "WHERE appointmentId = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, appointment.getCustomer().getCustomerId());
            ps.setString(2, appointment.getVehicle().getVehicleId());
            ps.setString(3, appointment.getStatus());
            ps.setString(4, appointment.getServiceName());
            ps.setString(5, appointment.getDescription());
            ps.setDate(6, appointment.getScheduledDate());
            ps.setTime(7, appointment.getScheduledTime());
            ps.setInt(8, appointment.getAppointmentId());

            int rows = ps.executeUpdate();
            return rows > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    // Delete an existing appointment
    public boolean deleteAppointment(int appointmentId) {
        connect db = new connect();
        Connection con = db.createConnection();

        String sql = "DELETE FROM Appointment WHERE appointmentId = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, appointmentId);

            int rows = ps.executeUpdate();
            return rows > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    //
    public Appointment getAppointmentById(int appointmentId) {
        connect db = new connect();
        Connection con = db.createConnection();

        String sql = "SELECT * FROM Appointment WHERE appointmentId = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, appointmentId);
            ResultSet rs = ps.executeQuery();

            Customer customer = customerModel.getCustomerById(rs.getInt("customerId"));
            Vehicle vehicle = vehicleModel.getVehicleById(rs.getInt("vehicleId"));

            if (rs.next()) {
                return new Appointment(
                        rs.getInt("appointmentId"),
                        customer,
                        vehicle,
                        rs.getString("status"),
                        rs.getString("serviceName"),
                        rs.getString("description"),
                        rs.getDate("scheduledDate"),
                        rs.getTime("scheduledTime")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }



}
