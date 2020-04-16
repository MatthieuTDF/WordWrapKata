# WordWrapKata

## Description
La fonction wordwrap prend un objet String en entrée et un nombre de colonnes.
Elle insère des linebreaks ("\n") aux bons endroits afin que chaque ligne ait une longueur inférieure OU égale au nombre de colonnes passé en paramètre.
Il n'est pas permis de casser les mots en deux.

NB : les "\n" ne comptent pas dans la limite de colonnes !

## Setup
  - Forker le projet
  - Importer le projet forké dans IntelliJ Idea : File > New > Project from Version Control > Git > Rentrer l'url du dépôt
  - Clic droit sur le dossier java > Mark Directory as Root Source
  - File > Project Structure > renseigner votre jdk et votre fichier de sortie <VOTRE_WORKING_DIR/out>
  - Run > Edit Configuration > ajouter une Application > Renseigner votre jdk si ce n'est pas déjà fait
  - Pour ajouter JUnit, la façon la plus simple est la suivante : allez dans le fichier java > test > RollTest > alt-Enter sur un @Test rouge > add JUnit to classpath
  - Implémenter la méthode dans java > WordWrap
  - Jouer les tests dans java > WordWrapTest
  - Pousser votre pull request sur le dépôt, mettez votre nom et prénom dans le nom de la branche
