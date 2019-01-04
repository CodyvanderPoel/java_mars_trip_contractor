#!/bin/bash

# clean up existing class files
rm ./*.class 2> /dev/null

# compile java files
javac ./*.java

# run Program.main
java Program
