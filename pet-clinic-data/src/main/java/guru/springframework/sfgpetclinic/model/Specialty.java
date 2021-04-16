package guru.springframework.sfgpetclinic.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "specialities")
public class Specialty extends BaseEntity {

    @Column(name = "discription")
    private String discription;
}
