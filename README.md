# Q-R-platform-RFIDauth-JEE-Angular
La partie Backend
Introduction
Le « backend » est un peu comme la partie immergée d’un iceberg. On ne la voit pas en tant que simple Internaute mais elle représente une très grande partie d’un projet web.
Le Backend se compose généralement de trois éléments :
•	Un serveur (hébergement web)
•	Une application (site web, administration)
•	Une base de données (sorte de feuille de calcul pour organiser les données)
Modèle MVC
La première question qui s'est posée pour la réalisation de la partie technique du projet a été de choisir une architecture pour l'application.
Le MVC est une architecture et une méthode de conception qui organise l'Interface Homme-Machine d'une application logicielle (dans notre cas un site Web) en trois parties :
·         Les données (Modèle) 
Le modèle représente les structures de données. Typiquement, les classes modèles contiennent des fonctions qui aident à récupérer, insérer et mettre à jour des informations de la base de données.
·         L’interface homme-machine (Vue) 
La vue correspond à l'interface avec laquelle l'utilisateur interagit. Elle se présente sous la forme d'un template représentant l'interface, mais sans les données.
·         La logique de contrôle (Contrôleur) 
Il gère l'interface entre le modèle et le client. Il va interpréter la requête de ce dernier pour lui envoyer la vue correspondante. Il effectue la synchronisation entre le modèle et les vues.
Grossièrement, cela permet une séparation entre les traitements de données et la présentation :
 
Spring Boot
Un framework ou kit de développement est un espace de travail modulaire, c'est à dire une suite d'outils et de bibliothèques qui facilitent et accélèrent le développement d'un logiciel. Il contient toutes les fonctions de base utiles au développement d'un type de programme, et permet donc de ne pas avoir besoin de réécrire les mêmes fonctions à chaque programme créé. Il en existe dans tous les langages de programmation.
Parmi les frameworks Web, nous somme plus particulièrement intéressée aux frameworks Spring boot. Dans leur grande majorité, elle est conçue sur le modèle MVC, ce qui permet de structurer les données. Ils imposent un cadre et des normes de développement qui permettent une programmation propre et modulaire. Une autre motivation pour ce choix est le fait que nous les membres de cette équipe nous avons déjà travaillé avec cette Framework. Il est aussi important de mentionner que Maven a été utilisé pour faire la gestion des dépendances du projet. De cette façon, il a été assez facile d’inclure plusieurs modules nécessaires pour l’application web ainsi que les modules facilitant l’intégration de JDBC Driver. Ces modules auront permis de grandement réduire le code écrit grâce aux annotations fournies par le module permettant l’intégration avec MySql. De plus, il est assez facile d’implémenter de nouvelles routes avec les annotations fournies par Spring Boot.
Architecture du projet
Le backend de ce projet se compose de quatre parties, soit la partie service, entities, metier et repositories plus l’application main Spring boot.
 

➢	entities: notre modèles
➢	metier : les méthodes qu’on veut utiliser
➢	repositories : qui implémentent de l’interface jpa
➢	services : pour la communication avec Frontend  où l’utilisation de l’Api Rest
Base de données
Initialement le projet utilisait la base de données : MySQL. Cette base de données est une base de données relationnel. De plus, la connexion vers MySql s’était faite. Par ailleurs, il y avait plus de cinq requêtes SQL écrites à la main. Il est certain qu’il existe plusieurs opinions sur la valeur et l’utilité d’écrire du SQL à la main, certains pensent que ce n’est pas bon, alors que d’autres pensent que c’est normal de le faire. Pour le cas du projet, nous avons évité d’écrire du SQL et utiliser les méthodes déjà implémentées par JPA. À titre d’exemple, une requête SQL a été écrite pour chercher les protocoles d’instances créées par un certain utilisateur. Cette requête aurait facilement été faite en utilisant l’API programmatiquement et ne requiert pas l’écriture de la requête à la main.
Ensuite, le module Entities qui était sous forme graphe d’objet est présenté sous forme des tables relationnelles dans la base de données MySql, en fait c’est le rôle ORM (Objet Relationel Mapping).


API Rest
Pour rendre accessible des données via un site, il existe les méthodes dites REST(representational state transfer). Il s’agit d’un ensemble de conventions et de bonnes pratiques à respecter et non d’une technologie entière. L’information de base, dans une architecture REST, est appelée ressource. Toute information qui peut être nommée est une ressource : la description d’un bâtiment, la liste des arrêts de bus ou n’importe quel concept. Dans un système hypermédia, une ressource est tout ce qui peut être référencé par un lien. L’interface entre les composants est simple et uniforme. En HTTP, cette interface est implantée par les verbs GET, PUT, POST, DELETE, . . . qui permettent aux composants de manipuler les ressources de manière simple.
Conclusion
Cette section du rapport a présenté la partie du développement Backend du projet, c’est la partie du code qui est exécutée par le serveur, il s'agit du travail qu’il réalise sur les pages Web des sites dynamiques avant de les envoyer au client. 
Ainsi on a expliqué dans cette partie le choix de technologies utilisés et ses fonctionnements. 

