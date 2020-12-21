<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Menu</title>

        <link href="vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
        <link href="vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
        <link href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i" rel="stylesheet">

        <link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
        <link href="vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

        <link href="css/Registro.css" rel="stylesheet" media="all">
    </head>
    <body>
        <%
            HttpSession miSesion = request.getSession();
            String usu = (String) request.getSession().getAttribute("usuario");
            if (usu == null) {
                response.sendRedirect("loginError.jsp");
            } else {
        %>    

        <div class="page-wrapper bg-blue p-t-100 p-b-100 font-robo">
            <div class="wrapper wrapper--w680">
                <div class="card card-1">
                    <div class="card-heading"></div>
                    <div class="card-body">
                        <h2 class="title">Menu de usuario</h2>
                        <form>
                            <div class="row row-space">
                                <div class="col-2">
                                    <div class="dropdown">
                                        <button class="btn btn--radius btn--green" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                            Clientes
                                        </button>
                                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                                            <a class="dropdown-item" href="clientesAlta.jsp">Alta</a>
                                            <a class="dropdown-item" href="clientesBaja.jsp">Baja</a>
                                            <a class="dropdown-item" href="clientesEdit.jsp">Editar</a>
                                            <a class="dropdown-item" href="clientesbuscar.jsp">Buscar</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="dropdown">
                                    <button class="btn btn--radius btn--green" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        Horarios
                                    </button>
                                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                                        <a class="dropdown-item" href="horariosAlta.jsp">Alta</a>
                                        <a class="dropdown-item" href="horariosBaja.jsp">Baja</a>
                                        <a class="dropdown-item" href="horariosEdit.jsp">Editar</a>
                                        <a class="dropdown-item" href="horariosBuscar.jsp">Buscar</a>
                                    </div>
                                </div>
                            </div>
                            <div class="col-2">
                                 <div class="dropdown">
                                    <button class="btn btn--radius btn--green" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        Juegos
                                    </button>
                                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                                        <a class="dropdown-item" href="juegosAlta.jsp">Alta</a>
                                        <a class="dropdown-item" href="juegosBaja.jsp">Baja</a>
                                        <a class="dropdown-item" href="juegosEdit.jsp">Editar</a>
                                        <a class="dropdown-item" href="juegosBuscar.jsp">Buscar</a>
                                    </div>
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="dropdown">
                                    <button class="btn btn--radius btn--green" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        Empleados
                                    </button>
                                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                                        <a class="dropdown-item" href="empleados.jsp">Alta</a>
                                        <a class="dropdown-item" href="empleadosBaja.jsp">Baja</a>
                                        <a class="dropdown-item" href="empleadosEdit.jsp">Editar</a>
                                        <a class="dropdown-item" href="empleadosBuscar.jsp">Buscar</a>
                                    </div>
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="dropdown">
                                    <button class="btn btn--radius btn--green" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        Ventas
                                    </button>
                                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                                        <a class="dropdown-item" href="ventas.jsp">Alta</a>
                                        <a class="dropdown-item" href="ventasBaja.jsp">Baja</a>
                                        <a class="dropdown-item" href="ventasEdit.jsp">Editar</a>
                                        <a class="dropdown-item" href="ventasBuscar.jsp">Buscar</a>
                                    </div>
                                </div>
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

        <%
            }
        %>
    </body>
</html>
