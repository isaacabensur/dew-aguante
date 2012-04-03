<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Red social para alquiler de canchas de futbol</title>
    <link href="styles/estilos.css" rel="stylesheet" type="text/css" />
    <script>
       function validar(){
        
		 
		 
		  if (document.f1.tipoPer.value == ""){
           
				alert("Ingresa el tipo de persona");
          		document.f1.tipoPer.focus();
    		   
		    return false;
         }	

		  if (document.f1.nombres.value == ""){
           
				alert("Ingresa tus nombres");
          		document.f1.nombres.focus();
    		   
		    return false;
         }
		 
		 if (document.f1.paterno.value == ""){
           
				alert("Ingresa tu apellido paterno");
          		document.f1.paterno.focus();
    		   
		    return false;
         }
		 if (document.f1.materno.value == ""){
           
				alert("Ingresa tu apellido materno");
          		document.f1.materno.focus();
    		   
		    return false;
         }
		 
		 if (document.f1.sexo.value == ""){
           
				alert("Ingresa tu sexo");
          		document.f1.sexo.focus();
    		   
		    return false;
         }
		 
		 if (document.f1.tipoDoc.value == ""){
           
				alert("Ingresa tu tipo de documento");
          		document.f1.tipoDoc.focus();
    		   
		    return false;
         }
		 if (document.f1.numDoc.value == ""){
           
				alert("Ingresa tu número de documento");
          		document.f1.numDoc.focus();
    		   
		    return false;
         }
		 if (document.f1.correo.value == ""){
           
				alert("Ingresa tu correo electrónico");
          		document.f1.correo.focus();
    		   
		    return false;
         }	
		 if (document.f1.correoconf.value == ""){
           
				alert("Confirma tu correo electrónico");
          		document.f1.correoconf.focus();
    		   
		    return false;
         }
		 
		 if (document.f1.password.value == ""){
           
				alert("Ingresa tu contraseña");
          		document.f1.password.focus();
    		   
		    return false;
         }
		 if (document.f1.passwordconf.value == ""){
           
				alert("Confirma tu contraseña");
          		document.f1.passwordconf.focus();
    		   
		    return false;
         }
		 
		 if (document.f1.dia.value == ""){
           
				alert("Ingresar el dia de tu nacimiento");
          		document.f1.dia.focus();
    		   
		    return false;
         }
		 
		 if (document.f1.mes.value == ""){
           
				alert("Ingresar el mes de tu nacimiento");
          		document.f1.mes.focus();
    		   
		    return false;
         }
		 if (document.f1.año.value == ""){
           
				alert("Ingresa el año de tu nacimiento");
          		document.f1.año.focus();
    		   
		    return false;
         }
		 
		 if (document.f1.celular.value == ""){
           
				alert("Ingresa tu celular");
          		document.f1.celular.focus();
    		   
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
      <div id="barraSuperior"> </div>
      <div id="cuerpo">
        <h3>Registro de usuario</h3>
        <form name="f1" action="" method="post" onSubmit="return validar();">
          <table width="100%" border="0" cellspacing="0" cellpadding="3">
            <tr>
              <td width="29%" align="right" valign="middle"><label for="tipoPer" id="tipoPerlabel">Tipo  de persona</label></td>
              <td width="71%"><select name="tipoPer" id="tipoPer">
                  <option value="">Seleccionar</option>
                  <option value="dueno">Dueño</option>
                  <option value="cliente">Cliente</option>
                </select></td>
            </tr>
            <tr>
              <td align="right" valign="middle"><label for="nombres" id="nombreslabel">Nombres</label></td>
              <td><input type="text" name="nombres" id="nombres" /></td>
            </tr>
            <tr>
              <td align="right" valign="middle"><label for="paterno">Apellido paterno</label></td>
              <td><input type="text" name="paterno" id="paterno" /></td>
            </tr>
            <tr>
              <td align="right" valign="middle"><label for="materno">Apellido materno</label></td>
              <td><input type="text" name="materno" id="materno" /></td>
            </tr>
            <tr>
              <td align="right" valign="middle"><label for="sexo">Sexo</label></td>
              <td><select name="sexo" id="sexo">
                  <option value="">Seleccionar</option>
                  <option value="m">Masculino</option>
                  <option value="f">Femenino</option>
                </select></td>
            </tr>
            <tr>
              <td align="right" valign="middle"><label for="tipoDoc">Tipo de documento de identidad</label></td>
              <td><select name="tipoDoc" id="tipoDoc">
                  <option value="">Seleccionar</option>
                  <option value="dni">D.N.I.</option>
                  <option value="ce">C.E.</option>
                </select></td>
            </tr>
            <tr>
              <td align="right" valign="middle"><label for="numDoc">Número de documento de identidad</label></td>
              <td><input type="text" name="numDoc" id="numDoc" /></td>
            </tr>
            <tr>
              <td align="right" valign="top"><label for="correo"><br />
                  Correo electrónico</label></td>
              <td><input type="text" name="correo" id="correo" />
                <br />
                <label for="correoconf">Confirme su correo</label>
                <br />
                <input type="text" name="correoconf" id="correoconf" /></td>
            </tr>
            <tr>
              <td align="right" valign="top"><label for="password"><br />
                  Contraseña</label></td>
              <td><input type="password" name="password" id="password" />
                <br />
                <label for="passwordconf"> Confirme su contraseña</label>
                <br />
                <input type="password" name="passwordconf" id="passwordconf" /></td>
            </tr>
            <tr>
              <td align="right" valign="middle"><label for="fecha">Fecha de Nacimiento</label></td>
              <td><select name="Día" id="dia">
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
                  <option value="2012" >2012</option>
                  <option value="2011" >2011</option>
                  <option value="2010" >2010</option>
                  <option value="2009" >2009</option>
                  <option value="2008" >2008</option>
                  <option value="2007" >2007</option>
                  <option value="2006" >2006</option>
                  <option value="2005" >2005</option>
                  <option value="2004" >2004</option>
                  <option value="2003" >2003</option>
                  <option value="2002" >2002</option>
                  <option value="2001" >2001</option>
                  <option value="2000" >2000</option>
                  <option value="1999" >1999</option>
                  <option value="1998" >1998</option>
                  <option value="1997" >1997</option>
                  <option value="1996" >1996</option>
                  <option value="1995" >1995</option>
                  <option value="1994" >1994</option>
                  <option value="1993" >1993</option>
                  <option value="1992" >1992</option>
                  <option value="1991" >1991</option>
                  <option value="1990" >1990</option>
                  <option value="1989" >1989</option>
                  <option value="1988" >1988</option>
                  <option value="1987" >1987</option>
                  <option value="1986" >1986</option>
                  <option value="1985" >1985</option>
                  <option value="1984" >1984</option>
                  <option value="1983" >1983</option>
                  <option value="1982" >1982</option>
                  <option value="1981" >1981</option>
                  <option value="1980" >1980</option>
                  <option value="1979" >1979</option>
                  <option value="1978" >1978</option>
                  <option value="1977" >1977</option>
                  <option value="1976" >1976</option>
                  <option value="1975" >1975</option>
                  <option value="1974" >1974</option>
                  <option value="1973" >1973</option>
                  <option value="1972" >1972</option>
                  <option value="1971" >1971</option>
                  <option value="1970" >1970</option>
                  <option value="1969" >1969</option>
                  <option value="1968" >1968</option>
                  <option value="1967" >1967</option>
                  <option value="1966" >1966</option>
                  <option value="1965" >1965</option>
                  <option value="1964" >1964</option>
                  <option value="1963" >1963</option>
                  <option value="1962" >1962</option>
                  <option value="1961" >1961</option>
                  <option value="1960" >1960</option>
                  <option value="1959" >1959</option>
                  <option value="1958" >1958</option>
                  <option value="1957" >1957</option>
                  <option value="1956" >1956</option>
                  <option value="1955" >1955</option>
                  <option value="1954" >1954</option>
                  <option value="1953" >1953</option>
                  <option value="1952" >1952</option>
                  <option value="1951" >1951</option>
                  <option value="1950" >1950</option>
                  <option value="1949" >1949</option>
                  <option value="1948" >1948</option>
                  <option value="1947" >1947</option>
                  <option value="1946" >1946</option>
                  <option value="1945" >1945</option>
                  <option value="1944" >1944</option>
                  <option value="1943" >1943</option>
                  <option value="1942" >1942</option>
                  <option value="1941" >1941</option>
                  <option value="1940" >1940</option>
                  <option value="1939" >1939</option>
                  <option value="1938" >1938</option>
                  <option value="1937" >1937</option>
                  <option value="1936" >1936</option>
                  <option value="1935" >1935</option>
                  <option value="1934" >1934</option>
                  <option value="1933" >1933</option>
                  <option value="1932" >1932</option>
                  <option value="1931" >1931</option>
                  <option value="1930" >1930</option>
                  <option value="1929" >1929</option>
                  <option value="1928" >1928</option>
                  <option value="1927" >1927</option>
                  <option value="1926" >1926</option>
                  <option value="1925" >1925</option>
                  <option value="1924" >1924</option>
                  <option value="1923" >1923</option>
                  <option value="1922" >1922</option>
                  <option value="1921" >1921</option>
                  <option value="1920" >1920</option>
                  <option value="1919" >1919</option>
                  <option value="1918" >1918</option>
                  <option value="1917" >1917</option>
                  <option value="1916" >1916</option>
                  <option value="1915" >1915</option>
                  <option value="1914" >1914</option>
                  <option value="1913" >1913</option>
                  <option value="1912" >1912</option>
                  <option value="1911" >1911</option>
                  <option value="1910" >1910</option>
                  <option value="1909" >1909</option>
                  <option value="1908" >1908</option>
                  <option value="1907" >1907</option>
                  <option value="1906" >1906</option>
                  <option value="1905" >1905</option>
                </select></td>
            </tr>
            <tr>
              <td align="right" valign="middle"><label for="celular">Número de celular</label></td>
              <td><input type="text" name="celular" id="celular" /></td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td><br />
                <input type="submit" name="registrar" id="registrar" value="Regístrate" /></td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
          </table>
        </form>
      </div>
    </div>
    <div id="piecera">Futbol Camp tiene todos los derechos ® reservados </div>
</body>
</html>