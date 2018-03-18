package cern.spring.campus.calendar.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
public class SocialEvent implements Serializable, Schedulable {
    @Id
    private Integer id;

    private String description;

    private String venue;

    @OneToOne
    private TimeSlot timeSlot;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(final String venue) {
        this.venue = venue;
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(final TimeSlot timeSlot) {
        this.timeSlot = timeSlot;
    }

    @Override
    public String getType() {
        return SocialEvent.class.getSimpleName();
    }
}
