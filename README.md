# cucumber
This Project will have all feature demo use case of Cucumber .

<B>WHY Cucumber:</B>
Behavior Driven Development (BDD): It implement important acceptance test scenarios while development is in-progress.
BDD gives an opportunity to create test scripts from developers, project managers, QAs, user acceptance testers and the product owner (stockholder).All these cucumber test scripts are in simple English language, so it serves the purpose of documentation also.
It help us to Break big application into mutiple features and Test each feature with all possible scenarios.

Cucumber reads the code written in plain English text (Language Gherkin)
It finds the exact match of each step in the step definition (a code file , assume as Binding gate)
Cucumber supports different languages/framework  Java (spring Framework) , .net and  Ruby on Rails,Selenium,PicoContainer,Watir

<I>People from different community like developers, project managers, product owners, and testers contribute while developing test scripts. Test script acts as common contract point for all . One Place for Documentation . </I>

It supports not only English but many other native languages such as French, Finnish, Indonesian, Hungarian, Hindi, Urdu, Gujarati, etc.


In example ,Have used selenium to test login feture of facebook :

To run and explore my examples  : make sure you have install chrome web drive just for selenium

All runnable examples are under /src/test/java . 

a)In each package run RunTest.java file as Junit Test case

b) Before executing and RunTest.java , Please read Feature file mentining BDD (Behavior driven development) scenarios.

<B>1) package annotation (Basic example):</B> Basic example coverring scenario with case statement and hardcoded input to test scenarios

<B>2) package outline (Dymanic parameter passing):</B>use of Scenario Outline with use of example. Scenario will be execuated for each  parameters set specified in example.

<B>3) package cucumberTag (Tags to Incluse and exclude scenarios): </B>In this example we can tag scenarios like @smokeTesting @IntegrationTesting , these tage will help to include or exclude that scenario while running Test cases . Exclusion and inclusion happens in RunTest.java class using Tag attribute in cucumber.options

<B>4)package hookTest (Pre and Post jobs):</B> In step defination file  HookTest.java we can  use @Before and @After hook to setup and cleanup task while test execution.

<B>5)package dataTableTest (Parameter map Passing) :</B> Check feture file , this example show how we can pass Parameter map to any particular step of scenario. This example use form parameters while doing automated testing .

<B>6)package cucumberReport (report Format): </B>check RunTest.java , we use cucumber otion with format to specify output format of test result . e.g we can specify html or json.

<I>Use chrome plugin "Tidy Gherkin", it will take feature file (plain english) and  generate corresponding Step defination code File. In code defination file call your corresponding api to test respective scenario step.</I>
