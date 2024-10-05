# Application Android de Recettes de Pizza

Cette application Android est une application de recettes de pizza qui permet aux utilisateurs de parcourir diverses recettes de pizza, de voir les détails de chaque pizza et de partager leurs recettes préférées.

## Fonctionnalités

1. Écran de démarrage : Un écran d'accueil qui s'affiche au lancement de l'application.
2. Liste des recettes de pizza : Affiche une liste de différentes recettes de pizza avec des informations de base.
3. Vue détaillée des recettes : Montre des informations détaillées sur une recette de pizza sélectionnée, y compris les ingrédients et les étapes de préparation.
4. Fonctionnalité de partage : Permet aux utilisateurs de partager des recettes de pizza via WhatsApp.

## Structure du projet

Le projet se compose des composants principaux suivants :

1. `SplashActivity` : Affiche l'écran de démarrage initial.
2. `ListPizza` : Montre la liste des recettes de pizza disponibles.
3. `DetailPizza` : Affiche des informations détaillées sur une recette de pizza sélectionnée.
4. `PizzaAdapter` : Adaptateur personnalisé pour la vue de liste des pizzas.
5. `Produit` : Classe modèle représentant une recette de pizza.
6. `ProduitService` : Classe de service pour gérer les données des recettes de pizza.

## Fichiers de mise en page

- `activity_splash.xml` : Mise en page pour l'écran de démarrage.
- `activity_main.xml` : Mise en page pour la liste principale des pizzas.
- `activity_detail_pizza.xml` : Mise en page pour la vue détaillée d'une recette de pizza.
- `pizza_item.xml` : Mise en page pour les éléments individuels dans la liste des pizzas.

## Comment exécuter

1. Clonez le dépôt sur votre machine locale.
2. Ouvrez le projet dans Android Studio.
3. Compilez et exécutez l'application sur un émulateur ou un appareil Android.

## Configuration requise

- Android Studio
- SDK Android 
- Gradle 

## Contribution

Les contributions à ce projet sont les bienvenues. Veuillez suivre ces étapes pour contribuer :

1. Forkez le projet
2. Créez votre branche de fonctionnalité (`git checkout -b feature/AmazingFeature`)
3. Committez vos changements (`git commit -m 'Add some AmazingFeature'`)
4. Poussez vers la branche (`git push origin feature/AmazingFeature`)
5. Ouvrez une Pull Request
## Screen Video
[![Vidéo de démonstration]](https://github.com/user-attachments/assets/c5e61594-54fc-42e3-b7af-e0bdae4e13c8)

