package net.datatech.JournalApp.repository;

import net.datatech.JournalApp.entity.JournalEntry;
import net.datatech.JournalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUserName(String username);
}
