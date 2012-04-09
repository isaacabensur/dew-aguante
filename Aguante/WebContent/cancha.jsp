<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page import="fulbito.model.Persona"%>
<%@page import="fulbito.business.InsertarLocal"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Red social para alquiler de canchas de futbol</title>
<link href="styles/estilos.css" rel="stylesheet" type="text/css" />
</head>
<%@page import="fulbito.business.InsertarCancha,java.util.*" %>
<%@page import="fulbito.model.Local"%>
<%@page import="fulbito.model.Cancha"%>



<body>
<div id="contenedorPrincipal">
  <div id="cabecera">
    <div id="logo"><a href="index.html"><img src="imagenes/logo.jpg" alt="Futbol Camp" width="167" height="120" border="0" /></a></div>
</div>
  <div id="barraSuperior">
    
  </div>
<div id="cuerpo">
    <h3>Registro de cancha</h3>
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
    
    <%
     String accion=request.getParameter("accion");
     if (accion==null)
     {
     accion="n";
     }
     if (accion.equals("n"))
     	{
     %>
    <form name="RegistrarCancha" action="ServRegCancha" method="post" onSubmit="return ValidarRegistroCancha();">
      <table width="100%" border="0" cellspacing="0" cellpadding="3">
      
      <tr>
          <td width="29%" align="right" valign="middle"><label for="local">Local</label></td>
          <td width="71%">
            
            

<select name="local" id="local">
   <option value="">Seleccionar</option>
    <c:forEach items="${requestScope.Listadolocales}"  var="p" varStatus="i" >
    <option value=${p.codLocal}>${p.desLoc}</option>
    </c:forEach>
    </select>

</td>
        </tr>
        <tr>
          <td width="29%" align="right" valign="middle"><label for="nombre">Nombre de cancha</label></td>
          <td width="71%">
          <input type="text" name="nombre" id="nombre" /></td>
        </tr>
        <tr>
          <td align="right" valign="middle"><label for="caracteristicas">Características</label></td>
          <td>
          <input type="text" name="caracteristicas" id="caracteristicas" /></td>
        </tr>
        <tr>
          <td align="right" valign="middle"><label for="diasAtencion">Dias de atención</label></td>
          <td>
            <select name="diasAtencion" id="diasAtencion">
              <option selected="selected">Seleccionar</option>
              <option value="l-v">Lunes a Viernes</option>
              <option value="l-s">Lunes a Sábado</option>
              <option value="l-d">Lunes a Domingo</option>
          </select></td>
        </tr>
        <tr>
          <td align="right" valign="middle"><label for="horasAtencion">Horas de atención</label></td>
          <td>
            <select name="horasAtencion" id="horasAtencion">
              <option selected="selected">Seleccionar</option>
              <option value="06:00-17:00">06:00 a 17:00</option>
              <option value="08:00-19:00">08:00 a 19:00</option>
              <option value="09:00-20:00">09:00 a 20:00</option>
              <option value="09:00-22:00">09:00 a 22:00</option>
              <option value="10:00-23:00">10:00 a 23:00</option>
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
          <td align="right" valign="middle"> <label for="promo">Promoción especial</label></td>
          <td><input type="text" name="promo" id="promo" /></td>
        </tr>
        <tr>
          <td align="right" valign="middle"><label for="foto">Foto</label></td>
          <td>
          <input type="text" name="foto" id="foto" /></td>
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
    
     <%
    } 
    else if (accion.equals("u"))
    {
    Cancha objCancha=(Cancha)request.getAttribute("cancha");
    request.setAttribute("codLoc",objCancha.getNumCan());
    
    %>
    
     <%
    }
    %>
  </div></div><div id="piecera">Futbol Camp tiene todos los derechos ® reservados  </div>
</body>
</html>
