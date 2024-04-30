package org.example.entity;

public abstract class AbstractProduitBuilder {
    protected String denomination;
    protected String couleur;

    public AbstractProduitBuilder denomination(String denomination) {
        this.denomination = denomination;
        return this;
    }
    public AbstractProduitBuilder couleur(String couleur) {
        this.couleur = couleur;
        return this;
    }

    public abstract Produit build();

}
