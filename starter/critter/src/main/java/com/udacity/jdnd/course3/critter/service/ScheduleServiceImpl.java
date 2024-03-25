package com.udacity.jdnd.course3.critter.service;

import com.udacity.jdnd.course3.critter.model.Employee;
import com.udacity.jdnd.course3.critter.model.Pet;
import com.udacity.jdnd.course3.critter.model.Schedule;
import com.udacity.jdnd.course3.critter.repository.EmployeeRepository;
import com.udacity.jdnd.course3.critter.repository.PetRepository;
import com.udacity.jdnd.course3.critter.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    private final PetRepository petRepository;
    @Autowired
    private final EmployeeRepository employeeRepository;
    @Autowired
    private final ScheduleRepository scheduleRepository;

    public ScheduleServiceImpl(PetRepository petRepository, EmployeeRepository employeeRepository, ScheduleRepository scheduleRepository) {
        this.petRepository = petRepository;
        this.employeeRepository = employeeRepository;
        this.scheduleRepository = scheduleRepository;
    }

    @Override
    public Schedule createSchedule(Schedule schedule, List<Long> employeeIds, List<Long> petIds) {
        List<Pet> pets = petRepository.findAllById(employeeIds);
        List<Employee> employees = employeeRepository.findAllById(employeeIds);

        schedule.setPets(pets);
        schedule.setEmployees(employees);
        return scheduleRepository.save(schedule);
    }

    @Override
    public List<Schedule> getSchedules() {
        return scheduleRepository.findAll();
    }

    @Override
    public List<Schedule> getSchedulesByPetId(long petId) {
        return scheduleRepository.findSchedulesByPetId(petId);
    }

    @Override
    public List<Schedule> getSchedulesByEmployeeId(long employeeId) {
        return scheduleRepository.findSchedulesByEmployeeId(employeeId);
    }

    @Override
    public List<Schedule> getSchedulesByCustomerId(long customerId) {
        return scheduleRepository.findSchedulesByCustomerId(customerId);
    }
}
