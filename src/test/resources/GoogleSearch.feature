Feature: Test Google search functionality

    Scenario: Validate google search is working

        Give browser is open
        And user is on google page
        When user enters 'skillfactory' in search box
        And click on search button
        Then user is navigated to search results