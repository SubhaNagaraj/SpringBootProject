#! /bin/bash 

PROJECT_DIR=/myagent/_work/2/s/

cd $PROJECT_DIR/employee/

sudo docker build -t subha6867/employee:latest .

sudo docker push subha6867/employee:latest

sudo kubectl delete all --all 

cd ..
sudo kubectl apply -f deployment.yaml