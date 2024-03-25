package com.udacity.jdnd.course3.critter.service;

import com.udacity.jdnd.course3.critter.model.Schedule;

import java.util.List;

public interface ScheduleService {
    Schedule createSchedule(Schedule schedule, List<Long> employeeIds, List<Long> petIds);
    List<Schedule> getSchedules();
    List<Schedule> getSchedulesByPetId(long petId);
    List<Schedule> getSchedulesByEmployeeId(long employeeId);
    List<Schedule> getSchedulesByCustomerId(long customerId);
}
