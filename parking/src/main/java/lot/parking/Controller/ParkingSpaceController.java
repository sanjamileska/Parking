package lot.parking.Controller;

import lot.parking.Entity.ParkingSpace;
import lot.parking.Service.ParkingSpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parking/spaces")
public class ParkingSpaceController {
    @Autowired
    private ParkingSpaceService parkingSpaceService;

    @PostMapping("/")
    public void createParkingSpace(@RequestBody ParkingSpace space) {
        parkingSpaceService.save(space);
    }

    @GetMapping("/{id}")
    public ParkingSpace getParkingSpaceById(@PathVariable Long id) {
        return parkingSpaceService.findById(id)
                ;
    }

    @GetMapping("/")
    public List<ParkingSpace> getAllParkingSpaces() {
        return parkingSpaceService.findAll();
    }
}