package poke_api.poke_api_proxy;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NamedAPIResource {
    private String name;
    private String url;
}
