@OrderDetail
Feature: OrderDetails

Scenario: Place an order and process the order completely

Given I have "1 Regular" item available in ship node "009432"
Then I create the shipment