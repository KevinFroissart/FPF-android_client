# Description

Ceci est une application cliente REST minimale sous android

les réglages de l'application:
* ```URL```: l'url complète de la ressource testée (.../api/v1/myresource). 
   Réglée initialement sur l ip 10.0.2.2 à utiliser quand on fonctionne en emulation de terminal. vers la machine de développement.
* VOLLEY_TAG: Marqueur utilisé pour supprimer toutes les requêtes en attente lors de la fermeture de l'application (onStop)

Cette application a été construite en partant du modèle 'Empty activity' et en ajoutant les réglages et primitives nécessaires:
* Bibliothèque VOLLEY dans graddle scripts/build.graddle (Module app)
* Modification du Manifest (clauses uses-permission et usesCleartextTraffic
L'activité initiale fait référence à content_main.xml qui contient la description réelle de l'IHM