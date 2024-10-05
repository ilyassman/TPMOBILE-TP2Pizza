package com.example.myapplication.service;
import com.example.myapplication.classes.Produit;
import com.example.myapplication.dao.IDao;

import java.util.ArrayList;
import java.util.List;

public class ProduitService implements IDao<Produit> {
    private List<Produit> produits;
    public ProduitService(List<Produit> produits) {
        this.produits = produits;
    }

    public ProduitService() {
        this.produits = new ArrayList<>();
    }


    public boolean create(Produit d) {
        return produits.add(d);
    }
    public Produit findById(int id) {
        for(Produit p : produits)
            if(p.getId() == id)
                return p;
        return null;
    }

    public List<Produit> findAll() {
        return produits;
    }


    public boolean delete(Produit p) {
        return produits.remove(p);
    }

    public boolean update(Produit o) {
        Produit p = findById(o.getId());
        p.setNom(o.getNom());
        p.setDuree(o.getDuree());
        p.setPhoto(o.getPhoto());
        p.setDescription(o.getDescription());
        p.setPreparation(o.getPreparation());
        p.setDuree(o.getDuree());
        p.setNbreIngredients(o.getNbreIngredients());
        return true;
    }
}

