package com.feyi.roadtransport.service;

import com.feyi.roadtransport.model.Terminal;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TerminalService {

    void saveTerminal(Terminal terminal);

    void deleteTerminalById(Long Id);

    Optional<Terminal> getTerminalById(Long Id);

    List<Terminal> getAllTerminals();

    Terminal EditTerminal(Long Id, Terminal terminal);
}
