package rodrigoservicecenter.model;

import rodrigoservicecenter.connect.connect;
import rodrigoservicecenter.model.entity.Customer;
import rodrigoservicecenter.model.entity.Vehicle;

import java.sql.*;

public class VehicleModel {

    private final CustomerModel customerModel = new CustomerModel();

    public Vehicle getVehicleByCustomerId(int id) {
        Vehicle vehicle = null;
        connect db = new connect();
        Connection con = db.createConnection();

        String sql = "SELECT * FROM vehicle WHERE customerId = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String vehicleId = rs.getString("vehicleId");
                Customer customer = customerModel.getCustomerById(rs.getInt("customerId"));
                String model = rs.getString("model");
                int year = rs.getInt("year");
                String fuelType = rs.getString("fuelType");
                Date lastServicedDate = rs.getDate("lastServicedDate");
                int mileage = rs.getInt("mileage");

                vehicle = new Vehicle(customer, fuelType, lastServicedDate, mileage, model, vehicleId, year);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return vehicle;

    }

    public Vehicle getVehicleById(int id) {
        Vehicle vehicle = null;
        connect db = new connect();
        Connection con = db.createConnection();

        String sql = "SELECT * FROM Vehicles WHERE vehicleId = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String vehicleId = String.valueOf(rs.getInt("vehicleId"));
                Customer customer = customerModel.getCustomerById(rs.getInt("customerId"));
                String model = rs.getString("model");
                int year = rs.getInt("year");
                String fuelType = rs.getString("fuelType");
                Date lastServicedDate = rs.getDate("lastServicedDate");
                int mileage = rs.getInt("mileage");

                vehicle = new Vehicle(customer, fuelType, lastServicedDate, mileage, model, vehicleId, year);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return vehicle;

    }


    public boolean addVehicle(Vehicle vehicle) {
        connect db = new connect();
        Connection con = db.createConnection();
        boolean success = false;

        String sql = "INSERT INTO Vehicles (vehicleId, customerId, model, year, fuelType, lastServicedDate, mileage) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, vehicle.getVehicleId());
            ps.setInt(2, vehicle.getCustomer().getCustomerId());
            ps.setString(3, vehicle.getModel());
            ps.setInt(4, vehicle.getYear());
            ps.setString(5, vehicle.getFuelType());
            ps.setDate(6, vehicle.getLastServicedDate());
            ps.setInt(7, vehicle.getMileage());

            int rowsInserted = ps.executeUpdate();
            success = rowsInserted > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return success;
    }

    public boolean updateVehicle(Vehicle vehicle) {
        connect db = new connect();
        Connection con = db.createConnection();
        boolean success = false;

        String sql = "UPDATE Vehicles SET customerId = ?, model = ?, year = ?, fuelType = ?, lastServicedDate = ?, mileage = ? WHERE vehicleId = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, vehicle.getCustomer().getCustomerId());
            ps.setString(2, vehicle.getModel());
            ps.setInt(3, vehicle.getYear());
            ps.setString(4, vehicle.getFuelType());
            ps.setDate(5, vehicle.getLastServicedDate());
            ps.setInt(6, vehicle.getMileage());
            ps.setString(7, vehicle.getVehicleId());

            int rowsUpdated = ps.executeUpdate();
            success = rowsUpdated > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return success;
    }

    public boolean deleteVehicle(String vehicleId) {
        connect db = new connect();
        Connection con = db.createConnection();
        boolean success = false;

        String sql = "DELETE FROM Vehicles WHERE vehicleId = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, vehicleId);

            int rowsDeleted = ps.executeUpdate();
            success = rowsDeleted > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return success;
    }

}
