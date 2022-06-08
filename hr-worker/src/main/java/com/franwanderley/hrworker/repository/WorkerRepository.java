package com.franwanderley.hrworker.repository;

import com.franwanderley.hrworker.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
