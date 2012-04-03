<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Red social para alquiler de canchas de futbol</title>
<link href="styles/estilos.css" rel="stylesheet" type="text/css" />

 <script>
       function validar(){
        
		 
		 
		  if (document.f1.distrito.value == ""){
           
				alert("Ingresa el distrito");
          		document.f1.distrito.focus();
    		   
		    return false;
         }	

		  if (document.f1.diasAtencion.value == ""){
           
				alert("Ingresa tus nombres");
          		document.f1.nombres.focus();
    		   
		    return false;
         }
		 
		 if (document.f1.paterno.value == ""){
           
				alert("Ingresa tu apellido paterno");
          		document.f1.paterno.focus();
    		   
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
    <h3>Alquiler de cancha</h3>
    
    <form action="" method="get">
      <table width="100%" border="0" cellspacing="0" cellpadding="3">
        <tr>
          <td width="29%" align="right" valign="middle"><label for="distrito">Distrito</label></td>
          <td width="71%"><select name="distrito" id="distrito">
            <option selected="selected">Seleccionar</option>
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
            <option value="La Molina ">La Molina </option>
            <option value="La Perla       ">La Perla </option>
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
          <td align="right" valign="middle"><label for="fecha">Día de atención</label></td>
          <td><select name="dia" id="dia">
            <option selected="selected" value="">Día</option>
            <option value="1" >1</option>
            <option value="2" >2</option>
            <option value="3" >3</option>
            <option value="4" >4</option>
            <option value="5" >5</option>
            <option value="6" >6</option>
            <option value="7" >7</option>
            <option value="8" >8</option>
            <option value="9" >9</option>
            <option value="10" >10</option>
            <option value="11" >11</option>
            <option value="12" >12</option>
            <option value="13" >13</option>
            <option value="14" >14</option>
            <option value="15" >15</option>
            <option value="16" >16</option>
            <option value="17" >17</option>
            <option value="18" >18</option>
            <option value="19" >19</option>
            <option value="20" >20</option>
            <option value="21" >21</option>
            <option value="22" >22</option>
            <option value="23" >23</option>
            <option value="24" >24</option>
            <option value="25" >25</option>
            <option value="26" >26</option>
            <option value="27" >27</option>
            <option value="28" >28</option>
            <option value="29" >29</option>
            <option value="30" >30</option>
            <option value="31" >31</option>
          </select>
            <select name="mes" id="mes">
              <option selected="selected" value="">Mes</option>
              <option value="Enero" >Enero</option>
              <option value="Febrero" >Febrero</option>
              <option value="Marzo" >Marzo</option>
              <option value="Abril" >Abril</option>
              <option value="Mayo" >Mayo</option>
              <option value="Junio" >Junio</option>
              <option value="Julio" >Julio</option>
              <option value="Agosto" >Agosto</option>
              <option value="Septiembre" >Septiembre</option>
              <option value="Octubre" >Octubre</option>
              <option value="Noviembre" >Noviembre</option>
              <option value="Diciembre" >Diciembre</option>
            </select>
            <select name="año" id="año">
              <option selected="selected" value="">Año</option>
         <option value="2013" >2013</option>
  

              <option value="2012" >2012</option>
     
          </select></td>
        </tr>
        <tr>
          <td align="right" valign="middle"><label for="horasAtencion">Horas de atención</label></td>
          <td>
            <select name="horasAtencion" id="horasAtencion">
              <option selected="selected" value="">Seleccionar</option>
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

          </select></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><br />            <input type="submit" name="buscar" id="buscar" value="Buscar cancha" /></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
      </table>
    
    
    
    </form>
    
    <table border="0" cellspacing="0" cellpadding="0" class="resultadosTabla">
  <tr>
    <th scope="col">Nombre de la cancha</th>
    <th scope="col">Características</th>
    <th scope="col">Dias de atención</th>
    <th scope="col">Horas de atención</th>
    <th scope="col">Tarifa</th>
    <th scope="col">Local</th>
    <th scope="col">Distrito</th>
    <th scope="col">Disponibilidad</th>

  </tr>
  <tr>
    <td><a href="teofilo.html">Teófilo &quot;Nene&quot; Cubillas</a></td>
    <td>Pasto sintético, futbol 6</td>
    <td>31/02/12</td>
    <td>07:00 a 08:00</td>
    <td>60</td>
    <td>Leyendas peruanas</td>
    <td>San Miguel</td>
    <td><input type="submit" name="Alquilar" id="Alquilar" value="Alquilar"  /></td>
  </tr>
  <tr>
    <td><a href="#">César Cueto</a></td>
    <td>Pasto natural, fútbol 7</td>
    <td>31/02/12</td>
    <td>18:00 a 19:00</td>
    <td>90</td>
    <td>Leyendas peruanas</td>
    <td>San Miguel</td>
    <td><input type="submit" name="Alquilar" id="Alquilar2" value="Alquilar" disabled="disabled"/></td>
  </tr>
  </table>

</div></div><div id="piecera">Futbol Camp tiene todos los derechos ® reservados  </div>
</body>
</html>