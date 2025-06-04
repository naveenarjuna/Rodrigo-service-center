package rodrigoservicecenter.model;

import rodrigoservicecenter.connect.connect;
import rodrigoservicecenter.model.entity.Customer;
import rodrigoservicecenter.model.entity.Vehicle;

import java.sql.*;

public class VehicleModel {

    private final CustomerModel customerModel;

    public VehicleModel() {
        this.customerModel = new CustomerModel();
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
}
