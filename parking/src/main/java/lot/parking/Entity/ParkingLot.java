package lot.parking.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParkingLot {
    private List<ParkingSpace> parkingSpaces;
    private double dailyEarnings;
    private List<ParkingRequest> processedRequests;



}