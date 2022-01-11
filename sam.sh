#! /bin/bash 

sudo cp -r /var/lib/jenkins/workspace/SpringBootProject1/employee/target/employee-0.0.1-SNAPSHOT.war /opt/scrunch/backup/$run 
sudo rm -rf /opt/scrunch/deploy/$run  
nohup java -jar /opt/scrunch/deploy/$run /var/lib/jenkins/workspace/SpringBootProject1/employee/target/employee-0.0.1-SNAPSHOT.war &