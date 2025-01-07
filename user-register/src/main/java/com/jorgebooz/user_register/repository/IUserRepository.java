package com.jorgebooz.user_register.repository;

import com.jorgebooz.user_register.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<Users, Long> {
}
