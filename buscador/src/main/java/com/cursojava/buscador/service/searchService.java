package com.cursojava.buscador.service;

import com.cursojava.buscador.Entity.WebPage;
import com.cursojava.buscador.Repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Service
public class searchService {

    @Autowired
    private SearchRepository repository;

    public List<WebPage> search(String textSearch){

        return repository.search(textSearch);
    }

    public void save(WebPage webPage){
         repository.save(webPage);
    }


    public boolean exist(String link) {
         return repository.exist(link);
    }
}
