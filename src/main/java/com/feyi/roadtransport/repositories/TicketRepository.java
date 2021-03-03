package com.feyi.roadtransport.repositories;

import com.feyi.roadtransport.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
