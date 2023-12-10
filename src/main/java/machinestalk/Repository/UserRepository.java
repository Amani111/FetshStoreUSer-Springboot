package machinestalk.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import machinestalk.Entity.User;

public interface UserRepository extends JpaRepository<User,Long>{
    
}
