package org.example;

import org.example.entity.Ordinateur;
import org.example.entity.Produit;
import org.example.entity.Velo;
import org.example.factory.OrdinateurFactory;

import java.util.Scanner;

public class IHM {

    private static Scanner scanner = new Scanner(System.in);

    public static void start() {

        int choix;

        do {

            afficheMenuBase();
            choix = scanner.nextInt();
            switch (choix){
                case 1:
                    configurerOrdinateur();
                    break;
                case 2:
                    configurerVelo();
                    break;
                case 0:
                    System.out.println("Au revoir !!!");
                    break;
                default:
                    System.out.println("Choix invalide !!!!");

            }

        } while(choix != 0);

    }

    public static void afficheMenuBase(){
        System.out.println("##### Menu #######");
        System.out.println("1) Configurer un ordinateur");
        System.out.println("2) Configurer un vélo");
        System.out.println("0) Quitter");
        System.out.println("Faite votre choix : ");
    }

    public static void configurerOrdinateur() {
        System.out.println("Choissisez le titre de votre configuration");
        String denomination = scanner.next();
        System.out.println("Choissisez la couleur de votre ordinateur");
        String couleur = scanner.next();
        System.out.println("Choissisez le microprocesseur");
        String microProcesseur = scanner.next();
        System.out.println("Choissisez le disqueDur");
        String disqueDur = scanner.next();
        System.out.println("Choissisez la mémoire vive");
        String memoireVive= scanner.next();

        Ordinateur ordinateur = ((Ordinateur.OrdinateurBuilder) new Ordinateur.OrdinateurBuilder()
                .denomination(denomination)
                .couleur(couleur))
                .microprocesseur(microProcesseur)
                .memoireVive(memoireVive)
                .disqueDur(disqueDur)
                .build();

        System.out.print(ordinateur.toString());
    }

    public static void configurerVelo() {
        System.out.println("Choissisez le titre de votre configuration");
        String denomination = scanner.nextLine();
        System.out.println("Choissisez la couleur de votre ordinateur");
        String couleur = scanner.nextLine();
        System.out.println("Choissisez la vitesse");
        int vitesse = scanner.nextInt();
        System.out.println("Choissisez la vitesse");
        int taille = scanner.nextInt();

        Velo velo= ((Velo.VeloBuilder) new Velo.VeloBuilder()
                .denomination(denomination)
                .couleur(couleur))
                .taille(taille)
                .vitesse(vitesse)
                .build();

        System.out.print(velo.toString());

    }


}
