package com.synotech.OnlineAppointmentScheduling.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synotech.OnlineAppointmentScheduling.model.User;


public interface UserRepo extends JpaRepository<User, Long> {

}
