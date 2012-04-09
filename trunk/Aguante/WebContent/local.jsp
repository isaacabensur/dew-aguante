<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Red social para alquiler de canchas de futbol</title>
<link href="styles/estilos.css" rel="stylesheet" type="text/css" />
 <script type="text/javascript" src="js/validacionesJS.js"></script>
</head>

<body>
<div id="contenedorPrincipal">
  <div id="cabecera">
    <div id="logo"><a href="index.jsp"><img src="imagenes/logo.jpg" alt="Futbol Camp" width="167" height="120" border="0" /></a></div>
</div>
  <div id="barraSuperior">
    
  </div>
<div id="cuerpo">
    <h3>Registro de local</h3><form name="registrarLocal" action="LocalServlet" method="post" onsubmit="return validarLocal();">
      <table width="100%" border="0" cellspacing="0" cellpadding="3">
        <tr>
          <td width="29%" align="right" valign="middle"><label for="desLoc">Nombre de local</label></td>
          <td width="71%">
          <input type="text" name="desLoc" id="desLoc" /></td>
        </tr>
        <tr>
          <td align="right" valign="middle"><label for="direccion">Dirección</label></td>
          <td>
          <input type="text" name="direccion" id="direccion" /></td>
        </tr>
        <tr>
          <td align="right" valign="middle"><label for="distrito">Distrito</label></td>
          <td><label for="distrito"></label>
            <select name="distrito" id="distrito">
              <option selected="selected" value="">Seleccionar</option>
             <option value="Ancón">Ancón</option>
<option value="Ate">Ate</option>
<option value="Barranco">Barranco</option>
<option value="Bellavista">Bellavista</option>
<option value="Breña">Breña</option>
<option value="Callao">Callao</option>
<option value="Carabayllo">Carabayllo</option>
<option value="Carmen de la Legua ">Carmen de la Legua </option>
<option value="Cercado de Lima">Cercado de Lima</option>
<option value="Chaclacayo">Chaclacayo</option>
<option value="Chorrillos">Chorrillos</option>
<option value="Cieneguilla">Cieneguilla</option>
<option value="Comas">Comas</option>
<option value="El Agustino">El Agustino</option>
<option value="Independencia ">Independencia </option>
<option value="Jesús María">Jesús María</option>
<option value="La Molina ">La Molina</option>
<option value="La Perla">La Perla</option>
<option value="La Punta">La Punta</option>
<option value="La Victoria">La Victoria</option>
<option value="Lince">Lince</option>
<option value="Los Olivos">Los Olivos</option>
<option value="Lurigancho">Lurigancho</option>
<option value="Lurín">Lurín</option>
<option value="Magdalena del Mar">Magdalena del Mar</option>
<option value="Miraflores">Miraflores</option>
<option value="Pachacamac">Pachacamac</option>
<option value="Pucusana">Pucusana</option>
<option value="Pueblo Libre ">Pueblo Libre </option>
<option value="Puente Piedra">Puente Piedra</option>
<option value="Punta Hermosa">Punta Hermosa</option>
<option value="Punta Negra">Punta Negra</option>
<option value="Rímac">Rímac</option>
<option value="San Bartolo">San Bartolo</option>
<option value="San Borja">San Borja</option>
<option value="San Isidro">San Isidro</option>
<option value="San Juan de Lurigancho">San Juan de Lurigancho</option>
<option value="San Juan de Miraflores">San Juan de Miraflores</option>
<option value="San Luis">San Luis</option>
<option value="San Martín de Porres">San Martín de Porres</option>
<option value="San Miguel">San Miguel</option>
<option value="Santa Anita">Santa Anita</option>
<option value="Santa M. del Mar">Santa M. del Mar</option>
<option value="Santa Rosa">Santa Rosa</option>
<option value="Santiago de Surco">Santiago de Surco</option>
<option value="Surquillo">Surquillo</option>
<option value="Ventanilla">Ventanilla</option>
<option value="Villa El Salvador">Villa El Salvador</option>
<option value="Villa María del triunfo">Villa María del triunfo</option>

          </select></td>
        </tr>
        <tr>
          <td align="right" valign="middle"><label for="dicGoogle">Dirección de Google</label></td>
          <td>
          <input type="text" name="dicGoogle" id="dicGoogle" /></td>
        </tr>
        <tr>
          <td align="right" valign="middle"><label for="telefonoFijo">Teléfono fijo</label></td>
          <td><input type="text" name="telefonoFijo" id="telefonoFijo" /></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><br />            <input type="submit" name="registrar" id="registrar" value="Regístra tu local" /></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
      </table>
    
    
    
    </form>
  </div></div><div id="piecera">Futbol Camp tiene todos los derechos ® reservados  </div>
</body>
</html>
