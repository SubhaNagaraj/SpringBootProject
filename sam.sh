#! /bin/bash 

sudo cp -r /var/lib/jenkins/workspace/SpringBootProject1/employee/target/employee-0.0.1-SNAPSHOT.war /opt/scrunch/backup/2022-01-10-20:04:24 
sudo rm -r /var/lib/jenkins/workspace/SpringBootProject1/employee/target/employee-0.0.1-SNAPSHOT.war /opt/scrunch/deploy/2022-01-10-22:24:50  
nohup java -jar /opt/scrunch/deploy/2022-01-10-22:24:50/var/lib/jenkins/workspace/SpringBootProject1/employee/target/employee-0.0.1-SNAPSHOT.war &