<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page import="fulbito.model.Persona"%>
<%@page import="fulbito.business.InsertarLocal"%>
<%@page import="fulbito.business.InsertarCancha,java.util.*" %>
<%@page import="fulbito.model.Local"%>
<%@page import="fulbito.model.Cancha"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Red social para alquiler de canchas de futbol</title>
<link href="styles/estilos.css" rel="stylesheet" type="text/css" />
<%
	HttpSession sesion = request.getSession();
	Persona vo = (Persona)sesion.getAttribute("USUARIO_ACTUAL");
	int codPersona = vo.getCodPer();
	InsertarLocal neg = new InsertarLocal();
	Collection<Local> lstLocal=neg.buscarPorPersona(codPersona);
	request.setAttribute("Listadolocales",lstLocal);
	/*InsertarCancha neg = new InsertarCancha();
    Collection<Local> lstLocal = new ArrayList<Local>();
    lstLocal=neg.ListarLocal();
    request.setAttribute("Listadolocales",lstLocal);*/
    %>
    <script type="text/javascript"> 
    function ValidarRegistroCancha(){
		if (document.f1.local.value == "") {
			alert("Selecciona el local");
			document.f1.local.focus();
			return false;
		}
		if (document.f1.nombre.value == "") {
			alert("Ingresa el nombre de la cancha");
			document.f1.nombre.focus();
			return false;
		}
		if (document.f1.caracteristicas.value == "") {
			alert("Ingresa las caracter�sticas");
			document.f1.caracteristicas.focus();
			return false;
		}
		if (document.f1.diasAtencion.value == "") {
			alert("Ingresa los d�as de atenci�n");
			document.f1.diasAtencion.focus();
			return false;
		}
		if (document.f1.horasAtencion.value == "") {
			alert("Ingresa las horas de atenci�n");
			document.f1.horasAtencion.focus();
			return false;
		}
		if (document.f1.tarifaDiurna.value == "") {
			alert("Ingresa la tarifa diurna");
			document.f1.tarifaDiurna.focus();
			return false;
		}
		if (document.f1.tarifaNocturna.value == "") {
			alert("Ingresa la tarifa nocturna");
			document.f1.tarifaNocturna.focus();
			return false;
		}
		return true;
	}
    </script>
</head>
<body>
<div id="contenedorPrincipal">
  <div id="cabecera">
    <div id="logo"><a href="index.html"><img src="imagenes/logo.jpg" alt="Futbol Camp" width="167" height="120" border="0" /></a></div>
</div>
  <div id="barraSuperior">
    
  </div>
<div id="cuerpo">
    <h3>Registro de cancha</h3>
	
    <form name="f1" action="RegistroCanchaServlet" method="post" onSubmit="return ValidarRegistroCancha();">
      <table width="100%" border="0" cellspacing="0" cellpadding="3">
      
      <tr>
          <td width="29%" align="right" valign="middle"><label for="local">Local</label></td>
          <td width="71%">
            
            

<select name="local" id="local">
   <option value="">Seleccionar</option>
    <% 
            Collection<Local> locales = (ArrayList<Local>)request.getAttribute("Listadolocales");
            for(Local x: locales) {
            %>
    <option value="<%=x.getCodLoc()%>"><%=x.getDesLoc()%></option>
    <%}%>
    </select>

</td>
        </tr>
        <tr>
          <td width="29%" align="right" valign="middle"><label for="nombre">Nombre de cancha</label></td>
          <td width="71%">
          <input type="text" name="nombre" id="nombre" /></td>
        </tr>
        <tr>
          <td align="right" valign="middle"><label for="caracteristicas">Caracter&iacute;sticas</label></td>
          <td>
          <input type="text" name="caracteristicas" id="caracteristicas" /></td>
        </tr>
        <tr>
          <td align="right" valign="middle"><label for="diasAtencion">Dias de atenci&oacute;n</label></td>
          <td>
            <select name="diasAtencion" id="diasAtencion">
              <option selected="selected">Seleccionar</option>
              <option value="LUN">Lunes</option>
              <option value="MAR">Martes</option>
              <option value="MIE">Miercoles</option>
              <option value="JUE">Jueves</option>
              <option value="VIE">Viernes</option>
              <option value="SAB">S&aacute;bado</option>
              <option value="DOM">Domingo</option>
          </select></td>
        </tr>
        <tr>
          <td align="right" valign="middle"><label for="horasAtencion">Horas de atenci&oacute;n</label></td>
          <td>
            <select name="horasAtencion" id="horasAtencion">
				<option selected="selected">Seleccionar</option>
				<option value="06:00-07:00">06:00-07:00</option>
				<option value="07:00-08:00">07:00-08:00</option>
				<option value="08:00-09:00">08:00-09:00</option>
				<option value="09:00-10:00">09:00-10:00</option>
				<option value="10:00-11:00">10:00-11:00</option>
				<option value="11:00-12:00">11:00-12:00</option>
				<option value="12:00-13:00">12:00-13:00</option>
				<option value="13:00-14:00">13:00-14:00</option>
				<option value="14:00-15:00">14:00-15:00</option>
				<option value="15:00-16:00">15:00-16:00</option>
				<option value="16:00-17:00">16:00-17:00</option>
				<option value="17:00-18:00">17:00-18:00</option>
				<option value="18:00-19:00">18:00-19:00</option>
				<option value="19:00-20:00">19:00-20:00</option>
				<option value="20:00-21:00">20:00-21:00</option>
				<option value="21:00:22:00">21:00:22:00</option>
				<option value="22:00:23:00">22:00:23:00</option>
          </select></td>
        </tr>
        <tr>
          <td align="right" valign="middle"><label for="tarifaDiurna">Tarifa diurna</label></td>
          <td>
          <input type="text" name="tarifaDiurna" id="tarifaDiurna" /></td>
        </tr>
        <tr>
          <td align="right" valign="middle"><label for="tarifaNocturna">Tarifa nocturna</label></td>
          <td><input type="text" name="tarifaNocturna" id="tarifaNocturna" /></td>
        </tr>
        <tr>
          <td align="right" valign="middle"> <label for="promo">Promoci&oacute;n especial</label></td>
          <td><input type="text" name="promo" id="promo" /></td>
        </tr>
        <tr>
			<td align="right" valign="middle"><label for="foto">Foto</label></td>
			<td><input type="text" name="foto" id="foto" /></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><br />            <input type="submit" name="registrar" id="registrar" value="Regístra tu cancha" /></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
      </table>
    
    </form>
  </div></div><div id="piecera">Futbol Camp tiene todos los derechos &reg; reservados  </div>
</body>
</html>
