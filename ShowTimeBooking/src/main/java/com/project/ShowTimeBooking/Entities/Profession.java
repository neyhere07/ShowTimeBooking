package com.project.ShowTimeBooking.Entities;

import com.project.ShowTimeBooking.Enums.ProfessionEnum;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;
@Entity
@Table
@Builder
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Profession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(nullable = false, unique = true)
    @Enumerated(value = EnumType.STRING)
    ProfessionEnum name;
    @ManyToMany(mappedBy = "professionList")
    List<FilmMaker> filmMakerList;
}
