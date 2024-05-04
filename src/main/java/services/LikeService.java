package services;


import com.project.questapp.entities.Like;
import com.project.questapp.repos.LikeRepository;

import java.util.List;
import java.util.Optional;

public class LikeService {
    private LikeRepository likeRepository;

    public LikeService(LikeRepository likeRepository) {
        this.likeRepository = likeRepository;

    }

    public List<Like> getAllLikes(Optional<Long> userId, Optional<Long> postId) {
        if(userId.isPresent() && postId.isPresent()) {
            return likeRepository.findByUserIdAndPostID(userId.get(), postId.get());
        } else if (userId.isPresent()) {
            return likeRepository.findByUserId(userId.get());
        } else if (postId.isPresent()) {
            return likeRepository.findByPostId(postId.get());
        }else
            return likeRepository.findAll();

    }
}
