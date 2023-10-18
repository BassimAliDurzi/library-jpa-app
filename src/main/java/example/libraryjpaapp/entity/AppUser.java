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

    @Column(nullable = false)
    private LocalDate regDate;

    @OneToOne
    @JoinColumn
    private Details details;

    public AppUser(String username, String password, Details details) {
        this.username = username;
        this.password = password;
        this.details = details;
        this.regDate = LocalDate.now();
    }

    public AppUser(String username, String password) {
        this.username = username;
        this.password = password;
        this.regDate = LocalDate.now();
    }
}
