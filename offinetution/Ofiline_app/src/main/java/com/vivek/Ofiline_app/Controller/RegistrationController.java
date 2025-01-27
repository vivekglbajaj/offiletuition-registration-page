package com.vivek.Ofiline_app.Controller;


import com.vivek.Ofiline_app.Entity.Parent;
import com.vivek.Ofiline_app.Entity.Teacher;
import com.vivek.Ofiline_app.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/registration")
@CrossOrigin(origins = "http://127.0.0.1:5500") // Allow requests from your frontend URL
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/parent")
    public Parent registerParent(@RequestBody Parent parent) {
        return registrationService.registerParent(parent);
    }

    @PostMapping("/teacher")
    public Teacher registerTeacher(@RequestBody Teacher teacher){
        return registrationService.registerTeacher(teacher);
    }

}