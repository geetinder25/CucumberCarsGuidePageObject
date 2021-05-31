@Search-Page
Feature: Acceptance testing to validate Search Cars Page & Used Cars Search Page is working.

Background:
Given I am on the homepage "https://www.carsguide.com.au/" of CarsGuide website
When I move to the topmenu option buy + sell
|  TopMenu    |
| buy + sell  |
| reviews     |
| news        |

@Search-Cars
Scenario: Validate Search Cars Page
When I click on "Search Cars" link
And I select the Car brand as "Audi"
And I select the Model as "Q3"
And I select the Location as "NSW - All"
And I select the Price as "$30,000"
And I click on Find My Next Car
Then I should see list of searched cars from "Audi"
And I should see the page with the title "Audi Q3 Under 30000 for Sale NSW | carsguide"

@Search-Used-Cars
Scenario: Validate Search Used Cars Page
When I click on "Used" link
And I select the Car brand as "Ford"
And I select the Model
| CarModel |
| Capri    |
| Everest  |
| F 150    |
And I select the Location as "ACT - All"
And I select the Price as "$40,000"
And I click on Find My Next Car
Then I should see list of searched cars from "Ford"
And I should see the page with the title "Used Ford Everest Under 40000 for Sale ACT | carsguide"
