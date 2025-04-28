@echo off
:: Delete .class files in lib and src directories
del /q .\lib\*.class 2>nul
del /q .\src\*.class 2>nul
echo cleared


@echo off
setlocal EnableDelayedExpansion

:: Compile Java files
javac -cp . lib\*.java src\*.java
if %ERRORLEVEL% equ 0 (
    echo all files are compiled
) else (
    echo Compilation failed
    exit /b 1
)


:run
:: Run the Java application
java -cp . src.App

endlocal
