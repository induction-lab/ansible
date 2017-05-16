@echo off
cd "%~dp0"
set GIT_HOME=d:\PROG\GIT\bin\
set PATH=%PATH%;d:\PROG\GIT\bin\
git add .
git commit -m "-"
git push https://github.com/induction-lab/ansible.git
::pause