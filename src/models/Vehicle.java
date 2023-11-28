package models;

import enums.VehicleType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    int id;
    String vehicleNumber;
    String userName;
    VehicleType vehicleType;
    String make;

}
