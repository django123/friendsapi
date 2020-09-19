package com.edouga.friendsapi.service;


import com.edouga.friendsapi.entity.Friend;
import com.edouga.friendsapi.repository.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendService {

    @Autowired
    private FriendRepository friendRepository;

    public List<Friend> getFriends(){
        return friendRepository.findAll();
    }

    public void addFriend(Friend friend){
          friendRepository.save(friend);
    }

    public void updateFriend(Friend friend){
        friendRepository.save(friend);
    }

    public void deleteFriend(Integer id){
        friendRepository.deleteById(id);
    }
}
