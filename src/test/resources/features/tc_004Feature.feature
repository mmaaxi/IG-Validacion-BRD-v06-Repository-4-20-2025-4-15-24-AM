Feature: Validar límites de intentos de inicio de sesión

  Scenario: Usuario excede el límite de intentos de inicio de sesión
    Given el usuario está en la página de inicio de sesión
    When el usuario ingresa credenciales incorrectas tres veces
    Then el sistema detecta múltiples intentos fallidos
    And el sistema bloquea la cuenta temporalmente tras el tercer intento
    When el usuario intenta iniciar sesión nuevamente tras el bloqueo
    Then el sistema muestra un mensaje de 'Cuenta bloqueada temporalmente'