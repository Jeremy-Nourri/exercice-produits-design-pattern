package org.example.factory;

import org.example.entity.AbstractProduitBuilder;
import org.example.entity.Produit;

public abstract class ProduitFactory {
    public abstract Produit createProduit(AbstractProduitBuilder builder);
}
