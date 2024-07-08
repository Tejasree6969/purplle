package com.purplle.service;

import org.springframework.stereotype.Service;

import com.purplle.dto.UserDto;
import com.sun.java_cup.internal.runtime.Scanner;

@Service
public class UserService {

	
	public UserDto getAllUsers() {
		
		
		
		UserDto userDto = new UserDto();
		
		userDto.setUserId(122);
		userDto.setUserFirstName("teja");
		userDto.setUserLastName("sree");
		userDto.setMobileNum(983777217);
		userDto.setEmailId("tejas@gmail.com");
		userDto.setGender("Female");
		userDto.setPassword("X2Gj");
		userDto.setAge(13);
		userDto.setAddress("123,gandhi nagar,gtl");
	
		long userId = userDto.getUserId() ;
		String userFirstName = userDto.getUserFirstName();
		String userLastName = userDto.getUserLastName();
		
		long mobileNum = userDto.getMobileNum();
		String emailId =userDto.getEmailId();
		String password = userDto.getPassword();
		String gender= userDto.getGender();
		long age = userDto.getAge();
		String address= userDto.getAddress();
		

		System.out.println("userId = " + userId + "FirstName = " + userFirstName + " LastName = " + userLastName + " MobileNumber = " + mobileNum
				+ " EmailId = " + emailId + "Password = " + password + " Gender = " + gender + "age = " + age + "address = " + address );
		
		return userDto;
		
	}
	
	
	public UserDto updateUser(UserDto userDto) {
		
		
		String emailId= userDto.setEmailId(userDto.getEmailId());
		
		System.out.println("UpdatedEmailId = " + emailId);
		
		return userDto;
	}


	
}
