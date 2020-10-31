package com.tts.twitter.repository;
import com.tts.twitter.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{
    com.tts.twitter.model.Role findByRole(String role);
}
