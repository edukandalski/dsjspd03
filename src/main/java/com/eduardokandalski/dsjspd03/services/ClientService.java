package com.eduardokandalski.dsjspd03.services;

import com.eduardokandalski.dsjspd03.dto.ClientDTO;
import com.eduardokandalski.dsjspd03.entities.Client;
import com.eduardokandalski.dsjspd03.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client client = clientRepository.findById(id).get();
        return new ClientDTO(client);
    }
}
