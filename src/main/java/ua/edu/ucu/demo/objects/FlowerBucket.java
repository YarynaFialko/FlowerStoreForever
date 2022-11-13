package ua.edu.ucu.demo.objects;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private final List<Flower> flowerList = new ArrayList<>();

    public void add(Flower flower) {
        flowerList.add(flower);
    }
}
