package lot.parking.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lot.parking.Enum.ParkingRequestType;
import lot.parking.Enum.PrepaidCategorization;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParkingRequest {
    private Long id;
    private Long parkingSpaceId;
    private String licensePlateNumber;
    private double totalCost;
    private ParkingRequestType type;
    private int durationInHours;
    private PrepaidCategorization category;


}