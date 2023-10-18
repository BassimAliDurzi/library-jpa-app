package example.libraryjpaapp.dao;
import example.libraryjpaapp.entity.Details;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public class DetailsDaoImpl implements DetailsDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Optional<Details> findById(int id) {
        Details foundedDetails = entityManager.find(Details.class, id);
        return Optional.ofNullable(foundedDetails);
    }

    @Override
    public Collection<Details> findAll() {
        entityManager.createQuery("select a from Details a", Details.class)
                .getResultList();
        return null;
    }

    @Override
    @Transactional
    public Details create(Details details) {
        entityManager.persist(details);
        return details;
    }

    @Override
    @Transactional
    public Details update(Details details) {
        entityManager.merge(details);
        return details;
    }

    @Override
    @Transactional
    public void delete(int id) {
        Details foundedDetails = entityManager.find(Details.class, id);
        if (foundedDetails != null) entityManager.remove(foundedDetails);

    }
}
