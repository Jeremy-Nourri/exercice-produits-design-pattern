package org.example.entity;

public class Velo extends Produit {

    private int taille;
    private int vitesse;

    public Velo(VeloBuilder veloBuilder) {
        super(veloBuilder);
        this.taille = veloBuilder.taille;
        this.vitesse = veloBuilder.vitesse;
    }

    @Override
    public String toString() {
        return "Velo{" +
                "taille=" + taille +
                ", vitesse=" + vitesse +
                ", denomination='" + denomination + '\'' +
                ", couleur='" + couleur + '\'' +
                '}';
    }


    public static class VeloBuilder extends AbstractProduitBuilder {
        private int taille;
        private int vitesse;

        public VeloBuilder taille(int taille) {
         this.taille = taille;
         return this;
        }

        public VeloBuilder vitesse(int vitesse) {
            this.vitesse = vitesse;
            return this;
        }

        @Override
        public Velo build() {
            return new Velo(this);
        }
    }
}
