package com.endie.avizandum.login.repository;

import com.endie.avizandum.login.model.Role;
import com.endie.avizandum.login.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
