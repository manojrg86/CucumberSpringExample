@orderprocessing
Feature: newOrder

Scenario: Place an order test1

Given I have "1 Regular" item available in ship node "009431"
Then I place the order with 3000 shipping
Then I schedule the order
Then I release the order
Then I create the shipment

Scenario: Place an order test2

Given I have "1 Regular" item available in ship node "009431"
Then I place the order with 6000 shipping
Then I schedule the order
Then I release the order
Then I create the shipment