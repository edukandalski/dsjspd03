package com.eduardokandalski.dsjspd03.repositories;

import com.eduardokandalski.dsjspd03.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
