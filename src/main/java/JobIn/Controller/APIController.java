package JobIn.Controller;

import JobIn.Model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    @GetMapping("/demo")
    public User getUser() {
        User user = new User();
        user.setUserId(1);
        user.setUsername("YuiHatano");
        user.setPassword("banAnhTu");
        return user;
    }
}
