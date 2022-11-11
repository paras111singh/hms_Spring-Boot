package com.hms.repository;

import com.hms.model.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface userRepository extends JpaRepository<user,Integer> {

	//directly updates the phone number
	@Transactional 
	@Modifying
	@Query(value="update user set user_phone=:userphone where user_id=:userid")
	int updatePhone(int userid,String userphone);
	//directly updates the userfee
	@Transactional 
	@Modifying
	@Query(value="update user set user_fee=:userFee where user_id=:userid")
	int updateFee(int userid,int userFee);
	
	
	// directly allots the room to user
	@Transactional 
	@Modifying
	@Query(value="update user set user_room_room_id=:roomid where user_id=:userid")
	int allotRoom(int userid,int roomid);
	
	
	// gets the details of specific user table directly using userid
	@Query(value="select * from user where user_id=?1",nativeQuery=true)
	user findByUserId(int userid);
	// gets the details of specific user table directly using username
	@Query(value="select * from user where user_name=?1",nativeQuery=true)
	user findByUserName(String username);
	
	
}
