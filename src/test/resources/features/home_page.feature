Feature: Validate main menu functionalities
  As a PO I need to check that the main menu options of the https://www.choucairtesting.com website work correctly

  @CP-001
  Scenario Outline: Check main page operation
    Given the user is on the web page
    Then the user should see the options of main menu
    | servicios | industrias | formacion | comunidad | empleos | nosotros | contactenos |
    |<servicios>|<industrias>|<formacion>|<comunidad>|<empleos>|<nosotros>|<contactenos>|

    Examples:
      | servicios | industrias | formacion | comunidad | empleos | nosotros | contactenos |
      | Servicios | Industrias | Formación | Comunidad | Empleos | Nosotros | Contáctenos |

  