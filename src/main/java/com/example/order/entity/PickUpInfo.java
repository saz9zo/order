package com.example.order.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class PickUpInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Date beginDate;
    Date endDate;
    Date locationTimeZone;

    public PickUpInfo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getLocationTimeZone() {
        return locationTimeZone;
    }

    public void setLocationTimeZone(Date locationTimeZone) {
        this.locationTimeZone = locationTimeZone;
    }
}
