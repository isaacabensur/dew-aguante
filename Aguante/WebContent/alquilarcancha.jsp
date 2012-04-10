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
            <option value="ANC">Anc&oacute;n</option>
            <option value="ATE">Ate</option>
            <option value="BAR">Barranco</option>
            <option value="BEL">Bellavista</option>
            <option value="BRE">Bre&ntilde;a</option>
            <option value="CAL">Callao</option>
            <option value="CAR">Carabayllo</option>
            <option value="CLE">Carmen de la Legua</option>
            <option value="CLI">Cercado de Lima</option>
            <option value="CHA">Chaclacayo</option>
            <option value="CHO">Chorrillos</option>
            <option value="CIE">Cieneguilla</option>
            <option value="COM">Comas</option>
            <option value="EAG">El Agustino</option>
            <option value="IND">Independencia </option>
            <option value="JEM">Jes&uacute;s Mar&iacute;a</option>
            <option value="LMO">La Molina</option>
            <option value="LPE">La Perla</option>
            <option value="LPU">La Punta</option>
            <option value="LVI">La Victoria</option>
            <option value="LIN">Lince</option>
            <option value="LOL">Los Olivos</option>
            <option value="LUI">Lurigancho</option>
            <option value="LUR">Lur&iacute;n</option>
            <option value="MMA">Magdalena del Mar</option>
            <option value="MIR">Miraflores</option>
            <option value="PAC">Pachacamac</option>
            <option value="PUC">Pucusana</option>
            <option value="PLI">Pueblo Libre</option>
            <option value="PPI">Puente Piedra</option>
            <option value="PHE">Punta Hermosa</option>
            <option value="PNE">Punta Negra</option>
            <option value="RIM">R&iacute;mac</option>
            <option value="SBA">San Bartolo</option>
            <option value="SBO">San Borja</option>
            <option value="SIS">San Isidro</option>
            <option value="SJL">San Juan de Lurigancho</option>
            <option value="SJM">San Juan de Miraflores</option>
            <option value="SLU">San Luis</option>
            <option value="SMP">San Mart&oacute;n de Porres</option>
            <option value="SMI">San Miguel</option>
            <option value="SAN">Santa Anita</option>
            <option value="SMM">Santa M. del Mar</option>
            <option value="SRO">Santa Rosa</option>
            <option value="SSU">Santiago de Surco</option>
            <option value="SUR">Surquillo</option>
            <option value="VEN">Ventanilla</option>
            <option value="VES">Villa El Salvador</option>
            <option value="VMT">Villa Mar&iacute;a del Triunfo</option>
          </select></td>
        </tr>
        <tr>
          <td align="right" valign="middle"><label for="fecha">D&iacute;a de atenci&oacute;n</label></td>
          <td><select name="dia" id="dia">
            <option selected="selected" value="">D&iacute;a</option>
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
				<option value="01" >Enero</option>
				<option value="02" >Febrero</option>
				<option value="03" >Marzo</option>
				<option value="04" >Abril</option>
				<option value="05" >Mayo</option>
				<option value="06" >Junio</option>
				<option value="07" >Julio</option>
				<option value="08" >Agosto</option>
				<option value="09" >Septiembre</option>
				<option value="10" >Octubre</option>
				<option value="11" >Noviembre</option>
				<option value="12" >Diciembre</option>
            </select>
            <select name="anio" id="anio">
				<option selected="selected" value="">A&ntilde;o</option>
				<option value="2013" >2013</option>
				<option value="2012" >2012</option>
			</select>
		</td>
        </tr>
        <tr>
          <td align="right" valign="middle"><label for="horasAtencion">Horas de atenci&oacute;n</label></td>
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
				<option value="22:00:23:00">22:00:23:00</option>
          </select></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><br/>            <input type="submit" name="buscar" id="buscar" value="Buscar cancha" /></td>
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
    <th scope="col">Caracter&iacute;sticas</th>
    <th scope="col">Dias de atenci&oacute;n</th>
    <th scope="col">Horas de atenci&oacute;n</th>
    <th scope="col">Tarifa</th>
    <th scope="col">Local</th>
    <th scope="col">Distrito</th>
    <th scope="col">Disponibilidad</th>

  </tr>
  <tr>
    <td><a href="teofilo.html">Te&oacute;filo &quot;Nene&quot; Cubillas</a></td>
    <td>Pasto sint&eacute;tico, futbol 6</td>
    <td>31/02/12</td>
    <td>07:00 a 08:00</td>
    <td>60</td>
    <td>Leyendas peruanas</td>
    <td>San Miguel</td>
    <td><input type="submit" name="Alquilar" id="Alquilar" value="Alquilar"  /></td>
  </tr>
  <tr>
    <td><a href="#">C&eacute;sar Cueto</a></td>
    <td>Pasto natural, f&uacute;tbol 7</td>
    <td>31/02/12</td>
    <td>18:00 a 19:00</td>
    <td>90</td>
    <td>Leyendas peruanas</td>
    <td>San Miguel</td>
    <td><input type="submit" name="Alquilar" id="Alquilar2" value="Alquilar" disabled="disabled"/></td>
  </tr>
  </table>

</div></div><div id="piecera">Futbol Camp tiene todos los derechos &reg; reservados </div>
</body>
</html>