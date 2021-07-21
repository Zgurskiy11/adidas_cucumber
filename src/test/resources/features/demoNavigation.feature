

  Feature: Demoblaze website purchase functionality
   @smoke
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

@smoke
      Scenario: Deleting Dell Laptop from Cart
        Given user is on Cart page with items in the cart
        When  user clicks on delete button referring to Dell i7 8gb laptop
        Then Dell i7 8gb gets deleted from the list


      Scenario: Purchasing the item
        Given user is on Cart page with Sony laptop in the cart
        When user clicks on Place Order button
        And user fills out all form fields
        And user clicks on purchase
        Then user should be able to see purchase ID and Amount
        And user should verify purchase amount
        Then clicks ok

        Scenario: Verify all the products exists in the categories
          Given user is on the main page
          Then Under "Phones" category user should see the list of products
            | Samsung galaxy s6 |
            | Nokia lumia 1520  |
            | Nexus 6           |
            | Samsung galaxy s7 |
            | Iphone 6 32gb     |
            | Sony xperia z5    |
            | HTC One M9        |

          And Under "Laptops" category user should see the list of products
            | Sony vaio i5        |
            | Sony vaio i7        |
            | MacBook air         |
            | Dell i7 8gb         |
            | 2017 Dell 15.6 Inch |
            | MacBook Pro         |
          And Under "Monitors" category user should see the list of products
            | Apple monitor 24 |
            | ASUS Full HD     |



