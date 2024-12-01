package com.example.TO_DO.App.Repo;

import com.example.TO_DO.App.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TODORepository extends JpaRepository<Task,Integer > {
}
