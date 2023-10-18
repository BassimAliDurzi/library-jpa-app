package example.libraryjpaapp.entity;
import jakarta.persistence.Entity;
import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appUserId;

    @Setter
    @Column(nullable = false, unique = true)
    private String username;

    @Setter
    @Column(nullable = false)
    private String password;

    private LocalDate regDate;

    @OneToOne
    @JoinColumn
    private Details details;


}
