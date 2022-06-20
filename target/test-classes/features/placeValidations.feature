Feature: Validating place API's

Scenario: Verify  if place is being Successfully added using AddPlaceAPI
  Given Add place payload
  When user calls "AddPlaceAPI" with post Http request
  Then the API call got success with  status code 200
  And "status" in response body  is "OK"
  And "scope" in response body is "APP"