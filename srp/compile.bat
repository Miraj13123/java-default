@echo off
::setlocal EnableDelayedExpansion

:: Compile Java files
javac -cp . lib\*.java src\*.java

::error handling   // u can skip this or delete this. then it will not notify u if the compilation is failed or not
if %ERRORLEVEL% equ 0 (
    echo all files are compiled
) else (
    echo Compilation failed
    exit /b 1
)
