package net.jellymod.jellymodwiki.user.mapper;

import net.jellymod.jellymodwiki.user.dto.AddAppUserDto;
import net.jellymod.jellymodwiki.user.dto.AppUserDto;
import net.jellymod.jellymodwiki.user.model.AppUser;
import org.mapstruct.Mapper;

@Mapper()
public interface AppUserMapper {

    AppUserDto mapAppUserToAppUserDto(AppUser appUser);

    AppUser mapAddAppUserDtoToAppUser(AddAppUserDto addAppUserDto);
}
