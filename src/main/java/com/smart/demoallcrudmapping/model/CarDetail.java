package com.smart.demoallcrudmapping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.EAGER;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Table(name = "tbl_car_detail")
public class CarDetail {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "fracture_detail")
    private String fractureDetails;

    @OneToOne(cascade = ALL)
    @JoinColumn(name = "car_id", referencedColumnName = "id", unique = true)
    private Car car;


    @ManyToMany(cascade = ALL, fetch = EAGER)
    @JoinTable(name = "car_detail_car_feature",
            joinColumns = @JoinColumn(name = "car_detail_id"),
            inverseJoinColumns = @JoinColumn(name = "car_feature_id"))
    private Set<CarFeature> carFeatures = new HashSet<>();
}
