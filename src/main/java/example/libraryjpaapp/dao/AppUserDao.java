package example.libraryjpaapp.dao;

import example.libraryjpaapp.entity.AppUser;

import java.util.Collection;
import java.util.Optional;

public interface AppUserDao {

    Optional<AppUser> findById(int id);
    Collection<AppUser> findAll();
    AppUser create(AppUser appUser);
    AppUser update(AppUser appUser);
    void delete(int id);
}
