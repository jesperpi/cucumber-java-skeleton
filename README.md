# Cucumber-Java Rerun Skeleton

This is the simplest possible build script setup for Cucumber using Java demonstrating how to rerun failing cucumber tests.

There is a single feature file with three scenario. Each scenario has a 1/2 chance of failing.
Without rerun you would expect the feature to fail 7 times out of 8.
Currently the project is configured to rerun each failing test 2 times:
  -Dsurefire.rerunFailingTestsCount=2
This means that each scenario has a 1/8 chance of failing and the feature as a whole will fail 3 times out of 8.

## Use Maven

Open a command window and run:

    mvn test

This runs Cucumber features using Cucumber's JUnit runner. The `@RunWith(Cucumber.class)` annotation on the `RunCukesTest`
class tells JUnit to kick off Cucumber.