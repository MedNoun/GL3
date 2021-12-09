while true; do
    echo "choisir une option : "
    echo "1- afficher ensemble des shells prests sur la machine "
    echo "2- afficher les shells de connexions utilisés"
    echo "3- afficher par shell de connexion la liste des utilisateurs "
    echo "99- exit"
    read choice
    case $choice in
    1) cat /etc/shells ;;
    2) ps -hp $$ | awk '{ print $5 }' ;;
    3) while IFS= read -r line; do
        echo ------$line------
        grep -s $line /etc/passwd | cut -d: -f1
    done <"/etc/shells" ;;
    99) exit 1 ;;
    esac

done
