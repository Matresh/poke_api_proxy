package poke_api.poke_api_proxy;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokeApiRestService {
    private final static String API_URL = "https://pokeapi.co/api/v2/pokemon";
    private final RestTemplate restTemplate = new RestTemplate();


    private String pokeListUrlBuilder(int limit, int offset){
        return API_URL + "?limit=" + limit + "&offset=" + offset;
    }
    public NamedAPIResourceList getPokeList(int limit, int offset) {
        return this.restTemplate.getForObject(
                pokeListUrlBuilder(limit, offset), NamedAPIResourceList.class);
    }
}
