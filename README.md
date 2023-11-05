# Projet de Gestion Scolaire

# Appercu 

Ce projet Spring Boot vise à offrir des API pour la gestion des filières, des étudiants, des rôles et leur affectation. 

# Les fonctionnalités principales 

**- Gestion des Filières** : Création, lecture, mise à jour et suppression de filières.

**- Gestion des Étudiants** : Ajout, récupération, mise à jour et suppression d'étudiants avec association à une filière.

**- Gestion des Rôles** : Création, lecture, mise à jour et suppression de rôles.

**- Affectation des Rôles à l'Utilisateur** : Attribution de rôles aux utilisateurs enregistrés.

**- Affichage des Étudiants d'une Filière**: Obtenir la liste des étudiants d'une filière donnée.

# Déploiement du projet 

-Clonez ce dépôt sur votre ordinateur.

-Accédez au répertoire du projet .

-Assurez-vous d'avoir les prérequis suivants : Java 8+, Maven/Gradle, et Postman installés.

-Exécutez l'application : mvn spring-boot:run (ou utilisez votre IDE pour démarrer l'application).

# Les technoligies utilisés 

Le projet exploite les technologies suivantes :

**Spring Boot (Framework Java)**: Le framework principal utilisé pour construire des applications basées sur Java, fournissant des bases solides pour notre projet.

**Java (Langage de Programmation Principal)** : Le langage de programmation principal dans lequel le projet est développé, offrant flexibilité et portabilité.

**MySQL (Base de données)** : Le système de gestion de base de données utilisé pour stocker et gérer efficacement les données du projet.

**Swagger (Documentation d'API)** : Swagger, désormais connu sous le nom d'OpenAPI, est utilisé pour créer et documenter les API, facilitant la compréhension et l'interaction des développeurs avec les points de terminaison du projet.


# Conception du projet 

![image](https://github.com/nainiaasmaa/TP-Spring-Boot/assets/147659638/903a5b47-7f38-46ef-b3de-8529e0bf96e0)

## Endpoints Principaux
**Filères:**

- GET /api/filieres : Récupérer toutes les filières.

- POST /api/filieres : Créer une nouvelle filière.

- GET /api/filieres/{id} : Récupérer une filière spécifique par ID.

- PUT /api/filieres/{id} : Mettre à jour une filière existante.

- DELETE /api/filieres/{id} : Supprimer une filière par ID.

# Screenshot

Il faut noter bien que les tests ci-dessous sont pour la gestion des filières. Les processus de test pour les endpoints des étudiants et des rôles suivent la même logique et la même procédure.

**Tests des Endpoints avec Postman :**

- Liste des filières
  
![image](https://github.com/nainiaasmaa/TP-Spring-Boot/assets/147659638/0d174b1f-91a8-449f-bfcf-dde1955334d9)

- Création d'une filière 

![image](https://github.com/nainiaasmaa/TP-Spring-Boot/assets/147659638/02dad0cb-6d9b-4def-803b-4beba60f67ae)

- Suppression d'une filière dont l'ID existe dans la base de donnèes 

![image](https://github.com/nainiaasmaa/TP-Spring-Boot/assets/147659638/50efc333-b5f8-4a44-a268-5479127285f4)

- Suppression d'une filière dont l'ID n'existe pas dans la base de donnèes

![image](https://github.com/nainiaasmaa/TP-Spring-Boot/assets/147659638/e54df0d3-8035-4883-afe4-94a9bf49e2ae)

- Modification d'une filière

 ![image](https://github.com/nainiaasmaa/TP-Spring-Boot/assets/147659638/ee81a70b-3001-4595-805c-9e522fedbfbf)

**Tests des Endpoints avec Swagger :**

- Liste des filières
  
![image](https://github.com/nainiaasmaa/TP-Spring-Boot/assets/147659638/868bbfc9-459b-4c66-97f2-b37689850d3a)

- Création d'une filière

![image](https://github.com/nainiaasmaa/TP-Spring-Boot/assets/147659638/bb261556-ea2a-4921-980e-9fac7baf5b38)

- Suppression d'une filière 

![image](https://github.com/nainiaasmaa/TP-Spring-Boot/assets/147659638/c2d82a5d-2dc6-476d-ab88-df25c39af1d9)
 
- Modification d'une filière

![image](https://github.com/nainiaasmaa/TP-Spring-Boot/assets/147659638/51ce04aa-76f1-4f1e-8c8b-07d0555b3335)

  
