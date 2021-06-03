$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/ShopPage.feature");
formatter.feature({
  "line": 1,
  "name": "Shop Page",
  "description": "",
  "id": "shop-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "A Returning Registered Customer",
  "description": "",
  "id": "shop-page;a-returning-registered-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "A Registered user logs in",
  "keyword": "When "
});
formatter.step({
  "line": 4,
  "name": "User clicks on phones \u0026 PDSs",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "User adds iphone to Cart",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User selects Cameras",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User Adds Nikon D300 to cart",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks cart",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User checkout",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User logs out",
  "keyword": "But "
});
formatter.match({
  "location": "ShopPageSteps.a_Registered_user_logs_in()"
});
formatter.result({
  "duration": 35465656700,
  "status": "passed"
});
formatter.match({
  "location": "ShopPageSteps.user_clicks_on_phones_PDSs()"
});
formatter.result({
  "duration": 734105600,
  "status": "passed"
});
formatter.match({
  "location": "ShopPageSteps.user_adds_iphone_to_Cart()"
});
formatter.result({
  "duration": 3894030600,
  "status": "passed"
});
formatter.match({
  "location": "ShopPageSteps.user_selects_Cameras()"
});
formatter.result({
  "duration": 659253800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "300",
      "offset": 17
    }
  ],
  "location": "ShopPageSteps.user_Adds_Nikon_D_to_cart(int)"
});
formatter.result({
  "duration": 1834763500,
  "status": "passed"
});
formatter.match({
  "location": "ShopPageSteps.user_clicks_cart()"
});
formatter.result({
  "duration": 713253100,
  "status": "passed"
});
formatter.match({
  "location": "ShopPageSteps.user_checkout()"
});
formatter.result({
  "duration": 897046500,
  "status": "passed"
});
formatter.match({
  "location": "ShopPageSteps.user_logs_out()"
});
formatter.result({
  "duration": 2280383100,
  "status": "passed"
});
});