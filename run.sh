#!/bin/bash
mvn clean install
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
export CLASSPATH
echo $CLASSPATH
java --class-path $CLASSPATH cn.nextop.main.demo.Main