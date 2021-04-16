package guru.springframework.sfgpetclinic.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Arrays;
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

    @Override
    public String toString() {
        return " { address: " + address + ", city: " + city + ", telephone: " + telephone + ", pets: " + Arrays.toString(pets.stream().map(BaseEntity::getId).toArray()) + " }";
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }
}
