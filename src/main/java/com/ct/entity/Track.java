package com.ct.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "track")
@Getter
@Setter
@ToString
public class Track {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne(targetEntity = Person.class)
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private Person person;

    @ManyToOne(targetEntity = Location.class)
    @JoinColumn(name = "location_id", referencedColumnName = "id")
    private Location location;

    @Temporal(TemporalType.DATE)
    private Date toDate;
}
