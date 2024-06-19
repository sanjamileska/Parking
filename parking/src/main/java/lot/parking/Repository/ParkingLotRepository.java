package lot.parking.Repository;

import lot.parking.Entity.ParkingLot;
import org.springframework.stereotype.Repository;

@Repository
public class ParkingLotRepository {
    private ParkingLot parkingLot = new ParkingLot();



    public void save(ParkingLot lot) {
        this.parkingLot = lot;
    }

    public ParkingLot get() {
        return parkingLot;
    }
}