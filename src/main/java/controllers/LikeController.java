package controllers;

import com.project.questapp.entities.Like;
import org.springframework.web.bind.annotation.*;
import services.LikeService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/likes")
public class LikeController {
    private LikeService likeService;

    public LikeController(LikeService likeService) {
        this.likeService = likeService;
    }

    @GetMapping
    public List<Like> getAllLikes(@RequestParam Optional<Long> userId, @RequestParam Optional<Long> postId  ) {
        return likeService.getAllLikes(userId,postId);

    }
    @PostMapping
    public
}
