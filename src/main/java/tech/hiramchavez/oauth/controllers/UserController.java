package tech.hiramchavez.oauth.controllers;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tech.hiramchavez.oauth.dto.user.UserPublicDataDTO;
import tech.hiramchavez.oauth.dto.user.UserReqDTO;
import tech.hiramchavez.oauth.service.UserService;

@RestController("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    @Transactional
    public UserPublicDataDTO createUser(@RequestBody @Valid UserReqDTO userReqDTO) {
        return userService.createUser(userReqDTO);
    }

}
