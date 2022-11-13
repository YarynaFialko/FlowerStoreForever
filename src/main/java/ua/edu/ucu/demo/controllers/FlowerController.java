package ua.edu.ucu.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.demo.objects.Flower;
import ua.edu.ucu.demo.services.FlowerService;
import java.util.List;


@RestController
@RequestMapping(path = "api/flowers")
public class FlowerController {

    private final FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping
    public List<Flower> getFlowers() {
        // call the Service to get the data
        return flowerService.getFlowers();
    }

}
