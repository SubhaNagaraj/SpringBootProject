#! /bin/bash 


TIMESTAMP_FOLDER=$(date +%F-%T)
PROJECT_DIR=/usr/bin/bash /myagent/_work/_temp/3f42c668-d90b-44cc-a48c-07374d4d1ed1.sh

sudo rm -rf /myagent/scrunwork/deploy
sudo mkdir -p /myagent/scrunwork/deploy
sudo mkdir -p /myagent/scrunwork/backup/$TIMESTAMP_FOLDER


sudo cp -r $PROJECT_DIR/myagent/_work/2/s/employee/target/employee-0.0.1-SNAPSHOT.war  /myagent/scrunwork/backup/$TIMESTAMP_FOLDER/
sudo cp -r $PROJECT_DIR/myagent/_work/2/s/employee/target/employee-0.0.1-SNAPSHOT.war  /myagent/scrunwork/deploy/

sudo kill -9 $(sudo lsof -t -i:8081)
nohup java -jar /myagent/scrunwork/deploy/employee-0.0.1-SNAPSHOT.war & 