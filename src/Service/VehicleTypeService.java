package Service;

import dao.VehicleTypeDAO;
import model.VehicleType;

import java.util.List;

public class VehicleTypeService {
    private final VehicleTypeDAO vehicleTypeDAO = new VehicleTypeDAO();

    public List<VehicleType> getAllVehicleTypes() throws Exception {
        return vehicleTypeDAO.getAll();
    }
}