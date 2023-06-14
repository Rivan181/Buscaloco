package com.cursojava.buscador.Controller;

import com.cursojava.buscador.Entity.WebPage;
import com.cursojava.buscador.service.SpyderService;
import com.cursojava.buscador.service.searchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@RestController
public class SearchController {
    @Autowired
    private searchService service;

    @Autowired
    private SpyderService spiderService;
    @CrossOrigin("*")
    @RequestMapping(value = "api/search", method = RequestMethod.GET)
    public List<WebPage> search(@RequestParam Map<String, String> params){
        String query = params.get("query");
        return service.search(query);
    }

    @RequestMapping(value = "api/test", method = RequestMethod.GET)
    public String  search(){
        return spiderService.indexWebPage();
    }



}
