Feature: Búsqueda de empleos en IPLACEX

  Scenario: Buscar empleo de Ingeniero en Informática
    Given El usuario está en la página de inicio de IPLACEX
    When El usuario navega a la pestaña "ALUMNOS"
    And El usuario selecciona "Empleos"
    And El usuario selecciona "Región"
    And El usuario introduce "Ingeniero en Informática" en el campo de búsqueda
    Then Se muestran los resultados de búsqueda relacionados
