package pl.digitaldream.padel.composer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.digitaldream.padel.composer.domain.Authority;

/**
 * Spring Data MongoDB repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends MongoRepository<Authority, String> {}
