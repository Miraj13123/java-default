## Folder Structure
The workspace contains two folders by default, where:
- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

The workspace contains two `optional` folders, where:
- `jvm_11`: the folder contains compiled classes for jvm 11
- `jvm_17`: the folder contains compiled classes for jvm 17
- - run these if you have older jdk or jvm
- - You can also delete these folders

finally this workspace contains `srp` folder, that contains a few scripts, These are: (they are in both .bat and .sh formats)
- `clear`
- `compile`
- `run`
- `dev`
- - Dont run these from the srp folder directly
- - Copy them into the main folder where `src` and `lib` folder exist
- - - then you can run them directly by clicking or from command prompt relatively

---
---
> ## Examples
>>### Running "run.bat" relatively from main/master folder if the bat file is in `srp` folder
>>```batch
>>srp\run.bat
>>```
>>
>>### Running "run.bat" directly from main/master folder if the bat file is also in the main/master folder (or you can run it by double clicking {but not from srp folder !!} )
>>```batch
>>run.bat
>>```
---
---
 
## How to run in you [linux:bash] / [windows:cmd/pwsh]
### You must have Java Runtime Environment installed in your system

run these bat[windows] or bash[linux] script in this order
- clear [ clears the previous compiled classes ]
- compile [ compiles the "\*.java" files --> "\*.class" files ]
- run  [ starting with this will work; cause the compiled classes are given ]

> ## you can also run dev.sh to run all 3 at once !!

---
---

### If you want a template to start a project without knowing any build tools:
```
https://github.com/Miraj13123/java-default/tree/main
```
[https://github.com/Miraj13123/java-default/tree/main](https://github.com/Miraj13123/java-default/tree/main)

---
### For advanced users:
```
https://github.com/Miraj13123/java-advanced/tree/main
```
[https://github.com/Miraj13123/java-advanced/tree/main](https://github.com/Miraj13123/java-advanced/tree/main)

---
### If you want to setup:
```
https://github.com/Miraj13123/java-setup/tree/main
```
[https://github.com/Miraj13123/java-setup/tree/main](https://github.com/Miraj13123/java-setup/tree/main)