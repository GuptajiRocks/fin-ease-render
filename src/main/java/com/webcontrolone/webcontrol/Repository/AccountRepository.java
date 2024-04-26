package com.webcontrolone.webcontrol.Repository;

import com.webcontrolone.webcontrol.Entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}