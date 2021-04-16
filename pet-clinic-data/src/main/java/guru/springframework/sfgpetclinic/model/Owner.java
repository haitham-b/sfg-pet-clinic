package guru.springframework.sfgpetclinic.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "owners")
public class Owner extends Person {
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "telephone")
    private String telephone;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Pet> pets = new HashSet<>();
}
