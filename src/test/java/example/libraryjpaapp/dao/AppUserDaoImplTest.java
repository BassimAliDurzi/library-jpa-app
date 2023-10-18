package example.libraryjpaapp.dao;

import example.libraryjpaapp.entity.AppUser;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.util.Assert;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Transactional
@Rollback(value = true)
public class AppUserDaoImplTest {

    @Autowired
    AppUserDaoImpl appUserDao;

    public AppUserDaoImplTest() {
    }

    @Test
    public void testCreatAppUser() {
        AppUser appUser = new AppUser("Bazi1980", "Ali2022");
        AppUser insertedAppUser = appUserDao.create(appUser);
        assertNotNull(insertedAppUser);
    }

}
