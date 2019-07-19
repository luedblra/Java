<%-- 
    Document   : index
    Created on : 19/07/2019, 06:45:07 AM
    Author     : luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Files</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h3>Archivos:</h3>
        Selecciona Archivo: <br />
        <form action = "UploadFile.jsp" method = "post"
         enctype = "multipart/form-data">
         <input type = "file" name = "file" size = "50" />
         <br />
         <input type = "submit" value = "Subir" />
      </form>
    </body>
</html>
