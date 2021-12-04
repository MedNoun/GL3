test=1
while [ $test ]; do
    echo "File System Application : "
    echo "choose one of the options : "
    echo "1- afficher l'espace disque restant"
    echo "2- afficher les fichier volumineux"
    echo "3- compresser les fichier volumineux"
    echo "4- Supprimer les fichiers volumineux"
    echo "5- revenir au menu principale"
    echo "99- quitter"
    read a
    case $a in
    1) free ;;
    2)
        cd /home/mednoun/Desktop &&
            sudo du -hsx * | sort -rh | head -10
        ;;
    3)
        cd /home/mednoun/Programming/Unix/TP3/TP_linux &&
            ./TP5.sh
        ;;
    4)
        cd /home/mednoun/Programming/Unix/TP3/TP_linux &&
            ./TP5.sh
        ;;
    5)
        ./main.sh
        break
        ;;
    99) exit 1 ;;

    esac
done
