Feature: Authentication Feature

  Scenario Outline: Postive Sign In eCommerce
    Given pengguna masuk ke halaman login.
    When pengguna memasukkan username "<username>".
    And pengguna memasukkan password "<password>".
    And pengguna menekan tombol login.
    Then pengguna akan di bawa ke halaman appointment dengan url "<url>" untuk memeriksa hasil test.

    Examples:
      | username | password           | url                                                  |
      | John Doe | ThisIsNotAPassword | https://katalon-demo-cura.herokuapp.com/#appointment |

  Scenario Outline: Negative Sign In eCommerce
    Given pengguna masuk ke halaman login.
    When pengguna memasukkan username "<username>".
    And pengguna memasukkan password "<password>".
    And pengguna menekan tombol login.
    Then pengguna akan melihat pesan kesalahan "<message>".

    Examples:
      | username    | password           | message                                                          |
      | InvalidUser | ThisIsNotAPassword | Login failed! Please ensure the username and password are valid. |
      | John Doe    | wrong_password     | Login failed! Please ensure the username and password are valid. |
      |             |                    | Login failed! Please ensure the username and password are valid. |
      |             | wrong_password     | Login failed! Please ensure the username and password are valid. |
      | John Doe    |                    | Login failed! Please ensure the username and password are valid. |
