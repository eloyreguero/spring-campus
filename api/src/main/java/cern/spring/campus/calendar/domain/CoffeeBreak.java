package cern.spring.campus.calendar.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
public class CoffeeBreak implements Serializable, Schedulable {

    @Id
    private Integer id;

    @OneToOne
    private TimeSlot timeSlot;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(final TimeSlot timeSlot) {
        this.timeSlot = timeSlot;
    }

    @Override
    public String getType() {
        return CoffeeBreak.class.getSimpleName();
    }
}
