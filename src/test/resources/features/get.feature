#language: es
Característica: Consulta de usuario
  Quiero validar la informacion de un usuario en la api


  @datosEmpleados
  Esquema del escenario: Realizar la peticion para obener la informacion de un usuario
    Dado que el usuario cargo el id para consultar
      | id   |
      | <id> |
    Cuando se realiza la consulta a la api
    Entonces se validara la informacion obtenida
    Ejemplos:

      | id   |
      | <id> |