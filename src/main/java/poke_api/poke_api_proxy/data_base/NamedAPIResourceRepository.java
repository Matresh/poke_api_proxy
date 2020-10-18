package poke_api.poke_api_proxy.data_base;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import poke_api.poke_api_proxy.poke_api.NamedAPIResource;

//TODO REMEMBER HOW TO CHOICE DB DRIVER
@Repository
public interface NamedAPIResourceRepository extends CrudRepository<NamedAPIResource, Long> {
}
