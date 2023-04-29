# module-project practices

```shell
# https://www.baeldung.com/java-9-modularity
## hello.modules contains a interface and its implementation
## main.app is another module that consumes hello.modules and use interface

# list all modules
java --list-modules

cd module-project
rm -fr outDir

# compile simple-modules and adding java.xml.crypto module
# uses find to get all .java files to compile
javac -verbose -d outDir \
  --add-modules java.xml.crypto \
  --module-source-path simple-modules $(find simple-modules -name "*.java")

# list modules including the new one
java --module-path outDir --list-modules

# execute the app using modules
java --module-path outDir --module main.app/com.baeldung.modules.main.MainApp
java -p outDir -m main.app/com.baeldung.modules.main.MainApp
```
