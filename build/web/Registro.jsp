<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>Registro de usuarios</title>

    <link href="vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i" rel="stylesheet">

    <link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <link href="css/Registro.css" rel="stylesheet" media="all">
</head>

<body>
    <div class="page-wrapper bg-blue p-t-100 p-b-100 font-robo">
        <div class="wrapper wrapper--w680">
            <div class="card card-1">
                <div class="card-heading"></div>
                <div class="card-body">
                    <h2 class="title">Registro de usuarios</h2>
                    <form action="RegistroServlet" method="POST">
                        <div class="row row-space">
                        <div class="input-group">
                            <input class="input--style-1" type="text" placeholder="DNI" name="dni">
                        </div>
                        </div>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <input class="input--style-1" type="text" placeholder="Nombre" name="nombre">
                                </div>
                            </div>
                        </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <input class="input--style-1" type="text" placeholder="Apellido" name="apellido">
                                </div>
                            </div>
                        <div class="col-2">
                            <div class="input-group">
                            <input class="input--style-1" type="text" placeholder="Cargo" name="cargo">
                        </div>
                        </div>
                        <div class="col-2">
                        <div class="input-group">
                            <input class="input--style-1" type="text" placeholder="Usuario" name="usuario">
                        </div>
                        </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <input class="input--style-1" type="text" placeholder="Contraseña" name="pass">
                                </div>
                            </div>
                        <div class="p-t-20">
                            <button class="btn btn--radius btn--green" type="submit">Registrarse</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <script src="vendor/jquery/jquery.min.js"></script>

    <script src="vendor/select2/select2.min.js"></script>
    <script src="vendor/datepicker/moment.min.js"></script>
    <script src="vendor/datepicker/daterangepicker.js"></script>

    <script src="js/global.js"></script>

</body>
</html>
