package poke_api.poke_api_proxy.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import poke_api.poke_api_proxy.data_base.NamedAPIResourceRepository;
import poke_api.poke_api_proxy.poke_api.NamedAPIResource;
import poke_api.poke_api_proxy.poke_api.PokeApiRestService;
import poke_api.poke_api_proxy.poke_api.NamedAPIResourceList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class PokemonInfoController {
    
    // TODO READ HOW TO LOG IN SPRING
    private static final Logger LOGGER = LoggerFactory.getLogger(PokemonInfoController.class);

    @Autowired
    private PokeApiRestService pokeService;

    @Autowired
    private NamedAPIResourceRepository namedAPIResourceRepository;

    @GetMapping(value = "/info")
    @ResponseBody
    public String getInfo(){
        LOGGER.info("Info");
        return "Api for touch Spring MVC and Spring DATA";}

    @GetMapping(value = "/list")
    @ResponseBody
    public NamedAPIResourceList getPokeResourceList(@RequestParam int limit,
                                                    @RequestParam int offset){
        LOGGER.info("list");
        return pokeService.getPokeList(limit, offset);}

    @PostMapping(value = "/post_db")
    @ResponseBody
    public String doDbWork(){
        List<NamedAPIResource> resourceList = Arrays.asList(
                getPokeResourceList(5, 0).results.clone());
        this.namedAPIResourceRepository.saveAll(resourceList);
        return "OK";
    }
    @GetMapping(value = "/get_db")
    @ResponseBody
    public List<NamedAPIResource> findAllDB(){
        var result = new ArrayList<NamedAPIResource>();
        this.namedAPIResourceRepository.findAll().forEach(result::add);
        return result;
    }
}
