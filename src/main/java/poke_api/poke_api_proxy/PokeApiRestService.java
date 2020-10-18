package poke_api.poke_api_proxy;

import org.springframework.web.client.RestTemplate;

public class PokeApiRestService {
    private final static String API_URL = "https://pokeapi.co/api/v2/pokemon";
    private final RestTemplate restTemplate = new RestTemplate();


    private String pokeListUrlBuilder(int limit, int offset){
        return API_URL + "?limit=" + limit + "&offset=" + offset;
    }
    public String getPokeList(int limit, int offset) {
        return this.restTemplate.getForObject(
                pokeListUrlBuilder(limit, offset), String.class);
    }
}
