package com.edouga.friendsapi.repository;

import com.edouga.friendsapi.entity.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRepository extends JpaRepository<Friend, Integer>{
}
