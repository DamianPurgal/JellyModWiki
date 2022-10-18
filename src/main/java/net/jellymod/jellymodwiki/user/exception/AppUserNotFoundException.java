package net.jellymod.jellymodwiki.user.exception;

import net.jellymod.jellymodwiki.errorhandling.BusinessException;
import org.springframework.http.HttpStatus;

public class AppUserNotFoundException extends BusinessException {

    public AppUserNotFoundException() { super(HttpStatus.NOT_FOUND, "User not found!"); }
}
