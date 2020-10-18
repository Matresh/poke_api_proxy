package poke_api.poke_api_proxy.poke_api;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@Entity
// IS THIS BROKE SINGLE RESPONSIBILITY?
// Resolve with PokeObject interface
// and two class jackson mapping and db mapping?
public class NamedAPIResource {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String url;
}
