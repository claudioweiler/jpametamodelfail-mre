# JPA metamodel fail - Minimal reproducible example

Import this Maven project into Eclipse.

A source folder `target/generated-sources/apt` and a metamodel `SimpleEntity_.java` should be created.

Tests:

1. Update Maven project (Alt+F5): pom.xml should be marked with error.
1. Context menu action `Run As > Maven test`: should output an error on console.
