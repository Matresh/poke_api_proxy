package poke_api.poke_api_proxy.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import poke_api.poke_api_proxy.PokeApiRestService;

@Controller
public class PokemonInfoController {
    
    // TODO READ HOW TO LOG IN SPRING
    private static final Logger LOGGER = LoggerFactory.getLogger(PokemonInfoController.class);
    // TODO MAKE POKE SERVICE SPRING BEAN
    private static final PokeApiRestService pokeService = new PokeApiRestService();
    @GetMapping(value = "/info")
    @ResponseBody
    public String getInfo(){
        LOGGER.info("Info");
        return "Api for touch Spring MVC and Spring DATA";}

    @GetMapping(value = "/list")
    @ResponseBody
    public String getPokeList(@RequestParam int limit,
                              @RequestParam int offset){
        LOGGER.info("list");
        return pokeService.getPokeList(limit, offset);}

}
