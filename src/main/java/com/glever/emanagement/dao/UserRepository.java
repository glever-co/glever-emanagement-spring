package com.glever.emanagement.dao;

import com.glever.emanagement.entity.User;
import com.glever.emanagement.entity.UserRole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Set;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends JpaRepository<User, Integer> {
    //Page<User> findByUserId(@Param("user_id") Integer userId, Pageable pageable);
   // Page<User> findByUserIdAndUserRoles(@Param("user_id") Integer userId, @Param("user") Set<UserRole> userRoles, Pageable pageable);

}
