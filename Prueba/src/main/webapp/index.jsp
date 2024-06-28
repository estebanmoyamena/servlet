<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Formulario prueba con pico CSS </title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@picocss/pico@2/css/pico.min.css"/>
</head>
<body>
    <h1><%= "Formulario prueba con pico CSS" %>
    </h1>
    <br/>
    <a href="hello-servlet">Regístrate:</a>

    <form action="login" method="get">
        <fieldset>
            <label>
                Nombre de Usuario
                <input name="user" placeholder="ej: Carmona666"/>
            </label>

            <label>
                Nombre
                <input name="name" placeholder="ej: Francisco"/>
            </label>

            <label>
                Apellido
                <input name="lastName" placeholder="ej: Carmona"/>
            </label>

            <label>
                Email
                <input type="email" name="email" placeholder="ej: FCarmona@correo.com"/>
            </label>
        </fieldset>

        <input
            type="submit"
            value="¡Regístrate ya!"
        />
    </form>

</body>
</html>