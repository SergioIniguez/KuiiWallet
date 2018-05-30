<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Kuii Wallet</title>
	<link rel="stylesheet" type="text/css" href="loginStyle.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
</head>
<body style="background-color: #212121">
	
	<div class="container" style="margin-top: 30px">
		<div class="row">
			<div class="col" style="background-color: #FDD835">
				<h1 class="text-center">
					Bienvenido a Kuii Wallet
				</h1>				
			</div>			
		</div>
	</div>
	<hr>
	<div class="container">
		<form action="Login" method="POST">
			<div class="row">
				<div class="col-md-4 offset-md-4" style="background-color: #FDD835">
					<label for="idUsuario">
					<b>
						ID de Usuario
					</b>				
					</label>
					<input type="text" placeholder="Ingresa tu ID de usuario" name="idUsuario" required>
				</div>
					
				<div class="col-md-4 offset-md-4" style="background-color: #FDD835">
					<label for="psw">
					<b>
						Contraseña
					</b>
					</label>
					<input type="password" placeholder="Ingresa tu Contraseña" name="psw" required>
				</div>		


					
				<div class="col-md-4 offset-md-4">
					<div class="text-center">
						<br>
						<button type="submit" class="btn btn-outline-warning">
						Entrar
						</button>
					</div>
				</div>

				<div class="col-md-4 offset-md-4">
					<div class="text-center">
						<br>
						<figure>
        					<img src="imagenes/kuii.png" class="img-fluid" alt="Responsive image">
        				</figure>					
					</div>
				</div>

			</div>
		</form>
	</div>
	
</body>
</html>