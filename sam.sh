#! /bin/bash 


TIMESTAMP_FOLDER=$(date +%F-%T)
PROJECT_DIR=/var/lib/jenkins/workspace/SpringBootProject1

sudo rm -rf /opt/scrunch/deploy/
sudo mkdir -p /opt/scrunch/deploy/
sudo mkdir -p /opt/scrunch/backup/$TIMESTAMP_FOLDER


sudo cp -r $PROJECT_DIR/employee/target/employee-0.0.1-SNAPSHOT.war  /opt/scrunch/backup/$TIMESTAMP_FOLDER/
sudo cp -r $PROJECT_DIR/employee/target/employee-0.0.1-SNAPSHOT.war /opt/scrunch/deploy/

sudo kill -9 $(sudo lsof -t -i:8081)
nohup java -jar /opt/scrunch/deploy/employee-0.0.1-SNAPSHOT.war & 