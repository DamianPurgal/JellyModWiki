package net.jellymod.jellymodwiki.user.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import net.jellymod.jellymodwiki.user.dto.AddAppUserDto;
import net.jellymod.jellymodwiki.user.dto.AppUserDto;
import net.jellymod.jellymodwiki.user.service.definition.AppUserService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
@AllArgsConstructor
@RequestMapping("api/users")
public class AppUserController {

    private AppUserService appUserService;

    @PostMapping()
    @Operation(summary = "Add new user", description = "Add new user")
    public AppUserDto registerUser(@Valid @RequestBody AddAppUserDto addAppUserDto) {
        return appUserService.addAppUser(addAppUserDto);
    }

    @GetMapping("/{userId}")
    @Operation(summary = "Get user informations by id", description = "Get user by id")
    public AppUserDto getUserInfo(@PathVariable("userId") Long userId) {
        return appUserService.getUserById(userId);
    }

    @GetMapping
    @Operation(summary = "Get all users", description = "Get all users")
    public List<AppUserDto> getAllUsers() {
        return appUserService.getAllUsers();
    }
}
