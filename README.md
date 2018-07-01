## Curso Introducción a Java



### Variables de Entorno

Java JDK 8

JAVA_HOME
C:\Program Files\Java\jdk1.8.0_171

JRE_HOME
C:\Program Files\Java\jre1.8.0_171

Maven

M2_HOME
D:\apache-maven-3.5.0

MAVEN_HOME
D:\apache-maven-3.5.0

Repositorio
```
D:\M2_REPOSITORY
```
Settings.xml
```
<?xml version="1.0" encoding="UTF-8"?>
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd">
		  
  <localRepository>D:\M2_REPOSITORY</localRepository>

</settings>
```

### Maven Eclipse Setup

Windows \ Preferences \ Maven \ Intallations \

Add Directory - Installation home

D:\apache-maven-3.5.0

User settings - Browser settings 

Global Settings y User Settings

D:\apache-maven-3.5.0\conf\settings.xml

Local Repository

D:\M2_REPOSITORY


### Primer Proyecto

mvn archetype:generate -DgroupId=cl.fuentes.app
					   -DartifactId=hola-mundo
					   -DarchetypeArtifactId=maven-archetype-quickstart
					   -DinteractiveMode=false


cd hola-mundo
					   
mvn clean
					   
mvn package

java -cp target/hola-mundo-1.0-SNAPSHOT.jar cl.fuentes.app.App


### Convertir a Eclipse

mvn eclipse:eclipse



