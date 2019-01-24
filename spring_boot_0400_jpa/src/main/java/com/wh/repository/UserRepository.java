package com.wh.repository;

import com.wh.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wh on 17-7-2.
 */

public interface UserRepository extends JpaRepository<User, Integer> {

}
