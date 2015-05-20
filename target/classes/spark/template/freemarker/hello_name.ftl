	

<!DOCTYPE html>
<html>
<head>
        <title>Primera página en HTML5</title>
</head>
<body>
        <p>Página dinámica generada por: <em>${name}</em> con freemarker</p>
        <p>numero: <em>${numero}</em>
        <p>Lista de colores</p>
        <ul>
            <#list colores as color>
                <li>${color?upper_case}</li>
            </#list>
        <ul>

</body>
</html>


