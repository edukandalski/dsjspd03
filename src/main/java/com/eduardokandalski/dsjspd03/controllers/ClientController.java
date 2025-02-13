package com.eduardokandalski.dsjspd03.controllers;

import com.eduardokandalski.dsjspd03.dto.ClientDTO;
import com.eduardokandalski.dsjspd03.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id) {
        return clientService.findById(id);
    }

    @GetMapping
    public Page<ClientDTO> findAll(Pageable pageable) {
        return clientService.findAll(pageable);
    }

    @PostMapping
    public ClientDTO insert(@RequestBody ClientDTO dto) {
        return clientService.insert(dto);
    }
}
