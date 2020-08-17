#!/bin/bash
git pull
export JAVA_HOME=/usr/local/jdk
export M2_HOME=/home/chenby/apache-maven-3.5.0

$M2_HOME/bin/mvn clean install
rm -rf ./lib
mkdir ./lib
cp ./main-demo/target/main-demo-1.0-SNAPSHOT.jar ./lib
cp ./sub-module1/target/sub-module1-1.0-SNAPSHOT.jar ./lib
cp ./sub-module2/target/sub-module2-1.0-SNAPSHOT.jar ./lib
lib_dir=./lib
for file in "$lib_dir"/*.jar;
do
    CLASSPATH="$CLASSPATH":"$file"
done
#export CLASSPATH
$JAVA_HOME/bin/java --module-path .lib --module main/cn.nextop.main.demo.Main