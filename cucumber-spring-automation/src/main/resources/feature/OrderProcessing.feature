@orderprocessing
Feature: Orderprocessing

@important
Scenario: Place an order test4

Given I have "1 Regular" item available in ship node "009430"
Then I place the order with 10000 shipping
Then I schedule the order
Then I release the order
Then I create the shipment
