package guru.springframework.sfgpetclinic.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "pet_type")
    @ManyToOne
    @JoinColumn(name = "tpye_id")
    private PetType petType;

    @ManyToOne()
    @JoinColumn(name = "owner_id")
    private Owner petOwner;

    @Column(name = "birth_date")
    private LocalDate birthDate;


}
