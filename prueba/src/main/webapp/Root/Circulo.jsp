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
        <a href="../Root/Heptagono.jsp" > Heptagono </a>
        </nav>

  
       

    </header>

    <h1>  El CIRCULO  </h1>

    <img src="../assets/images/pngwing.com.png">

    <h2> La manera de determinar el area y el perimetro es la siguiente:  </h2>

    <img src="../assets/images/Captura de pantalla 2022-11-16 000557.png" >

    <h3> El perímetro de un circulo es la circunferencia y su valor es igual diámetro multiplicado por pi   </h3>
    <h3> Como el diámetro es igual a dos radios  </h3>
    <h3> también se puede decir que la longitud de la circunferencia = p x 2r </h3>

    <h3> El área del círculo  </h3>
    <h3> es igual al valor de su radio elevado al cuadrado multiplicado por pi  </h3>
    <h3> es decir = p x r2 </h3>


    <form>

        <h4> Perímetro </h4>
        Valor de un radio: <br>
        <input type ="text" value = ""><br>

        valor de pi: <br>
        <input type = "text" value = "3.1415" readonly><br>

        <input type ="reset" value="calcular"><br>

        <input type="text" value="" readonly><br>

    </form>

    <form>

        <h4> Area </h4>
        Valor de un radio <br>
        <input type ="text" valur=""><br>
        
        valor de pi: <br>
        <input type = "text" value = "3.1415" readonly><br>
       


        <input type ="reset" value="calcular"><br>

        <input type="text" value="" readonly><br>

    </form>

</body>

</html>