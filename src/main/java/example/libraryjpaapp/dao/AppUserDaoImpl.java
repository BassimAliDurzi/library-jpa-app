package example.libraryjpaapp.dao;

import example.libraryjpaapp.entity.AppUser;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public class AppUserDaoImpl implements AppUserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Optional<AppUser> findById(int id) {
        AppUser foundedAppUser = entityManager.find(AppUser.class, id);
        return Optional.ofNullable(foundedAppUser);
    }

    @Override
    public Collection<AppUser> findAll() {
        entityManager.createQuery("select a from AppUser a", AppUser.class)
                .getResultList();
        return null;
    }

    @Override
    @Transactional
    public AppUser create(AppUser appUser) {
        entityManager.persist(appUser);
        return appUser;
    }

    @Override
    public AppUser update(AppUser appUser) {
        entityManager.merge(appUser);
        return appUser;
    }

    @Override
    @Transactional
    public void delete(int id) {
        AppUser foundedAppUser = entityManager.find(AppUser.class, id);
        if (foundedAppUser != null) entityManager.remove(foundedAppUser);

    }
}
