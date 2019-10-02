# Simple Java Project with gradle

## how to start


type gradle init

```
gradle init

```

choose aplication

```

Select type of project to generate:
  1: basic
  2: application
  3: library
  4: Gradle plugin
Enter selection (default: basic) [1..4] 2


```


choose java

```
Select implementation language:
  1: C++
  2: Groovy
  3: Java
  4: Kotlin
  5: Swift
Enter selection (default: Java) [1..5] 3

```

you can choose default for build script

```

Select build script DSL:
  1: Groovy
  2: Kotlin
Enter selection (default: Groovy) [1..2]

```

also framework, choose default

```

Select test framework:
  1: JUnit 4
  2: TestNG
  3: Spock
  4: JUnit Jupiter
Enter selection (default: JUnit 4) [1..4]

```

and project name


## run


to run just type gradlew run --console=plain

```
C:\project\java\example>gradlew run --console=plain
> Task :compileJava
> Task :processResources NO-SOURCE
> Task :classes

> Task :run
Hello world.

BUILD SUCCESSFUL in 3s
2 actionable tasks: 2 executed

```

## optional

for using scanner using `System.in`, dont forget add in build.gradle

```

...

run{
    standardInput = System.in
}


...

```




