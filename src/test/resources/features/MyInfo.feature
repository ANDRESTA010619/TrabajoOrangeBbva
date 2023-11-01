Feature: yo Quiero hacer las funcionalidad My InFo

  @HU002
  Scenario Outline: Contact Details
    Given abrir el navegador
    And the user fill out user <userName> and password <password>
    And the user modifies Contact Details
    And the user fill out Contact Details street1<street1> and street2<street2> and city<city> and province<province> and Zip<zip>
    When the user searching country<typeCountry>

    Examples:
      | userName | password | street1       | street2     | city   | province       | zip  | typeCountry |
      | Admin    | admin123 | calle12 12 12 | calle 4 5 4 | La Paz | Cuatro Cañadas | 0571 | Bolivia     |