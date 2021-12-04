#!/bin/bash
choice=-1
while [ $choice != 0 ]; do
    echo "

****************************************************
Bonjour choisissez une option :
1- Afficher l'adresse ip de la machine
2- Changer l'adresse ip de la machine
3- Afficher les ports et services
4- Afficher les ports TCP
5- Afficher les ports UDP
6- Afficher les ports actifs 
7- Status
0- Exit"
    read choice
    case "$choice" in
    1) ifconfig -a | grep inet | head -1 | sed 's/^ *//g' | cut -d" " -f2 ;;
    2)
        echo "Donner nouvelle adresse ip champ par chanps"
        read ip
        IFS="."
        set $ip
        echo "champ1=$1"
        echo "champ2=$2"
        echo "champ3=$3"
        echo "champ4=$4"
        if (($1 < 0)) || (($2 < 0)) || (($3 < 0)) || (($4 < 0)); then
            echo " erreur <0"
            exit
        else
            if (($1 > 255)) || (($2 > 255)) || (($3 > 255)) || (($4 > 255)); then
                echo " erreur sup a 255"
                exit
            else
                echo "Adresse ip=$ip"
            fi
        fi
        echo "Donner l'interface"
        read interface
        sudo ifconfig $interface $ip
        ;;
    3) netstat ;;
    4) netstat -p TCP ;;
    5) netstat -p UDP ;;
    6) netstat -a ;;
    7) ip a | grep wlan | grep "DOWN" || ip a | grep wlan | grep "UP" ;;
    8) nmcli con up 'Mohamed’s iPhone' ;;
    9) nmcli con down 'Mohamed’s iPhone' ;;
    0) echo "BYE" ;;
    *) echo "invalid choice" ;;
    esac
done
