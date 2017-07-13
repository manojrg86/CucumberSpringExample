@orderprocessing
Feature: newOrder

Scenario: Place an order and process the order completely

Given I have "1 Regular" item available in ship node "009431"
Then I place the order with "Overnight" shipping
Then I schedule the order
Then I release the order
Then I create the shipment