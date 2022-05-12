package com.ct.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "person")
@Getter
@Setter
@ToString
public class Person {
    @Id
    private Integer id;

    private String name;

    private Integer age;

    private Integer sex;

    private Integer infectLevel;

    @ManyToOne
    private Location home;

    @ManyToOne(targetEntity = Location.class)
    @JoinColumn(name = "work_id", referencedColumnName = "id")
    private Location work;

    @ManyToOne(targetEntity = Location.class)
    @JoinColumn(name = "current_id", referencedColumnName = "id")
    private Location current;

    @OneToMany(mappedBy = "person")
    private Set<Track> track;
}
