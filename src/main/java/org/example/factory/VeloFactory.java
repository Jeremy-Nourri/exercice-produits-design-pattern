package org.example.factory;

import org.example.entity.AbstractProduitBuilder;
import org.example.entity.Produit;
import org.example.entity.Velo;

public class VeloFactory extends ProduitFactory {
    @Override
    public Velo createProduit(AbstractProduitBuilder veloBuilder) {
        return (Velo) veloBuilder.build();
    }
}
