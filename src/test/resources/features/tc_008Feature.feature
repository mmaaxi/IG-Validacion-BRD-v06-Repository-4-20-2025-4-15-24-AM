Feature: Validar respuesta del sistema ante entrada de datos inválida

  Scenario: Ingresar datos alfanuméricos en un campo que espera sólo números
    Given el usuario está en la página de entrada
    When el usuario ingresa datos alfanuméricos en el campo numérico
    Then el sistema muestra un mensaje de error de validación

  Scenario: Ingresar caracteres especiales en un campo que no los permite
    Given el usuario está en la página de entrada
    When el usuario ingresa caracteres especiales en un campo restringido
    Then el sistema previene la entrada y muestra un aviso