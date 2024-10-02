# author: DiegoPinzon20
# date: 12/03/2023
# language: es

Característica: Gestión de SLA en la pantalla HDU 29 para Convenios


  Escenario: Establecer un SLA genérico para todos los prestadores

    Dado que el usuario selecciona la opción de agregar un nuevo SLA genérico
    Y selecciona un tipo de requerimiento del catálogo
    Y establece la fecha límite en 3 días hábiles
    Y selecciona el estado como ACTIVO
    Cuando el usuario guarda el nuevo SLA genérico
    Entonces el sistema debe aplicar este SLA genérico a todos los prestadores
    Y el sistema debe resetear todas las otras parametrizaciones de SLA al nuevo SLA genérico
