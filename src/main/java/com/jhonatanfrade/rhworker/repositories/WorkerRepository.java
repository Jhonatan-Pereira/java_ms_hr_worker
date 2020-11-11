package com.jhonatanfrade.rhworker.repositories;

import com.jhonatanfrade.rhworker.entities.Worker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
  
}
