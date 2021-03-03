package com.feyi.roadtransport.service;

import com.feyi.roadtransport.model.Ticket;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TicketService {

    void saveTicket(Ticket ticket);

    void deleteTicketById(Long Id);

    Optional<Ticket> getTicketById(Long Id);

    List<Ticket> getAllTickets();

    Ticket EditTicket(Long Id, Ticket ticket);
}
