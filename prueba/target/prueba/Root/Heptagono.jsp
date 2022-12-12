<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title> Figuras Geometricas </title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='../assets/main.css'>
    <script src='main.js'></script>
    

</head>
<body  >

    <header>

        <nav>
        <a href="../index.jsp" > Inicio </a>
        <a href="../Root/Pentagono.jsp" > Pentagono </a>
        <a href="../Root/Circulo.jsp" > Circulo </a>
        </nav>

     
       
        

    </header>

    <h1>  El HEPTAGONO  </h1>

    <img src="../assets/images/6871994.png">

    <h2> La manera de determinar el area y el perimetro es la siguiente:  </h2>

    <img src="../assets/images/Captura de pantalla 2022-11-15 234559.png" >

    <h3> La fórmula para calcular el perímetro de un heptágono regular   </h3>
    <h3>  es igual a la longitud de uno de sus lados (l) multiplicada por siete; </h3>
    <h3>  P = 7 · l </h3>

    <h3>  La fórmula para calcular el área de un heptágono regular    </h3>
    <h3>  es igual al medio del perímetro (P) por la apotema (ap, distancia del centro del heptágono al punto medio de uno de sus lados)  </h3>
    <h3>  A = ( P · ap) : 2. O lo que es lo mismo; A = ( 7 · l · ap) : 2  </h3>

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