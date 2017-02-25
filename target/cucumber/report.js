$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('dataTableTest\dataTable.feature');
formatter.feature({
  "line": 1,
  "name": "Data table",
  "description": "",
  "id": "data-table",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "#Verify that the new user registration is unsuccessful after passing incorrect inputs."
    }
  ],
  "line": 4,
  "name": "",
  "description": "",
  "id": "data-table;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on new user registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter invalid data on the page",
  "rows": [
    {
      "cells": [
        "Fields",
        "Values"
      ],
      "line": 7
    },
    {
      "cells": [
        "First Name",
        "Tom"
      ],
      "line": 8
    },
    {
      "cells": [
        "Last Name",
        "Kenny"
      ],
      "line": 9
    },
    {
      "cells": [
        "Email Address",
        "someone@someone.com"
      ],
      "line": 10
    },
    {
      "cells": [
        "Re-enter Email Address",
        "someone@someone.com"
      ],
      "line": 11
    },
    {
      "cells": [
        "Password",
        "Password1"
      ],
      "line": 12
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User registration should be unsuccessful",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.goToFacebook()"
});
formatter.result({
  "duration": 6294204461,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.enterData(DataTable)"
});
formatter.result({
  "duration": 1071098542,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.User_registration_should_be_unsuccessful()"
});
formatter.result({
  "duration": 2331423702,
  "status": "passed"
});
});