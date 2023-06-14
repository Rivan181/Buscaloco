package com.cursojava.buscador.Repository;

import com.cursojava.buscador.Entity.WebPage;

import java.util.List;

public interface SearchRepository {

    WebPage getByUrl(String url);

    List<WebPage> search(String textSearch);


    void save(WebPage webPage);

    boolean exist(String link);
}
