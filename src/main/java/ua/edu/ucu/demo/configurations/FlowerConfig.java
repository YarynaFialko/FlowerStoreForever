package ua.edu.ucu.demo.configurations;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import ua.edu.ucu.demo.objects.Flower;
import ua.edu.ucu.demo.repositories.FlowerRepository;

import java.util.Arrays;

public class FlowerConfig {

    @Bean
    CommandLineRunner commandLineRunner(FlowerRepository repository) {
        return args ->  {
            Flower rose = new Flower(
                    "blue",
                    10,
                    100
            );
            Flower tulip = new Flower(
                    "red",
                    6,
                    210
            );
//            repository.saveAll(Arrays.asList(rose, tulip));
            repository.save(rose);
            repository.save(tulip);
        };

    }
}
