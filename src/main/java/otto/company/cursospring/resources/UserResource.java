package otto.company.cursospring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import otto.company.cursospring.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"otto samuel", "ottosaamuek01@gmail.com","(91)99395252","alunonota1000");
        return ResponseEntity.ok().body(u);
    }
}
