package poke_api.poke_api_proxy.poke_api;
// TODO MB INHERIT LIST ???

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class NamedAPIResourceList {
    NamedAPIResource[] results;

}
