#!/usr/bin/env bash

sudo echo $(pwd) >> /tmp/logruncustom
cd /home/ec2-user/server
sudo echo $(pwd) > /tmp/logruncustom
sudo /usr/bin/java -jar -Dserver.port=5000 ./target/*.jar >> /tmp/logrun 2>> /tmp/logrun2 << /tmp/logrun3 &