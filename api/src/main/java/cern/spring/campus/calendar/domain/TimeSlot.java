package cern.spring.campus.calendar.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class TimeSlot implements Serializable {

    @Id
    private Integer id;

    private Date start;

    private Date end;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(final Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(final Date end) {
        this.end = end;
    }
}
