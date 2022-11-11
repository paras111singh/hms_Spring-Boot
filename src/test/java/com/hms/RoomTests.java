package com.hms;



import static org.junit.jupiter.api.Assertions.assertSame;

import com.hms.exception.globalException;
import com.hms.serviceImpl.roomServiceImpl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RoomTests {

	@Autowired
	private roomServiceImpl service;
	
	//positive test case
	@Test
	void positiveTestDelete()throws globalException {
		var expected="deleted";
			var actual=service.deleteRoom(101);
			assertSame(expected,actual);
	}
	//negative test case
	@Test
	void negativeTestDelete()throws globalException {
		var expected="deleted";
			var actual=service.deleteRoom(900);
			assertSame(expected,actual);
	}
}
