package com.example.myapplication.classes;

public class Produit {
    private static int idCounter = 0;
    private int id;
    private String nom;
    private int nbreIngredients;
    private int photo;
    private float duree;
    private String detailsIngred;
    private String description;
    private String preparation;



    public Produit() {
        this.id = ++idCounter; }

    // Constructeur avec paramètres
    public Produit(String nom, int nbreIngredients, int photo, float duree, String detailsIngred, String description, String preparation) {
        this.id = ++idCounter;
        this.nom = nom;
        this.nbreIngredients = nbreIngredients;
        this.photo = photo;
        this.duree = duree;
        this.detailsIngred = detailsIngred;
        this.description = description;
        this.preparation = preparation;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbreIngredients() {
        return nbreIngredients;
    }

    public void setNbreIngredients(int nbreIngredients) {
        this.nbreIngredients = nbreIngredients;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public float getDuree() {
        return duree;
    }

    public void setDuree(float duree) {
        this.duree = duree;
    }

    public String getDetailsIngred() {
        return detailsIngred;
    }

    public void setDetailsIngred(String detailsIngred) {
        this.detailsIngred = detailsIngred;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }





    // Méthode toString
    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbreIngredients=" + nbreIngredients +
                ", photo=" + photo +
                ", duree=" + duree +
                ", detailsIngred='" + detailsIngred + '\'' +
                ", description='" + description + '\'' +
                ", preparation='" + preparation + '\'' +
                '}';
    }
}