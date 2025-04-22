<<<<<<< HEAD
**Nom :** Anis Drissi

**Groupe :** B

**Année :**  BUT1
=======
**Nom :** CONTREMOULIN

**Groupe :** 7

**Année :** 2025
>>>>>>> 8b6bb780adac714bd2832444d7e87b5331a73bb8

**IUT Le Havre - Cours GIT**

### Compte-rendu TP1 Introduction GIT

Dans ce TP on apprend à travailler avec git.
<<<<<<< HEAD
=======


## 1. Exercices: 

1) `git config --global user.name "Nathan Contremoulin"`
   `git config --global user.email sysioo.majaro+1@gmail.com`
   `git config --global core.editor vscode`

2)  ```bash
    user.name=Nathan Contremoulin
    user.email=sysioo.majaro+1@gmail.com
    ```

3) Nathan Contremoulin
4) sysioo.majaro+1@gmail.com


## 2. Exercices: 

1) `~\Desktop\TP-GIT-equipe07\courseGIT\tp1> ls -a`
```pwsh
╭───┬──────┬──────┬────────┬──────────╮
│ # │ name │ type │  size  │ modified │
├───┼──────┼──────┼────────┼──────────┤
│ 0 │ .git │ dir  │ 4,0 kB │ now      │
╰───┴──────┴──────┴────────┴──────────╯
```
2) `~\Desktop\TP-GIT-equipe07\courseGIT\tp1> git status`
```pwsh
On branch master

No commits yet

nothing to commit (create/copy files and use "git add" to track)
```

## 3. Exercices: 

1) `git add README.md` 

   `git commit -m "modification de README.md"` 

## 4. Exercices: 

1) `touch .gitignore` 

   `git add .gitignore` 

   `git commit -m ".gitignore ajouté"` 
 

2) `more .gitignore`
```git
# Compiled class file
*.class

# Package Files
*.jar
*.war
*.nar
*.ear
*.zip
*.tar.gz
*.rar
```
>>>>>>> 8b6bb780adac714bd2832444d7e87b5331a73bb8

## Compte rendu TP3

## 1. Exercices: 

1) Il suffit de copier les fichiers du répertoire tp2 dans tp3, de les ajouter à GIT et synchroniser les dépots

2)  ```bash
    user.name=Nathan Contremoulin
    user.email=sysioo.majaro+1@gmail.com
    ```

## 2. Exercices: 

1) Athos et Porthos doivet compléter leur ppartie respective du code
Une fois lancé, le résultat est le suivant :

Test Portefeuille transfertDevise        ... OK
Test Portefeuille achatDevise            ... OK
Test CryptoMarche capitalEnEuros         ... OK
Test CryptoMarche capitalMonneaie        ... OK


## 3. Exercices

1) On lance la commande git branch

$:~/courseGIT/tp3> git branch
* main

Nous sommes donc sur la branche main
Nous voulons créer une nouvelle branche "test", la commande est la suivante : "git checkout -b test"

L’option -b nous permet de dire à checkout que nous allons créer cette nouvelle branche. 
checkout nous fait changer de branche et aller dans la branche test

Si on tape git branch :
$:~/courseGIT/tp3> git branch
  main
* test (nous sommes bien dans la branche test)

Par la suite, nous devons créer un fichier test.txt dans la branche test, pour cela, on utilise la commande
$:~/courseGIT/tp3> touch test.txt

Puis on valide les changements
$:~/courseGIT/tp3> git add test.txt
$:~/courseGIT/tp3> git commit -m "fonction de test ajoutée "

On souhaite revenir à la branche main
$:~/courseGIT/tp3> git checkout main
$:~/courseGIT/tp3> ls
README.md  src

Le fichier test.txt a disparu, celui-ci est lié à la branche test

Ligne à écrire dans le 3.1)
Nous avons maintenant crée une branche de test.

Fusionner la branche de test dans la branche principale
commandes : 
$:~/courseGIT/tp3> git checkout main (revenir à la branche main)
$:~/courseGIT/tp3> git merge test (fusionner les branches main et test)

pour visualiser la fusion : 

$:~/courseGIT/tp3> git log --graph --oneline --all --decorate --topo-order
*   454d00d (HEAD -> main) Merge branch 'test' into main
|\  
| * bee45b2 (test) fonction de test ajoutée
* | f721aae nouveau commit sur la branche principale
|/  
* 922b42b Adding CryptoMarche

Après la fusion, si on tape la commande ls, le fichier test.txt est de retour

2) git rm test.txt puis git commit -m "test.txt supprimé".
Cela supprime le fichier test.txt

3) commande "git checkout -b <AthosCoin ou PorthosCoin>" pour créer la branche
   Création du fichier java correspondant à notre cryptomonnaie
   commandes "git add" et "git commit"
   commande "git checkout main" pour retourner dans la branche main
   commande "git merge <AthosCoin ou PorthosCoin>" pour fusionner les branches
   git push pour synchroniser les dépots local et distant   