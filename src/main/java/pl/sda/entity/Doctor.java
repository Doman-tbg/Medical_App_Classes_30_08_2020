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
public class Doctor {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 55)
    private String firstName;
    @Column(length = 55)
    private String lastName;
    @Column(length = 55)
    private String identyfikator;

    @OneToMany
    private Adress adress;

    @OneToMany(mappedBy = "doctor_id")
    private List<Appointment> appointments;

    @ManyToMany(mappedBy = "specialization")
    @JoinTable(name = "doc_spec", joinColumns = {
            @JoinColumn(name = "doctor_id"),
            @JoinColumn(name = "spec_id")
    })
    private List<Specialization> specialization;



}