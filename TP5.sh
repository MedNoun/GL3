#!/bin/bash
choice=-1
while [ $choice != 0 ]; do
    echo "

******************************************************
Bonjour choisissez une option :
1 - Archiver 
2 - Restaurer
3 - supprimer
4 - afficher
5 - afficher taille de repertoire 
6-  afficher contenu de l'archive
0 - Exit"
    read choice

    case "$choice" in
    1)
        echo "donnez le fichier/dossier à archiver"
        read path2
        echo "Donnez la destination"
        read path1
        tar -cvf $path1 $path2
        echo "fichier/dossier sauvegardé"
        ;;
    2)
        echo "donnez le fichier/dossier à restaurer"
        read path1
        echo "Donnez la destination"
        read path2
        tar -xvf $path1 -C $path2
        echo "fichier/dossier restauré"
        ;;
    3)
        echo "donner le/les fichiers a supprimer"
        read fichier
        rm $fichier
        ;;
    4)
        echo "donner le dossier a afficher"
        read doc
        ls $doc
        ;;
    5)
        echo "donner le dossier"
        read doc
        du -sh $doc
        ;;
    6)
        echo "donner l'archive"
        read arch
        tar -tvf $arch
        ;;
    0) echo 'BYE!' ;;

    *) echo "invalid choice" ;;

    esac
done
