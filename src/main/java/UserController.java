import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class UserController {

    @Autowired
    private UserProperties userProperties;

    @GetMapping(value = "users")
    public List<User> userList(){
        return userProperties.findAll();
    }

}
