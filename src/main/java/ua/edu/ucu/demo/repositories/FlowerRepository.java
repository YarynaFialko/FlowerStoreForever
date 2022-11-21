package ua.edu.ucu.demo.repositories;

import ua.edu.ucu.demo.objects.Flower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepository
        extends JpaRepository<Flower, Long> {
}
