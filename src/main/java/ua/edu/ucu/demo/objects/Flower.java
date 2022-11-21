package ua.edu.ucu.demo.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "flowers")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Flower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String color;
    private int sepalLength;
    private int price;


    public Flower(String color, int sepalLength, int price) {
        this.color = color;
        this.sepalLength = sepalLength;
        this.price = price;
    }
}
