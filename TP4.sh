#!/bin/zsh
getParrent() {
    echo "pleas give us a process id : pleas please :"
    read pid
    parent="Parent of $pid : $(ps -o ppid= $pid)"
    echo $parent
}
getParents() {
    echo "pleas give us a process id : pleas please :"
    read pid
    ppid=$(ps -o ppid= $pid)
    echo "$((ppid)) hello there i am the"
    while [[ $ppid -ne 0 ]]; do
        echo "Parent of $pid : $ppid"
        pid=$ppid
        ppid=$(ps -o ppid= $pid)
    done
}
while [ $choice!=0 ]; do
    echo "

********************************************************
Bonjour choisissez une option :
1 - Afficher parent
2 - Afficher les Parents
0 - Exit"
    read choice
    case "$choice" in
    1) getParrent ;;
    2) getParents ;;
    esac
done
