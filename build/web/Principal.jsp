<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kuii</title>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">    
    </head>
    <body style="background-color: #404040">
        <div class="container" style="margin-top: 30px">
            <div class="row">
                <div class="col col-lg-6 offset-3" style="background-color: #FDD835">
                    <h1 class="text-center">Kuii ${us.nombreUsuario}!!</h1>
                </div>
            </div>
            <br>
            <div class="row">
                <div class="col col-md-4 offset-4" style="background-color: #FDD835">
                    <h4 class="text-center">Tu ID de kuii es ${us.usuario}</h4>
                </div>
            </div>

            <hr>

            <div class="row">
                <div class="col-lg">
                    <div class="row" style="background-color: #FDD835">
                        <h2 class="text-center">Tus Cryptos</h2>
                    </div>
                    <hr>
                    <div class="text-center" style="background-color: #FFFFFF; margin-top: 80px">
                        <h4>Tienes ${us.bitcoin} bitcoins</h4>
                        <h4>Tienes ${us.ethereum} ethereums</h4>
                        <h4>Tienes ${us.ripple} ripples</h4>
                    </div>
                </div>
                <div class="col-lg">
                    <div class="row" style="background-color: #FDD835">
                        <h2 class="text-center">Valor de Cryptos en MXN</h2>
                    </div>
                    <hr>
                    <div class="text-center" style="background-color: #FFFFFF; margin-bottom: 30px; margin-top: 30px">
                        <table border="3">
                            <thead>
                                <tr>
                                    <td width="180" height="100"><img src="imagenes/bitcoin.png" width="90" height="20"></td>
                                    <td width="180" height="100"><img src="imagenes/Ether.png" width="140" height="50"></td>
                                    <td width="180" height="100"><img src="imagenes/Ripple.png" width="130" height="90"></td>
                                </tr>
                            </thead>
                            <tr>
                                <td width="180" height="100">$${(us.bitcoin)*148785}</td>
                                <td width="180" height="100">$${(us.ethereum)*11229}</td>
                                <td width="180" height="100">$${(us.ripple)*12}</td>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>

            <hr>

            <div class="row">
                <div class="col-md">
                    <div class="text-center">
                        <button type="submit" class="btn btn-outline-warning">
                            Transferir
                        </button>
                        <button type="submit" class="btn btn-outline-warning">
                            Comprar
                        </button>
                    </div>
                </div>
                <div class="col-md">
                </div>
            </div>
        </div>
    </body>  
</html>