#language: es
Característica: Eliminar usuario
  Quiero eliminar un usuario de la api

  @EliminarUsuario
  Esquema del escenario: Realizar la eliminacion de un usuario
    Dado que el usuario cargo los datos para realizar una consulta
      | infoClient   | email   | first_name   | last_name   |
      | <infoClient> | <email> | <first_name> | <last_name> |
    Y elimino la informacion del usuario
    Entonces se vizualizara exitosamente la eliminacion del usuario con el codigo 204
    Ejemplos:
      | infoClient | email                  | first_name | last_name |
      | 1          | george.bluth@reqres.in | George      | Bluth    |

