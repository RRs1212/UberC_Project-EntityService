package com.UberP.UberEntity.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Driver extends BaseModel{

    private String name;

    @Column(nullable = false, unique = true)
    private String licenseNumber;


    @Column(nullable = false,unique = true)
    private String PhomeNumber;

    @OneToMany(mappedBy = "driver")
    @Fetch(FetchMode.SUBSELECT)
    private List<Booking> Bookings;

    @Column(nullable = false,unique = true)
    private String AadharNumber;

}
