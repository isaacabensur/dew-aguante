<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Red social para alquiler de canchas de futbol</title>
<link href="styles/estilos.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div id="contenedorPrincipal">
  <div id="cabecera">
    <div id="logo"><a href="#"><img src="imagenes/logo.jpg" alt="Futbol Camp" width="167" height="120" border="0" /></a></div>
</div><div id="barraSuperior">
    Bienvenido Administrador!
  </div><div id="menuInferior">
  <ul>
    
    <li><a href="#">Usuarios</a></li>
    <li><a href="#">Canchas</a></li>
    <li><a href="#">Alquileres</a></li>
    <li><a href="#">Eventos</a></li>
    <li><a href="publicidad.jsp">Publicidad</a></li>
  </ul>
</div>
  

  
</div><div id="piecera">Futbol Camp tiene todos los derechos  reservados &reg; </div>
<%if(request.getAttribute("MENSAJE") != null) {%>
	<script type="text/javascript" language="javascript">alert("<%=request.getAttribute("MENSAJE")%>");	</script>
<%}%>
</body>
</html>
