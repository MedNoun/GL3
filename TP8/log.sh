test=1
while [ $test ]; do
    echo "Log system "
    echo "1-afficher le log system au demarage"
    echo "2-suivre le log du val/log/messages"
    echo "3-generer un log"
    echo "4-afficher le PID du syslogd"
    echo "5-revenir au menu precedent"
    echo "99-quitter"
    read a
    case $a in
    1) ls -lrt /var/log ;;
    2) sudo tail -f /var/log/messages ;;
    3)
        echo "give your log : "
        read k
        logger $k
        ;;
    4) ps -ef | grep syslog ;;
    5) ./main.sh break ;;
    99) exit 1 ;;
    esac
done
