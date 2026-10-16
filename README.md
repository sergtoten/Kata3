# KATA3

#### - OBJETIVOS
La tercera kata consolida la transformación de datos justo después de trabajar con InputStream
y OutputStream. La idea principal de esta práctica es demostrar el uso del protocolo HTTP y el como se deserializa en esta ocasión un formato JSON
en un objeto.

#### - CÓMO COMPILAR Y EJECUTAR
En esta ocasión basta con simplemente estar en la clase `Main` que se encuentra en el paquete `software.ulpgc.katas` y en este 
clickar en el botón de runear que tiene el propio IntelliJ o usar shift + F10, de esta manera se compila y runea.

#### - DEPENDENCIAS Y VERSION DE JDK
- **Build System:** Maven
- **JDK:** openjdk-26
- **Dependencies:** Gson

#### - ESTRUCTURA DE LA ENTREGA Y CLASES PRINCIPALES
- **Estructura:** La estándar de Maven
```
Kata3/
├── .idea/
├── .mvn/
├── pictures/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── software.ulpgc.katas/
│   │   │       ├── DtoUser.java
│   │   │       ├── Main.java
│   │   │       └── User.java
│   │   └── resources/
│   └── test/
├── target/
├── .gitignore
├── pom.xml
└── README.md
```
- **Clases Principales:** DtoUser, Main, User

#### - FLUJO DE GIT USADO
Se ha seguido una versión simplificada del modelo de flujo Gitflow, utilizando principalmente dos ramas: `main` como rama estable/principal y `develop` como 
rama de trabajo donde se integraron la mayoría de los commits.

Para clonar el repositorio se puede usar en la terminal del IntelliJ el comando `git clone`, pero también se puede hacer desde la propia interfaz antes de crear un proyecto.

## ENLACE AL VIDEO EXPLICATIVO
[https://youtu.be/UBGOnvGSxBQ](https://youtu.be/tDLPOrKmnxM)

En el video explicativo se muestra como se hizo la kata repitiendo los pasos que realizó el profesor en clases.
