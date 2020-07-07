# language: es
Característica: Permite navegar por la pagina y realizar una compra

  Antecedentes:
    Dado El usuario abre al navegador e ingresa a la página 

  @test    
  Esquema del escenario: : como usuario quiero ingresar a la pagina a comprar un computador
    Dado El usuario desea comprar una laptops
    Cuando Selecciona el computador <producto>
    Y agrega el producto al carro de compras
    Entonces Verifica la compra del computador seleccionado con el <mensaje>
    
    Ejemplos:
    
    |producto|mensaje           |
    |"Dell i7 8gb"|"Dell i7 8gb"|