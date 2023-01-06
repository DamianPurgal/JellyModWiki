package net.jellymod.jellymodwiki.user.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AppUserDto {
    private String email;
    private String firstname;
    private String lastname;
}
