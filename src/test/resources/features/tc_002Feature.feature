Feature: Validar mensaje de error con credenciales incorrectas

  Scenario: Mensaje de error al iniciar sesión con credenciales incorrectas
    Given el usuario está en la página de inicio de sesión
    When ingresa un nombre de usuario incorrecto
    And ingresa una contraseña incorrecta
    And hace clic en el botón 'Iniciar sesión'
    Then se muestra un mensaje de error indicando 'Credenciales incorrectas'