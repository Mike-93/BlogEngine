package BlogEngine.repository;

import BlogEngine.models.GlobalSettings;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SettingsRepository extends CrudRepository<GlobalSettings, Integer> {
}
