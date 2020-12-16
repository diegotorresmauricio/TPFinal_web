<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema Gestor Parque de Diversiones</title>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css" type="text/css" />
    </head>
    <body>
        <main role="main" class="container my-auto">
            <div class="row">
                <div id="login" class="col-lg-4 offset-lg-4 col-md-6 offset-md-3
                    col-12">
                    <h2 class="text-center">Bienvenido Usuario</h2>
                    <img class="img-fluid mx-auto d-block rounded"
                        src="https://picsum.photos/id/870/300/200" />

                    <form>
                        <div class="form-group">
                            <label for="Usuario">Usuario</label>
                            <input id="Usuario" name="Usuario"
                                class="form-control" type="user"
                                placeholder="Usuario">
                        </div>
                        <div class="form-group">
                            <label for="palabraSecreta">Contraseña</label>
                            <input id="palabraSecreta" name="palabraSecreta"
                                class="form-control" type="password"
                                placeholder="Contraseña">
                        </div>
                        <button type="submit" class="btn btn-primary mb-2">
                            Entrar
                        </button>
                        <br>
                        <a href="Registro.jsp">Registro</a>
                    </form>
                </div>
            </div>
        </main>
    </body>
</html>
