package Driver;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


public interface UserRepository extends CrudRepository<User, Long> {

	

	List<User> findByUserName(String userName);
    
}
