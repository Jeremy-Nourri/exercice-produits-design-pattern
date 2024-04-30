package org.example.factory;

import org.example.entity.AbstractProduitBuilder;
import org.example.entity.Ordinateur;
import org.example.entity.Produit;

public class OrdinateurFactory extends ProduitFactory{
    @Override
    public Ordinateur createProduit(AbstractProduitBuilder ordinateurBuilder) {
        return (Ordinateur) ordinateurBuilder.build();
    }
}
