package com.example.demo.repositories;

import com.example.demo.domain.User;
import com.example.demo.domain.UserStatus;
import com.example.demo.dtos.UserResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findUserByEmail(String email);

    @Query(value = "{ 'status': { $ne: 'DELETED' }, 'email': ?0 }")
    Optional<User> findExistingUserByEmail(String email);

    @Query(value = "{ 'status': { $ne: 'DELETED' }, " +
            "  'fullName': { $regex: ?0, $options: 'i' }, " +
            "  'email': { $regex: ?1, $options: 'i' }, " +
            "  ?#{ [2] != null ? 'dateBirth' : '_ignore' } : ?2 }",
            sort = "{ 'fullName': 1 }")
    Page<User> findExistingUsersByFilters(String fullName, String email, LocalDate dateBirth, Pageable pageable);

    List<UserResponse> findByStatusNot(UserStatus status);
}
