<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css" type="text/css" />
    </head>
    <body>
        <body>

            <div class="container">

                <div class="signup-form-container">
    
                    <!-- form start -->
                <form action="RegistoServlet" role="form" id="register-form" autocomplete="off">
         
                <div class="form-header">
                    <h3 class="form-title"><i class="fa fa-user"></i> Sign Up</h3>
                      
                <div class="pull-right">
                    <h3 class="form-title"><span class="glyphicon glyphicon-pencil"></span></h3>
                </div>
                      
                </div>
         
                <div class="form-body">
                      
                <div class="form-group">
                   <div class="input-group">
                   <div class="input-group-addon"><span class="glyphicon glyphicon-user"></span></div>
                   <input name="name" type="text" class="form-control" placeholder="Nombre de usuario">
                   </div>
                   <span class="help-block" id="error"></span>
                </div>
                        
                <div class="row">
                        
                   <div class="form-group col-lg-6">
                        <div class="input-group">
                        <div class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></div>
                        <input name="password" id="password" type="password" class="form-control" placeholder="Contraseña">
                        </div>  
                        <span class="help-block" id="error"></span>                    
                   </div>
                            
                   <div class="form-group col-lg-6">
                        <div class="input-group">
                        <div class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></div>
                        <input name="cpassword" type="password" class="form-control" placeholder="Reingrese contraseña">
                        </div>  
                        <span class="help-block" id="error"></span>                    
                   </div>
                            
             </div>
                        
                        
            </div>
            
            <div class="form-footer">
                 <button type="submit" class="btn btn-info">
                 <span class="glyphicon glyphicon-log-in"></span> Sign Me Up !
                 </button>
            </div>


            </form>
            
           </div>

        </div>
<script src="bootstrap/js/bootstrap.min.js"></script>
<script src="assets/jquery-1.11.2.min.js"></script>
<script src="assets/jquery.validate.min.js"></script>
        
        </body>
</html>
