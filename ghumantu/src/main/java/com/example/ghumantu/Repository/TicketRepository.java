package com.example.ghumantu.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ghumantu.Model.Ticket;



@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer>{
	
	
}
