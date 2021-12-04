echo "Application crontab: "
test=1
while [ $test ]; do
    echo "Selectioner une option : "
    echo "1- ajouter crontab "
    echo "2- effacer crontab "
    echo "3- supprimer tout le crontab "
    read a
    case $a in

    1)
        echo "Path ? :"
        read b
        echo "Frequence format : (min hour day_of_the_month month day_of_the_week) ? :"
        read c
        exp=$c" "$b
        echo $exp
        sudo crontab -l >croni
        echo $exp >>croni
        sudo crontab croni
        rm croni
        ;;

    2)
        echo "Path ? :"
        read p
        sudo crontab -l | grep -v $p | sudo crontab -
        ;;
    3) crontab -r ;;

    esac

done
