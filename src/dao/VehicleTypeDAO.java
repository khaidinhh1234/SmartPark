package dao;

import model.VehicleType;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VehicleTypeDAO {

    public List<VehicleType> getAll() throws Exception {
        List<VehicleType> list = new ArrayList<>();

        String sql = """
                SELECT VEHICLE_TYPE_ID, TYPE_NAME
                FROM VEHICLE_TYPE
                ORDER BY VEHICLE_TYPE_ID
                """;

        try (Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                VehicleType vehicleType = new VehicleType(
                        rs.getInt("VEHICLE_TYPE_ID"),
                        rs.getString("TYPE_NAME"));

                list.add(vehicleType);
            }
        }

        return list;
    }
}