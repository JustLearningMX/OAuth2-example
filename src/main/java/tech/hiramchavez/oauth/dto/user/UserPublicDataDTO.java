package tech.hiramchavez.oauth.dto.user;

import tech.hiramchavez.oauth.entities.User;

import java.io.Serializable;

/**
 * DTO for {@link User}
 */
public record UserPublicDataDTO(
        Long id,
        String name,
        String lastname,
        String email
) implements Serializable {
}