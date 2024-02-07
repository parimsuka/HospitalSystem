package com.example.entity;

import javax.persistence.*;

import com.example.hospital.CreateHospitalRequest;
import com.example.hospital.HospitalProto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@Accessors(chain = true)
@Table(name = "hospital")
@AllArgsConstructor
@NoArgsConstructor
public class Hospital implements Serializable {
    /**
     * Hospital ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String address;

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "hospital_patient", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))
    private Set<Patient> patients;

    public static Hospital fromGrpcType(CreateHospitalRequest hospitalReq) {
        Hospital hospital = new Hospital();
        BeanUtils.copyProperties(hospitalReq, hospital);
        return hospital;
    }

    public HospitalProto toGrpcType() {
        return HospitalProto.newBuilder().setId(id).setName(name).setAddress(address).build();
    }
}
