package model;

public class VehicleType {
    private int vehicleTypeId;
    private String typeName;

    public VehicleType(int vehicleTypeId, String typeName) {
        this.vehicleTypeId = vehicleTypeId;
        this.typeName = typeName;
    }

    public int getVehicleTypeId() {
        return vehicleTypeId;
    }

    public String getTypeName() {
        return typeName;
    }

}