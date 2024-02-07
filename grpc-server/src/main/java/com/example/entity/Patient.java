package com.example.entity;

import javax.persistence.*;

import com.example.hospital.CreatePatientRequest;
import com.example.hospital.PatientProto;
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
@Table(name = "patient")
@AllArgsConstructor
@NoArgsConstructor
public class Patient implements Serializable {
    /**
     * Patient ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String sex;
    private String age;
    private String phone;
    private String address;

    @JsonIgnore
    @ManyToMany(mappedBy = "patients")
    private Set<Hospital> hospitals;

    public static Patient fromGrpcType(CreatePatientRequest createPatientReq) {
        Patient patient = new Patient();
        BeanUtils.copyProperties(createPatientReq, patient);
        return patient;
    }

    public PatientProto toGrpcType() {
        return PatientProto.newBuilder().setId(id).setName(name).setSex(sex).
                setAge(age).setPhone(phone).setAddress(address).build();
    }
}
