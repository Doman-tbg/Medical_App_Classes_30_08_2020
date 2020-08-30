package pl.sda.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Patient {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 55)
    private String firstName;
    @Column(length = 55)
    private String lastName;
    @Column(length = 11, nullable = false)
    private String pesel;

    @OneToMany
    private Adress adress;

    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;



}
