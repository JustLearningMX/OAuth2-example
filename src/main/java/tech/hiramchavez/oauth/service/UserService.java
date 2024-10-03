package tech.hiramchavez.oauth.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tech.hiramchavez.oauth.dto.user.UserPublicDataDTO;
import tech.hiramchavez.oauth.dto.user.UserReqDTO;
import tech.hiramchavez.oauth.entities.User;
import tech.hiramchavez.oauth.mapper.user.UserMapper;
import tech.hiramchavez.oauth.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserPublicDataDTO createUser(UserReqDTO userReqDTO) {
        User user = userMapper.toUser(userReqDTO);
        return userMapper.toUserPublicDataDTO(userRepository.save(user));
    }
}
