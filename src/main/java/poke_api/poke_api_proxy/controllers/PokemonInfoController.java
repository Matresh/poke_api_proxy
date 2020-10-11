package poke_api.poke_api_proxy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PokemonInfoController {
    @RequestMapping(value = "/info")
    @ResponseBody
    public String getInfo(){
        System.out.println("ssssss");
        return "aaaaaaa";}
}
