Feature: Add to cart
  
  As A user
  I want something
  So that I can do everything

  Scenario: employee should able to choose what they want
    Given "naveen" wants to order "Nasi Lemak"
    And select qty as 1
    When click on "Add to Cart"
    Then system display new button "Checkout"
    And also display total amount as "RM 4.60"

  Scenario: employee should get alert for unsual qty
    Given "naveen" wants to order "Nasi Lemak"
    And select qty as 100
    When click on "Add to Cart"
    Then system display new message "Are you Sure?"
    And also display total amount as "RM 460"
