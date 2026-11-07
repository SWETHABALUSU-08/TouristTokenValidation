@echo off
set JAVA_HOME=C:\Users\HP\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.7.v20250502-0916\jre
cd /d D:\TouristTokenAPI\TouristTokenAPI_Eclipse
mvn.cmd clean package -q 2>&1
