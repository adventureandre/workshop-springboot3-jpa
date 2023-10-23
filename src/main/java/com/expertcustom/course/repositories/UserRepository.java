package com.expertcustom.course.repositories;

import com.expertcustom.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Long> {}
