package com.DataAccess.Abstact;

import com.Entities.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User,Integer> {
    boolean existsByEmail(String email);
    @EntityGraph(attributePaths = "todo")
    User findByEmailAndPassword(String email, String password);
}
