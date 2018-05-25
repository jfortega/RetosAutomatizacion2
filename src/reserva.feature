#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@ReservarViaje
Feature: Reservar Viaje.
 Yo como viajero requiero reservar un viaje para cartagena en el mes de septiembre.

  @ReservaExitosa
  Scenario: Reserva Exitosa
    Given IngresoPaginaReservas
    And UbicoReserva
    When IngresoOrigen
    And IngresoDestino
    And IngresoFechaInicio
    And IngresoFechaFin
    And IngresoNroPasajeros
    And RealizoBusqueda
    Then importoExcelPrecios