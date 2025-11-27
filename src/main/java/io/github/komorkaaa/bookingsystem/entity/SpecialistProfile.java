package io.github.komorkaaa.bookingsystem.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "specialist_profiles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SpecialistProfile {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToOne
  @JoinColumn(name = "user_id", nullable = false, unique = true)
  private User user;

  @Column(nullable = false)
  private String category;

  @Column(nullable = false)
  private String description;

  @Column(nullable = false)
  private String price;

}
