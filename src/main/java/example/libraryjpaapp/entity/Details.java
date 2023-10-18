package example.libraryjpaapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int detailsId;

    @Setter
    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String name;

    private LocalDate birthDate;


    public Details(String email, String name, LocalDate birthDate) {
        this.email = email;
        this.name = name;
        this.birthDate = birthDate;
    }
}
