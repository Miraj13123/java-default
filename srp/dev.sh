
./clear.sh
#echo from this file

#javac lib/*.java && javac -classpath . src/App.java
javac -classpath . lib/*.java src/*.java
echo all files are compiled

#!/bin/bash
java src.App
