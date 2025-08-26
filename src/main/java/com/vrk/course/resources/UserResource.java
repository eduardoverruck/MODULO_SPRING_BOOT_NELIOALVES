package com.vrk.course.resources;

import com.vrk.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserResource {
    
    @GetMapping
    public ResponseEntity<User> findAll(){
        
        User u1 = new User(1L, "jao", "jao@gamil", "9074390754", "12345687");
        User u2 = new User(2L, "jao", "jao@gamil", "9074390754", "12345687");
        User u3  = new User(3L, "jao", "jao@gamil", "9074390754", "12345687");
        User u4 = new User(3L, "jao", "jao@gamil", "9074390754", "12345687");
        
        return ResponseEntity.ok().body(u1);
        
    }
    
}
