package com.organ.main;

import com.organ.entity.Review;
import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@NoArgsConstructor
@Data
// implicit @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor (only fields that requires special handling)
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "player_id", nullable = false)
    private Long playerId;
    private String firstName;
    private String lastName;
    private Integer rating;
    @OneToMany
    private Collection<Review> playerReviews;



}
