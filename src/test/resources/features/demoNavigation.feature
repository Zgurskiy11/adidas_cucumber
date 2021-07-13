
@wip
  Feature: Demoblaze website purchase functionality

       Scenario: Adding Sony Laptop to Cart
        Given user is on the main page
        When user clicks on Laptop
        And user chooses Sony vaio i5
        And user clicks on Add to cart
        And accepts pop up
        Then user should be able see Sony in the cart

      Scenario: Adding Dell Laptop to Cart
        Given user is on the main page
        When user clicks on Laptop
        And user chooses Dell i7 8gb
        And user clicks on Add to cart
        And accepts pop up
        Then user should be able see Dell in the cart

      Scenario: Deleting Dell Laptop from Cart
        Given user is on Cart page with items in the cart
        When  user clicks on delete button referring to Dell i7 8gb laptop
        Then Dell i7 8gb gets deleted from the list



