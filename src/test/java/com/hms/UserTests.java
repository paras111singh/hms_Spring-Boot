
package com.hms;

import static org.junit.jupiter.api.Assertions.assertSame;

import com.hms.exception.globalException;
import com.hms.serviceImpl.userServiceImpl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTests {
	@Autowired
	private userServiceImpl service;
	//method : 1.1
	//positive test case
	@Test
	void positiveTestDelete()throws globalException {
		
		var expected="deleted";
			var actual=service.deleteUser(4);
			assertSame(expected,actual);
	}
	//method : 1.2
	//negative test case
	//wrong id(user with id : 100 do not exists)
	@Test
	void negativeTestDelete()throws globalException {
		var expected="deleted";
			var actual=service.deleteUser(100);
			assertSame(expected,actual);
	}
	//method : 2.1
	//positive test case
	@Test
	void positiveTestPhone()throws globalException {
		var expected="updated!...";
			var actual=service.updatePhone(4,"9899653120");
			assertSame(expected,actual);
	}
	//method : 2.1
	//negative test case
	//wrong id and number passed
	@Test
	void negativeTestPhone()throws globalException {
		var expected="deleted";
			var actual=service.updatePhone(100,"78541236");
			assertSame(expected,actual);
		}
	
}
