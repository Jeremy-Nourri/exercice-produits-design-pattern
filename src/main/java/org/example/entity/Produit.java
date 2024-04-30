package org.example.entity;

public abstract class Produit {
    protected String denomination;
    protected String couleur;

    public Produit(AbstractProduitBuilder builder) {
        this.couleur = builder.couleur;
        this.denomination = builder.denomination;
    }
}
