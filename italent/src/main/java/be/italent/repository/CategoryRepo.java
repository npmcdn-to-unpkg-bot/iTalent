package be.italent.repository;

import be.italent.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
