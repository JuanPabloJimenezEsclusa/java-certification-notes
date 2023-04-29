# module-complex practices

```shell
cd ./module-complex
rm -fr modules/operations/outDir
rm -fr modules/clients/outDir

# compile
# module 2
javac -verbose -d modules/operations/outDir --module-source-path modules $(find modules/operations -name "*.java")
java --module-path modules/operations/outDir --list-modules

# module 1
javac -verbose -d modules/clients/outDir \
  --module-path modules/operations/outDir \
  --module-source-path modules $(find modules/clients -name "*.java")
java --module-path modules/clients/outDir --list-modules

# execute
java --module-path modules/clients/outDir --module clients/com.clients.Test
java -p            modules/clients/outDir -m       clients/com.clients.Test
```

```shell
# jars
jar -c --file=modules/executables/operations.jar -C modules/operations/outDir/operations .
jar -c --file=modules/executables/clients.jar -C modules/clients/outDir/clients .

java --module-path modules/executables --module clients/com.clients.Test
java -p            modules/executables -m       clients/com.clients.Test
java --module-path modules/executables/clients.jar:modules/executables/operations.jar --module clients/com.clients.Test

## without modules
java --class-path modules/executables/operations.jar:modules/executables/clients.jar com.clients.Test
java -classpath   modules/executables/operations.jar:modules/executables/clients.jar com.clients.Test
java -cp          modules/executables/operations.jar:modules/executables/clients.jar com.clients.Test
```

```shell
# change --module-path to -p not permitted
/usr/lib/jvm/jdk-11/bin/jdeps -s modules/executables/operations.jar
/usr/lib/jvm/jdk-11/bin/jdeps --module-path modules/executables/operations.jar -s modules/executables/clients.jar

> clients -> java.base
> clients -> operations
```


## jdeps

```shell
jdeps -verbose --recursive modules/executables/clients.jar modules/executables/operations.jar
jdeps --print-module-deps modules/executables/clients.jar modules/executables/operations.jar
jdeps --list-deps modules/executables/clients.jar modules/executables/operations.jar
jdeps --jdk-internals modules/executables/clients.jar modules/executables/operations.jar
```


## jmod

```shell
jmod create --class-path modules/operations/outDir/operations  modules/executables/operations2.jar
jmod list modules/executables/operations2.jar
```
