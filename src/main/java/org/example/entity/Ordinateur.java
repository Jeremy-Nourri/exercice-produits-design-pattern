package org.example.entity;

public class Ordinateur extends Produit{
    private String microprocesseur;
    private String memoireVive;
    private String disqueDur;

    private Ordinateur(OrdinateurBuilder ordinateurBuilder) {
        super(ordinateurBuilder);
        this.microprocesseur = ordinateurBuilder.microprocesseur;
        this.memoireVive = ordinateurBuilder.memoireVive;
        this.disqueDur = ordinateurBuilder.disqueDur;
    }

    @Override
    public String toString() {
        return "Ordinateur{" +
                "microprocesseur='" + microprocesseur + '\'' +
                ", memoireVive='" + memoireVive + '\'' +
                ", disqueDur='" + disqueDur + '\'' +
                ", denomination='" + denomination + '\'' +
                ", couleur='" + couleur + '\'' +
                '}';
    }

    public static class OrdinateurBuilder extends AbstractProduitBuilder {
        private String microprocesseur;
        private String memoireVive;
        private String disqueDur;



        public OrdinateurBuilder microprocesseur(String microprocesseur) {
            this.microprocesseur = microprocesseur;
            return this;
        }

        public OrdinateurBuilder memoireVive(String memoireVive) {
            this.memoireVive = memoireVive;
            return this;
        }

        public OrdinateurBuilder disqueDur(String disqueDur) {
            this.disqueDur = disqueDur;
            return this;
        }

        @Override
        public Ordinateur build() {
            return new Ordinateur(this);
        }
    }
}
