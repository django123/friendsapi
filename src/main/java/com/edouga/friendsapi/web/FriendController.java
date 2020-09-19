package com.edouga.friendsapi.web;


import com.edouga.friendsapi.entity.Friend;
import com.edouga.friendsapi.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class FriendController {

    @Autowired
    private FriendService friendService;


    @GetMapping("/friends")
    public List<Friend> getFriend(){
      return  friendService.getFriends();
    }

    @PostMapping("/friends/addnew")
    public void addFriend(@RequestBody Friend friend){
        friendService.addFriend(friend);
    }

    @PutMapping("/friends/{id}/edit")
    public void updateFriend(@PathVariable("id") Integer id, @RequestBody Friend friend){

        friendService.updateFriend(friend);

    }

    @DeleteMapping("/friends/{id}/delete")
    public void deleteFriend(@PathVariable("id") Integer id){
        friendService.deleteFriend(id);
    }
}
