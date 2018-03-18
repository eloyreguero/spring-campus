package cern.spring.campus.calendar.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.List;

@Entity
public class Speaker implements Serializable {

    @Id
    private Integer id;

    private String firstName;

    private String lastName;

    @ManyToOne
    private Country country;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(final Country country) {
        this.country = country;
    }
}
