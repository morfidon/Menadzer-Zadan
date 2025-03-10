package com.gem.menadzerzadan.repository;

import com.gem.menadzerzadan.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>
{

}
