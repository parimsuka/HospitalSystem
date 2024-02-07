package com.example.repository;

import com.example.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository of patient beans.
 */
@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    @Query(nativeQuery = true,
            value = "SELECT YEAR(visit_date) AS year, MONTH(visit_date) AS month, sex, AVG(age) AS averageAge " +
                    "FROM patient " +
                    "GROUP BY YEAR(visit_date), MONTH(visit_date), sex")
    List<Object[]> getMonthlyAverageAgeBySex();
}
