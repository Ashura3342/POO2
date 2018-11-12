#!/bin/sh
javac -d out src/Vehicle.java src/Car.java src/Boat.java src/Hangar.java && java -classpath out/ wlc.Hangar
