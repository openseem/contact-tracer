package com.ct.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "location")
@Getter
@Setter
@ToString
public class Location {
    @Id
    private Integer id;

    private String name;

    private String shortCut;

    private Integer riskLevel;

    private Integer feature;

    @OneToMany(mappedBy = "location")
    private Set<Track> everIn;
}
