package net.guides.springboot2.springboot2jpacrudvoid.repository;
 
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import net.guides.springboot2.springboot2jpacrudvoid.model.User;

@Repository
//Setting up our database to be a MongoDB with Key's that are products, and values that are strings.
public interface UserRepository extends MongoRepository<User, String>{
    
}
