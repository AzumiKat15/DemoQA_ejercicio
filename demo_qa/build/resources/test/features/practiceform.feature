Feature:  Llenar formulario
  yo como usuario administrador de la Web demoQA
  quiero dirigirme a la seccion de formulario
  para poder ingresar estudiantes a una lista



  Scenario:  Registro exitoso
    Given el administrador esta en la pagina principal
    When navega hasta la opcion
    And completa los campos con la informacion del estudiate
    Then  debe observar una ventana con la informacion ingresada