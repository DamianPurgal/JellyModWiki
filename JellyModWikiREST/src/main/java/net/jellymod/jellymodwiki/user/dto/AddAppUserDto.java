package net.jellymod.jellymodwiki.user.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@Builder
public class AddAppUserDto {

    @Email(message = "Email should be valid")
    @Schema(description="Username/email", example = "JellyMod@gmail.com")
    private String email;

    @NotBlank
    @Size(min = 5, max = 50,
            message = "Password must be between 5 and 50 characters")
    @Schema(description="Password", example = "password")
    private String password;

    @NotBlank(message = "First name cannot be empty")
    @Schema(description="Firstname", example = "Jelly")
    private String firstname;

    @NotBlank(message = "Last name cannot be empty")
    @Schema(description="Lastname", example = "Mod")
    private String lastname;
}
