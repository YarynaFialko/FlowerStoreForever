package ua.edu.ucu.demo.controllers;

import ua.edu.ucu.demo.objects.Flower;
import ua.edu.ucu.demo.services.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
        return flowerService.getFlowers();
    }

    @PostMapping
    public void registerNewFlower(@RequestBody Flower flower) {
        flowerService.addNewFlower(flower);
    }


}
