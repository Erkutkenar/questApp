package controllers;

import com.project.questapp.entities.User;
import org.springframework.web.bind.annotation.*;
import services.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers(){

        return userService.getAllUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User newUser){
//        return userService.save(newUser); Business Logic için UserService'i yazınca bu alanları değiştirdik artık serivce ulaşıp ordan datayı alıyoruz.
        return userService.saveOneUser(newUser);
    }

    @GetMapping("/{userId}")
    public User getOneUserById(@PathVariable Long userId) {
        return userService.getOneUserById(userId);
    }

    @PutMapping("/{userId}")
    public User updateOneUser(@PathVariable Long userId, @RequestBody User newUser) {
        return userService.updateOneUser(userId,newUser);

    }

    @DeleteMapping
    public void deleteOneUser(@PathVariable Long userId) {
        userService.deleteById(userId);
    }
}

