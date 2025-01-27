package com.vivek.Ofiline_app.Service;

import com.vivek.Ofiline_app.Entity.Parent;
import com.vivek.Ofiline_app.Entity.Teacher;
import com.vivek.Ofiline_app.Repo.ParentRepository;
import com.vivek.Ofiline_app.Repo.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private ParentRepository parentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

//   private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public Parent registerParent(Parent parent) {
        // Hash password before saving
//        parent.setPassword(passwordEncoder.encode(parent.getPassword()));
        return parentRepository.save(parent);
    }

    public Teacher registerTeacher(Teacher teacher) {
        // Hash password before saving
//        teacher.setPassword(passwordEncoder.encode(teacher.getPassword()));
        return teacherRepository.save(teacher);
    }
}
