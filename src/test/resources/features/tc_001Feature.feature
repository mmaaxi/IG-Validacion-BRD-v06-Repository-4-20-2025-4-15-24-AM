Feature: Validar inicio de sesión con credenciales correctas

  Scenario: El usuario puede iniciar sesión con credenciales válidas
    Given que el usuario está en la página de inicio de sesión
    When el usuario ingresa nombre de usuario válido en el campo de usuario
    And el usuario ingresa contraseña válida en el campo de contraseña
    And el usuario hace clic en el botón 'Iniciar sesión'
    Then el sistema redirige al usuario a la página principal