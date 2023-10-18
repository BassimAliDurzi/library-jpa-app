package example.libraryjpaapp.dao;
import example.libraryjpaapp.entity.Details;

import java.util.Collection;
import java.util.Optional;

public interface DetailsDao {

    Optional<Details> findById(int id);
    Collection<Details> findAll();
    Details create(Details details);
    Details update(Details details);
    void delete(int id);

}
