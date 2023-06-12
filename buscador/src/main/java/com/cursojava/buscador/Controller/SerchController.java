package com.cursojava.buscador.Controller;

import com.cursojava.buscador.Entity.WebPage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class SerchController {

    @RequestMapping(value = "api/serch", method = RequestMethod.GET)
    public List<WebPage> Serch(){
        List<WebPage> result = new ArrayList<>();


        return result;
    }

}
