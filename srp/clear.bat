@echo off

:: Delete .class files in lib and src directories
del /q .\lib\*.class 2>nul
del /q .\src\*.class 2>nul

echo cleared