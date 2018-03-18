package cern.spring.campus.calendar.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
public class Contribution implements Serializable, Schedulable {

    @Id
    private Integer id;

    private String title;

    private String description;

    @OneToOne
    private TimeSlot timeSlot;

    @ManyToOne
    private Speaker author;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public Speaker getAuthor() {
        return author;
    }

    public void setAuthor(final Speaker author) {
        this.author = author;
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(final TimeSlot timeSlot) {
        this.timeSlot = timeSlot;
    }

    @Override
    public String getType() {
        return Contribution.class.getSimpleName();
    }
}
