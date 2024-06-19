package lot.parking.Controller;

import lot.parking.Entity.ParkingLot;
import lot.parking.Service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/parking/lot")
public class ParkingLotController {
    @Autowired
    private ParkingLotService parkingLotService;

    @GetMapping("/")
    public ParkingLot getParkingLot() {
        return parkingLotService.get();
    }
}