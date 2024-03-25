package com.udacity.jdnd.course3.critter.repository;

import com.udacity.jdnd.course3.critter.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    List<Schedule> findSchedulesByPetId(long petId);
    List<Schedule> findSchedulesByEmployeeId(long employeeId);
    List<Schedule> findSchedulesByCustomerId(long customerId);
}
