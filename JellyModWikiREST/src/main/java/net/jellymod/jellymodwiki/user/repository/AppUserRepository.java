package net.jellymod.jellymodwiki.user.repository;

import net.jellymod.jellymodwiki.user.model.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, Long> {

    Optional<AppUser> findById(Long id);

    List<AppUser> findAll();

}
