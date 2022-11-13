package ua.edu.ucu.demo.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

//@Table
//@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Flower {
//    @Id
//    @SequenceGenerator(
//            name = "flower_sequence",
//            sequenceName = "flower_sequence",
//            allocationSize = 1
//    )
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "flower_sequence"
//    )

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
