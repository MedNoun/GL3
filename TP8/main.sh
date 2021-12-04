echo "choose one of the following : "
echo "1- file system"
echo "2- Log"
echo "99- quitter"
read a
case $a in
1) ./file.sh ;;
2) ./log.sh ;;
99) echo "bye !" && exit 1 ;;
esac
