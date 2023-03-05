#language: es
Característica: Consulta de usuario
  Quiero validar la informacion de un usuario en la api


  @datosEmpleados
  Esquema del escenario: Realizar la peticion para obener la informacion de un usuario
    Dado que el usuario cargo los datos para realizar una consulta
      | infoClient   | email   | first_name   | last_name   | date   |
      | <infoClient> | <email> | <first_name> | <last_name> | <date> |
    Cuando se realiza la consulta a la api
    Entonces se validara la informacion obtenida
    Ejemplos:

      | infoClient | email                  | first_name | last_name | date    |
      | 1          | george.bluth@reqres.in | George      | Bluth    | exitoso |