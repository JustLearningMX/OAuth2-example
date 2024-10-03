package tech.hiramchavez.oauth.dto.user;

import jakarta.validation.constraints.NotBlank;
import tech.hiramchavez.oauth.entities.User;

import java.io.Serializable;

/**
 * DTO for {@link User}
 */
public record UserReqDTO(
        @NotBlank(message = "El nombre es requerido")
        String name,

        @NotBlank(message = "Un apellido es requerido")
        String lastname,

        @NotBlank(message = "El email es requerido")
        String email,

        @NotBlank(message = "El password es requerido")
        String password
) implements Serializable {
}