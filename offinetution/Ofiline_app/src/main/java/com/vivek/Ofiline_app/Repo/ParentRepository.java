package com.vivek.Ofiline_app.Repo;


import com.vivek.Ofiline_app.Entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentRepository extends JpaRepository<Parent, Long> {
    // Custom queries (if any)
}
