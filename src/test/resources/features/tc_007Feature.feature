Feature: Validar navegación a través de menús

  Scenario: Navegar a secciones a través del menú principal
    Given El usuario está en la página principal
    When El usuario hace clic en cada opción del menú principal
    Then El usuario es redirigido a la sección correspondiente
    And La página muestra todo el contenido relevante