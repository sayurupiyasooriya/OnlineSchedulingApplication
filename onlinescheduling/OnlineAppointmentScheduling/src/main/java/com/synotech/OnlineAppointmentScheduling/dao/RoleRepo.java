package com.synotech.OnlineAppointmentScheduling.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synotech.OnlineAppointmentScheduling.model.Role;

public interface RoleRepo extends JpaRepository<Role, Integer> {

	
}
