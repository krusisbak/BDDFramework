Feature: Nopcommerce Login
  #Simple Hard coded scenario
  Scenario:  Nopecommerce Login Test
    Given User is on login page
    When Title of login page
    Then User enters username and password
    Then User click on login button
    Then User is on homepage
    Then close the browser

    #Simple data driven - without example keyword
#  Scenario: Nopecommerce Login Test
 #   Given User is on login page
  #  When Title of login page
   # Then User Enters "krusisbak@yahoo.co.uk" and "Guru@911"
    #Then User click on login button
    #Then User is on homepage
    #Then close the browser

    #Simple data driven - with example keyword
  #Scenario: Scenario Outline: Nopecommerce Login Test
   # Given User is on login page
    #When Title of login page
   # Then user enters "<username>" and "<password>"
    #Then User click on login button
  #  Then User is on homepage
   # Then close the browser
    #Examples:
    #|username               |password
    #|krusisbak@yahoo.co.uk  |Guru@911
  #  |krusisbak@hotmail.co.uk|Guru@911
   # |krusisbak@gmail.co.uk  |Guru@911

    #Data Table
#  Scenario: Nopecommerce Login Tes
 #   Given User is on login page
  #  When Title of login page
   # Then User Enters Username and Password
    #|krusisbak@yahoo.co.uk|Guru@911
    #Then User click on login button
 #   Then User is on homepage3
  #  Then close the browser