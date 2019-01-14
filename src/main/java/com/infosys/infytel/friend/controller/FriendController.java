package com.infosys.infytel.friend.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FriendController {
	
	@RequestMapping("/friend")
	public String getFriends() {
		return "friend";
	}
	
	@RequestMapping("/friendNumbers/{num}")
	public List<Integer> getFriendsNumber(@PathVariable Integer num){
		if(num == 5) {
			throw new RuntimeException();
		}
		System.out.println("==== get friend numbers ====");
		return Arrays.asList(10,11,12,13);
	}
	
	@RequestMapping("/friendsSync")
	public List<Integer> getFriendsSync(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Arrays.asList(4,95,7);
	}
	
	@RequestMapping("/friendsAsync")
	public Integer getFriendsAsync(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 23;
	}

}
