package rodrigoservicecenter.model;

import rodrigoservicecenter.connect.connect;
import rodrigoservicecenter.model.entity.Appointment;
import rodrigoservicecenter.model.entity.Customer;
import rodrigoservicecenter.model.entity.ServiceOutlet;
import rodrigoservicecenter.model.entity.Vehicle;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AppointmentModel {

    private final CustomerModel customerModel = new CustomerModel();
    private final VehicleModel vehicleModel = new VehicleModel();
    private final ServiceOutletModel serviceOutletModel = new ServiceOutletModel();

    // Create an appointment
    public boolean createAppointment(Appointment appointment) {
        connect db = new connect();
        Connection con = db.createConnection();

        String sql = "INSERT INTO Appointment (appointmentId, customerId, vehicleId, outletId, status, serviceName, description, scheduledDate, scheduledTime) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, appointment.getAppointmentId());
            ps.setInt(2, appointment.getCustomer().getCustomerId());
            ps.setString(3, appointment.getVehicle().getVehicleId());
            ps.setInt(4, appointment.getOutlet().getOutletId());
            ps.setString(5, appointment.getStatus());
            ps.setString(6, appointment.getServiceName());
            ps.setString(7, appointment.getDescription());
            ps.setDate(8, appointment.getScheduledDate());
            ps.setTime(9, appointment.getScheduledTime());

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

        String sql = "UPDATE Appointment SET customerId = ?, vehicleId = ?, OutletId = ?, status = ?, serviceName = ?, description = ?, scheduledDate = ?, scheduledTime = ? "
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

            if (rs.next()) {
                return new Appointment(
                        rs.getInt("appointmentId"),
                        customerModel.getCustomerById(rs.getInt("customerId")),
                        vehicleModel.getVehicleById(rs.getInt("vehicleId")),
                        serviceOutletModel.getOutletById(rs.getInt("OutletId")),
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

    public List<Appointment> searchAppointments(Date date, Time time, Integer outletId) {
        connect db = new connect();
        Connection con = db.createConnection();
        List<Appointment> list = new ArrayList<>();

        StringBuilder sql = new StringBuilder("SELECT * FROM Appointment WHERE 1=1");

        if (date != null) {
            sql.append(" AND scheduledDate = ?");
        }
        if (time != null) {
            sql.append(" AND scheduledTime = ?");
        }
        if (outletId != null) {
            sql.append(" AND outletId = ?");
        }

        try {
            PreparedStatement ps = con.prepareStatement(sql.toString());

            int index = 1;
            if (date != null) {
                ps.setDate(index++, date);
            }
            if (time != null) {
                ps.setTime(index++, time);
            }
            if (outletId != null) {
                ps.setInt(index++, outletId);
            }

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Appointment appointment = new Appointment(
                        rs.getInt("appointmentId"),
                        customerModel.getCustomerById(rs.getInt("customerId")),
                        vehicleModel.getVehicleById(rs.getInt("vehicleId")),
                        serviceOutletModel.getOutletById(rs.getInt("OutletId")),
                        rs.getString("status"),
                        rs.getString("serviceName"),
                        rs.getString("description"),
                        rs.getDate("scheduledDate"),
                        rs.getTime("scheduledTime")
                );
                list.add(appointment);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

}
