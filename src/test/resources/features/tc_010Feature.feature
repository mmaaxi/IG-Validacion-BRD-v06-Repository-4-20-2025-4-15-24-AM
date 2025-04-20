Feature: Validación de compatibilidad del sistema en diferentes navegadores

  Scenario: Verificar comportamiento del sistema en varios navegadores
    Given que accedo al sistema desde los navegadores "Chrome", "Firefox", "Edge", "Safari"
    Then el sistema debe mostrar un comportamiento consistente en interfaz y funcionalidad

  Scenario: Verificar adaptabilidad del sistema a diferentes resoluciones
    Given que configuro resoluciones de pantalla "1920x1080", "1366x768", "1280x800", "800x600" en cada navegador
    Then el sistema debe adaptarse correctamente a diferentes resoluciones sin errores de diseño