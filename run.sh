#!/bin/bash
mvn clean install
rm -rf ./lib
mkdir ./lib
cp ./main-demo/target/main-demo-1.0-SNAPSHOT.jar ./lib
cp ./sub-module1/target/sub-module1-1.0-SNAPSHOT.jar ./lib
cp ./sub-module2/target/sub-module2-1.0-SNAPSHOT.jar ./lib

java --module-path lib --module main/cn.nextop.main.demo.Main
