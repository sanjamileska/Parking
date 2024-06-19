package lot.parking.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ParkingSpace {
    private Long id;
    private boolean availabilityStatus;
    private double totalEarnings;
    private ParkingRequest currentRequest;


    public ParkingSpace(Long id) {
        this.id = id;
        this.availabilityStatus = true;
        this.totalEarnings = 0.0;
        this.currentRequest = null;
    }
}