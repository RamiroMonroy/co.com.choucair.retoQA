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

  @CP-002
  Scenario Outline: Validate that the page is correct
    Given the user is on the web page
    When enter in a option of the main menu
      | option |
      |<option>|
    Then the user should see this title
      | message |
      |<message>|
    Examples:
      | option    |message |
      | Servicios |Digital Performance Management|
      | Industrias|Banca|
      | Formación |Programación cursos|
      | Comunidad |Pruebas rigurosas de las plataformas de pagos se requieren mas que nunca|
      | Empleos   |¿Qué es ser Choucair?|
      | Nosotros  |Nuestra Misión|
      |Contáctenos|Contáctenos   |

  @CP-004
  Scenario Outline: Test button functionality ir al portal de empleos
    Given the user is on the web page
    When enter in the option Empleos and click the button ir al portal de empleos

    Then the user should see this message <message>

    Examples:
      | message  |
      |¡Atención!Estas saliendo de choucairtesting.com|
