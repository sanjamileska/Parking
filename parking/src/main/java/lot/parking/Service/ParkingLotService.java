package lot.parking.Service;

import lot.parking.Entity.ParkingLot;
import lot.parking.Repository.ParkingLotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingLotService {

    @Autowired
    private ParkingLotRepository parkingLotRepository;

    public void save(ParkingLot lot) {
        parkingLotRepository.save(lot);
    }

    public ParkingLot get() {
        return parkingLotRepository.get();
    }
}