# language: es
Característica: Verificar la funcionalidad basicas de la calculadora

  @sumar
  Escenario: : Ejecutar el emulador de Android y probar la funcionalidad de sumar de la calculadora
    Dado ingresa a la calculadora
    Cuando suma el número 7 con el 8
    Entonces debe aparecer el resultado de 15

 	@Restar
 	Escenario: : Ejecutar el emulador de Android y probar la funcionalidad de restar de la calculadora
 		Dado ingresa a la calculadora
    Cuando el usuario resta el número 8 con el 5
    Entonces debe aparecer el resultado de 3
    
  @Multiplicar
 	Escenario: : Ejecutar el emulador de Android y probar la funcionalidad de multiplicar de la calculadora
 		Dado ingresa a la calculadora
    Cuando el usuario multiplica el número 9 con el 4
    Entonces debe aparecer el resultado de 36