<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title> Figuras Geometricas </title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href="../assets/main.css">
    <script src='main.js'></script>
    

</head>
<body  >

    <header>

        <nav>
        <a href="../index.jsp" > Inicio </a>
        <a href="../Root/Heptagono.jsp" > Heptagono </a>
        <a href="../Root/Circulo.jsp" > Circulo </a>
        </nav>

        
       

    </header>

    <h1> El PENTAGONO  </h1>
    
    <img src="../assets/images/150204134400_pentagon_624x351_ap_nocredit.jpg" > 

    <h2> La manera de determinar el area y el perimetro es la siguiente:  </h2>

    <img src="../assets/images/Captura de pantalla 2022-11-15 234559.png" > 

    <h3> El Perímetro de un pentágono es igual a la suma de todos sus lados. </h3>
    <h3>  Perímetro: Suma de sus cinco lados </h3>
        <h3>  P = 5 x lado  </h3>

    
    <h3> El área del pentágono es igual al perímetro por apotema divido entre dos</h3>
        <h3>   Es decir:  </h3>
        <h3> Área = (Perímetro x Apotema) / 2  </h3>

        <form>

            <h4> Perímetro </h4>
            Valor de un lado: <br>
            <input type ="text" value = ""><br>


            <input type ="reset" value="calcular"><br>

            <input type="text" value="" readonly><br>

        </form>

        <form>

            <h4> Area </h4>
            Valor del perimetro <br>
            <input type ="text" valur=""><br>

            Valor del Apotema<br>
            <input type="text" value = ""> <br>


            <input type ="reset" value="calcular"><br>

            <input type="text" value="" readonly><br>

        </form>


</body>

</html>