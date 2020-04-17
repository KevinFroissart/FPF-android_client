#### Projet agile <!-- omit in toc -->
# Client Android <!-- omit in toc -->

***Ce repo contient le code de l'appli mobile Android du projet agile.***

***Il communique (comme le [client web](https://gitlab.com/univlille/defi-agile-iut/skeleton/client-web)), avec le serveur REST disponible dans le repo "[server](https://gitlab.com/univlille/defi-agile-iut/skeleton/server)" que je vous recommande de lancer avant d'attaquer ce README***

## Sommaire <!-- omit in toc -->
- [TL;DR](#tldr)
- [1. Réglages de l'application:](#1-réglages-de-lapplication)
- [2. Configurations spécifiques](#2-configurations-spécifiques)

## TL;DR
1. Fork + clone du repo
2. ouvrir le projet dans android studio
3. lancer le build
4. Lancer le terminal virtuel (AVD) et lancer l'exécution de l'application
5. Lancer le serveur REST
6. L appui sur le bouton devrait faire afficher `got it`dans la zone de texte.

## 1. Réglages de l'application:
* ```URL```: l'url complète de la ressource testée (.../api/v1/myresource).
   Réglée initialement sur l ip 10.0.2.2 à utiliser quand on fonctionne en emulation de terminal. vers la machine de développement.
* ```VOLLEY_TAG```: Marqueur utilisé pour supprimer toutes les requêtes en attente lors de la fermeture de l'application (onStop)

## 2. Configurations spécifiques
Cette application a été construite en partant du modèle 'Empty activity' et en ajoutant les réglages et primitives nécessaires:
* Bibliothèque ```VOLLEY``` dans ```graddle scripts/build.graddle (Module app)```
* Modification du Manifest (clauses ```uses-permission``` et ```usesCleartextTraffic```)
L'activité initiale fait référence à ```content_main.xml``` qui contient la description réelle de l'IHM