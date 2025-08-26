package com.vrk.course.resources;

import com.vrk.course.entities.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserResource {
    
    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        
        User u1 = new User(1L, "jao", "jao@gamil", "9074390754", "12345687");
        User u2 = new User(2L, "jao", "jao@gamil", "9074390754", "12345687");
        User u3  = new User(3L, "jao", "jao@gamil", "9074390754", "12345687");
        User u4 = new User(3L, "jao", "jao@gamil", "9074390754", "12345687");
        
        List<User> listaDeUsers = new ArrayList<>();
        
        listaDeUsers.add(u1);
        listaDeUsers.add(u2);
        listaDeUsers.add(u3);
        listaDeUsers.add(u4);
        
        System.out.println(listaDeUsers);
        
        return ResponseEntity.ok().body(listaDeUsers);
        
    }
    
}
