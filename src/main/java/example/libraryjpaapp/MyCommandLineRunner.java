package example.libraryjpaapp;

import example.libraryjpaapp.dao.AppUserDao;
import example.libraryjpaapp.dao.DetailsDao;
import example.libraryjpaapp.entity.AppUser;
import example.libraryjpaapp.entity.Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired
    AppUserDao appUserDao;
    @Autowired
    DetailsDao detailsDao;
    @Override
    public void run(String... args) throws Exception {

        Details details = new Details("wassim@gmail.com", "Wassim", LocalDate.of(1977,1,1));
        detailsDao.create(details);
        AppUser appUser = new AppUser("wassim1977", "haroon2008",details);
        appUserDao.create(appUser);

    }
}
