package net.jellymod.jellymodwiki.user.service.implementation;

import lombok.RequiredArgsConstructor;
import net.jellymod.jellymodwiki.user.dto.AddAppUserDto;
import net.jellymod.jellymodwiki.user.dto.AppUserDto;
import net.jellymod.jellymodwiki.user.exception.AppUserNotFoundException;
import net.jellymod.jellymodwiki.user.mapper.AppUserMapper;
import net.jellymod.jellymodwiki.user.model.AppUser;
import net.jellymod.jellymodwiki.user.model.UserRole;
import net.jellymod.jellymodwiki.user.repository.AppUserRepository;
import net.jellymod.jellymodwiki.user.service.definition.AppUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AppUserServiceImpl implements AppUserService {

    private final AppUserRepository appUserRepository;

    private final AppUserMapper appUserMapper;

    @Override
    public List<AppUserDto> getAllUsers() {
        return appUserRepository.findAll().stream()
                .map(appUserMapper::mapAppUserToAppUserDto)
                .toList();
    }

    @Override
    public AppUserDto getUserById(Long id) {
        return appUserRepository.findById(id)
                .map(appUserMapper::mapAppUserToAppUserDto)
                .orElseThrow(AppUserNotFoundException::new);
    }

    @Override
    public AppUserDto addAppUser(AddAppUserDto addAppUserDto) {
        //validate user data...
        AppUser appUserToAdd = appUserMapper.mapAddAppUserDtoToAppUser(addAppUserDto);
        appUserToAdd.setUserRole(UserRole.BASIC);
        appUserToAdd.setLocked(false);
        appUserToAdd.setEnabled(true);

        return appUserMapper.mapAppUserToAppUserDto(
                appUserRepository.save(appUserToAdd)
        );
    }
}
