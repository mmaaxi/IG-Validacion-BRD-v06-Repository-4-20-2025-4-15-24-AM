Feature: Validar rendimiento del sistema bajo carga

  Scenario: Sistema debe responder adecuadamente bajo carga de 100 usuarios concurrentes
    Given el entorno de prueba está configurado
    When se simulan 100 usuarios concurrentes
    Then el sistema responde en un tiempo aceptable sin caídas

  Scenario: Monitoreo del rendimiento del sistema bajo carga
    Given el entorno de monitoreo está configurado
    When se monitorea la respuesta del sistema bajo carga
    Then el rendimiento se mantiene dentro de los parámetros establecidos, sin degradación significativa