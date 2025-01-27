package com.vivek.Ofiline_app.Repo;

import com.vivek.Ofiline_app.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    // Custom queries (if any)
}