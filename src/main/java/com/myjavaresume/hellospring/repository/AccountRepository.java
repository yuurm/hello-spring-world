package com.myjavaresume.hellospring.repository;

import com.myjavaresume.hellospring.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
