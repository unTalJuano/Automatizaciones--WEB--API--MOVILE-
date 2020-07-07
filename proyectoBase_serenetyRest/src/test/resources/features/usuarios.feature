#language: es

Característica: Verificar el CRUD de usuarios desde API
  como usuario deseo validar la funcionalidad del servicio de la API
  Para garantizar que el flujo funciona correctamente


  @BuscarUsuario
  Esquema del escenario: Validar la respuesta del servicio para buscar usuarios
    Dado el usuario desea consumir el servicio single user con el id <id> para verificar que existe
    Cuando el usuario envia la petición para actualizar el usuario <id> con los datos:
    | name           | job |
    | Juanito   | Ingeniero        |
    Entonces el deberia ver que la respuesta es un codigo <codigo> con el nombre <nombre>
    
    Ejemplos:
    
    |id|codigo|nombre|
    |8|200|Juanito|
    
  @CrearUsuario
   Esquema del escenario: Validar la respuesta del servicio para crear usuarios
    Cuando el usuario envia la petición para crear el usuario con los datos:
    | name           | job |
    | Pedro   | Ingeniero        |
    Entonces el deberia ver que la respuesta es un codigo <codigo> con el nombre <nombre>
    
    Ejemplos:
    
    |codigo|nombre|
    |201|Pedro|