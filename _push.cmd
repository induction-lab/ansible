@echo off

cd "%~dp0"
set GIT_HOME=d:\PROG\GIT\bin\
set PATH=%PATH%;d:\PROG\GIT\bin\

set count=1
for /f "tokens=* usebackq" %%f in (`type .credentials`) do (
    set line=%%f
    set credentials!count!=!line:@=%%40!
    set /a count=!count!+1
)

git config --global user.email "induction.lab@gmail.com"
git config --global user.name "induction.lab"
git config --global core.autocrlf false

git add .
git commit -m "-"
git push https://%credentials1%:%credentials2%@github.com/induction-lab/ansible.git
::pause