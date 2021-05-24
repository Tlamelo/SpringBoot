package com.tlamelo.discounts.bootdiscounts.data;

import com.tlamelo.discounts.bootdiscounts.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}