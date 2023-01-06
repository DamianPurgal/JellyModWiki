package net.jellymod.jellymodwiki.user.service.definition;

import net.jellymod.jellymodwiki.user.dto.AddAppUserDto;
import net.jellymod.jellymodwiki.user.dto.AppUserDto;

import java.util.List;

public interface AppUserService {

    List<AppUserDto> getAllUsers();

    AppUserDto getUserById(Long id);

    AppUserDto addAppUser(AddAppUserDto addAppUserDto);
}
