package com.ving.jpademo.model;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author liuweijie
 * @date 2020/9/17
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
