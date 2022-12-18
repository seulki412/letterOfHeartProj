package com.project.letterOfHeart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.letterOfHeart.domain.Message;
@Repository
public interface MessageRepository extends JpaRepository<Message, Long>{

	



	List<Message> findById(String u_id);

}
