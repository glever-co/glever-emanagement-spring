package com.glever.emanagement.dao;

import com.glever.emanagement.entity.UserRole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "userRoles", path = "userRoles")
public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {

    Page<UserRole> findByUserUserIdAndRoleRoleId (@Param("user_id") Integer userId, @Param("role_id") Integer roleId, Pageable pageable);
    Page<UserRole> findByRoleRoleId (@Param("role_id") Integer roleId, Pageable pageable);
}
