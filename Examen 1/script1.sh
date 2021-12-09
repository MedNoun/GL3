while true; do
    echo "choose an option : "
    echo "1- lister les modules "
    echo "2- show the users habing the rights of the root"
    echo "3- show the process running since x minutes"
    echo "99- quit"
    read choice
    case $choice in
    1) lsmod ;;
    2) grep ':x:0' /etc/passwd | cut -d: -f1 ;;
    3)
        echo "Minutes ?"
        read h
        ps -Ao pid,etimes | awk '{ if($2 >= ('$h'*60)) print $1,$2 }'
        ;;
    99) exit 1 ;;

    esac

done
