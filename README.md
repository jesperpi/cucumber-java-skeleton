# Cucumber-Java Rerun Skeleton

This is the simplest possible build script setup for Cucumber using Java demonstrating how to rerun failing cucumber tests.

Each module has a single feature file with three scenarios. Each scenario has a 1/2 chance of failing.
Without rerun you would expect the feature to fail 7 times out of 8.
Currently the project is configured to rerun each failing test 3 times: <br />
  -Dsurefire.rerunFailingTestsCount=3 <br />
  -Dfailsafe.rerunFailingTestsCount=3 <br />
This means that each scenario has a 1/16 chance of failing and the feature as a whole will fail 3 times out of 16.

The two modules demonstrate the different configurations required to execute cucumber rerun as part of failsafe and as part of surefire (hint: it's pretty similar)

## Use Maven

Open a command window and run:

    mvn verify

This runs Cucumber features using Cucumber's JUnit runner. The `@RunWith(Cucumber.class)` annotation on the `RunCukesTest`
class tells JUnit to kick off Cucumber.