Este proyecto en Spring-boot se encarga de encontrar 
el mayor Palindromo de acuerdo a una cadena de 
caracteres suministrada por el usuario implementando JWT

En caso tal de ejecutar el proyecto localmente, 
este se iniciara en el puerto 8080, si desea cambiarlo,
este se encuentra en el application.yml

¡No olvides instalar las dependecias para el buen funcionamiento del programa!

se tendra un total de 3 end points:

Raiz general: localhost:8080/services/api/v1/

============ Ends Points publicos

==== Encontrar Palindromo

Tipo: GET

End point: localhost:8080/services/api/v1/{cadena}

Ejemplo: localhost:8080/services/api/v1/tu cadena de caracteres

Descripción: Este end point te permitira encontrar el mayor 
palidromo sin la necesidad de enviar una autorización 

==== Obtener autorización

Tipo: POST

End point: localhost:8080/services/api/v1/getAuthorization

Ejemplo: En este caso se envian las credenciales por el Body

Usuarios para ingresar: 

Usuario 1: myuserone ===
Clave: myuserpassword

Usuario 2: myusertwo ===
Clave: myuserpassword

Envio por Body: { "usuario":"myuserone", "clave":"myuserpassword" }

Descripción: Este end point te permitira generar una token siempre y 
cuando ingreses las credenciales correctas para posteriormente
usarse en el end point siguiente

============ Ends Points protegidos

==== Encontrar Palindromo

Tipo: GET

End point: localhost:8080/services/api/v1/palindromo/{cadena}

Ejemplo: localhost:8080/services/api/v1/palindromo/tu cadena de caracteres

En la pestaña de POSTMAN "Authorization" debes enviar una autorizacion tipo
Bearer Token para posteriormente ingresar el token que obtuveste por medio del
end point anterior 

Descripción: Este end point te permitira encontrar el mayor
palidromo siempre y cuando tengas autorización, en caso de no enviar 
la debida autorización obtendras un error