package Controller;

import Service.VehicleTypeService;
import model.VehicleType;
import java.util.List;

public class VehicleTypeController {

    private VehicleTypeService service = new VehicleTypeService();

    // Lấy danh sách loại xe để hiển thị
    public List<VehicleType> getAllVehicleTypes() throws Exception {
        return service.getAllVehicleTypes();
    }
}