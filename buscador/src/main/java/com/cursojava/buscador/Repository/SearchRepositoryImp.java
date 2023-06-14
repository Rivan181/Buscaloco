package com.cursojava.buscador.Repository;

import com.cursojava.buscador.Entity.WebPage;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class SearchRepositoryImp implements SearchRepository {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public WebPage getByUrl(String url){
        String query = "FROM WebPage WHERE url = :url";
        List<WebPage> list = entityManager.createQuery(query)
                .setParameter("url",url)
                .getResultList();
        return list.size() == 0 ? null : list.get(0);
    }


    @Transactional
    @Override
    public List search(String textSearch) {
        String query = "FROM WebPage WHERE description like:textSearch";

        return entityManager.createQuery(query)
                .setParameter("textSearch", "%"+textSearch+"%")
                .getResultList();
    }

    @Transactional
    @Override
    public void save(WebPage webPage) {
        entityManager.merge(webPage);
    }

    @Override
    public boolean exist(String link) {
        return getByUrl(url) != null;
    }
}
