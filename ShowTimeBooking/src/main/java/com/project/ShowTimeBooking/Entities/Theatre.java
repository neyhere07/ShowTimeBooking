package com.project.ShowTimeBooking.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.Objects;

@Entity
@Table
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString(exclude = {"address", "screens"})
public class Theatre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(nullable = false, unique = true)
    String code;
    @Column(nullable = false)
    String name;
    @Column(nullable = false)
    int numberOfScreens;
    @OneToOne(mappedBy = "theatre", cascade = CascadeType.ALL)
    Address address;
    @OneToMany(mappedBy = "theatre", cascade = CascadeType.ALL) //parent with respect to number of screens
    List<Screen> screens;
    @Override
    public int hashCode() {
        return Objects.hash(id, code, name, numberOfScreens, address, screens);
    }
}
