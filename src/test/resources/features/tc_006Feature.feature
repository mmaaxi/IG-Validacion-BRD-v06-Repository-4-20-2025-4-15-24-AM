Feature: Validar cambio de contraseña

  Scenario: Usuario desea cambiar su contraseña
    Given el usuario ingresa al sistema con credenciales válidas
    When accede a la sección de configuración de cuenta
    And ingresa la contraseña actual y la nueva contraseña
    And hace clic en el botón 'Guardar cambios'
    Then se muestra un mensaje de confirmación que la contraseña ha sido cambiada exitosamente