<#macro page_head>
<tittle>Base Template</tittle>
<link rel="stylesheet" href="/css/default.css">
</#macro>

<#macro page_content>
<h1>Basic Page</h1>
<p>This is the body of the page!</p>
</#macro>


<#macro display_page>
<!DOCTYPE html>
<html>
<head>
<@page_head/>
</head>
<body>
<div id=header>
<img src="http://www.freeliquidtemplates.com/free-headers-for-websites/header11.jpg">
</div>
<div id=content>
<@page_content/>
</div>
<div id=footer>
<p>Pagina creada por aikrana.94@gmail.com
</div>
</body>
</html>
</#macro>
