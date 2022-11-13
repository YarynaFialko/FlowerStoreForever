package ua.edu.ucu.demo.services;

import org.springframework.stereotype.Service;
import ua.edu.ucu.demo.objects.Flower;

import java.util.Arrays;
import java.util.List;

@Service
public class FlowerService {

    public List<Flower> getFlowers() {
        return Arrays.asList(new Flower( "black", 12, 32),
                new Flower("blue", 50, 132));
    }
}
