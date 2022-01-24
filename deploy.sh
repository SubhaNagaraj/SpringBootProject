#! /bin/bash 

PROJECT_DIR=/myagent/_work/2/s/

cd $PROJECT_DIR/employee/

docker build -t subha6867/employee:latest .

docker push subha6867/employee:latest

kubectl delete all --all 

cd ..
kubectl apply -f deployment.yaml