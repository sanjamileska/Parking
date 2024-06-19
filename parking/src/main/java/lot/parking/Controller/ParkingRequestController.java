package lot.parking.Controller;

import lot.parking.Entity.ParkingRequest;
import lot.parking.Service.ParkingRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parking/requests")
public class ParkingRequestController {
    @Autowired
    private ParkingRequestService parkingRequestService;

    @PostMapping("/")
    public void createParkingRequest(@RequestBody ParkingRequest request) {
        parkingRequestService.save(request);
    }

    @DeleteMapping("/{id}")
    public void deleteParkingRequest(@PathVariable Long id) {
        parkingRequestService.delete(id)
        ;
    }

    @GetMapping("/{id}")
    public ParkingRequest getParkingRequestById(@PathVariable Long id) {
        return parkingRequestService.findById(id)
                ;
    }

    @GetMapping("/")
    public List<ParkingRequest> getAllParkingRequests() {
        return parkingRequestService.findAll();
    }
}