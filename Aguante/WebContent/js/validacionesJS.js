
       function validarRegistro(){
        
		 
		 
		  if (document.registrarPersona.tipoPer.value == ""){
           
				alert("Ingresa el tipo de persona");
          		document.registrarPersona.tipoPer.focus();
    		   
		    return false;
         }	

		  if (document.registrarPersona.nombres.value == ""){
           
				alert("Ingresa tus nombres");
          		document.registrarPersona.nombres.focus();
    		   
		    return false;
         }
		 
		 if (document.registrarPersona.paterno.value == ""){
           
				alert("Ingresa tu apellido paterno");
          		document.registrarPersona.paterno.focus();
    		   
		    return false;
         }
		 if (document.registrarPersona.materno.value == ""){
           
				alert("Ingresa tu apellido materno");
          		document.registrarPersona.materno.focus();
    		   
		    return false;
         }
		 
		 if (document.registrarPersona.sexo.value == ""){
           
				alert("Ingresa tu sexo");
          		document.registrarPersona.sexo.focus();
    		   
		    return false;
         }
		 
		 if (document.registrarPersona.tipoDoc.value == ""){
           
				alert("Ingresa tu tipo de documento");
          		document.registrarPersona.tipoDoc.focus();
    		   
		    return false;
         }
		 if (document.registrarPersona.numDoc.value == ""){
           
				alert("Ingresa tu n�mero de documento");
          		document.registrarPersona.numDoc.focus();
    		   
		    return false;
         }
		 if (document.registrarPersona.correo.value == ""){
           
				alert("Ingresa tu correo electr�nico");
          		document.registrarPersona.correo.focus();
    		   
		    return false;
         }	
		 if (document.registrarPersona.correoconf.value == ""){
           
				alert("Confirma tu correo electr�nico");
          		document.registrarPersona.correoconf.focus();
    		   
		    return false;
         }
		 
		 if (document.registrarPersona.password.value == ""){
           
				alert("Ingresa tu contrase�a");
          		document.registrarPersona.password.focus();
    		   
		    return false;
         }
		 if (document.registrarPersona.passwordconf.value == ""){
           
				alert("Confirma tu contrase�a");
          		document.registrarPersona.passwordconf.focus();
    		   
		    return false;
         }
		 
		 if (document.registrarPersona.dia.value == ""){
           
				alert("Ingresar el dia de tu nacimiento");
          		document.registrarPersona.dia.focus();
    		   
		    return false;
         }
		 
		 if (document.registrarPersona.mes.value == ""){
           
				alert("Ingresar el mes de tu nacimiento");
          		document.registrarPersona.mes.focus();
    		   
		    return false;
         }
		 if (document.registrarPersona.anio.value == ""){
           
				alert("Ingresa el a�o de tu nacimiento");
          		document.registrarPersona.anio.focus();
    		   
		    return false;
         }
		 
		 if (document.registrarPersona.celular.value == ""){
           
				alert("Ingresa tu celular");
          		document.registrarPersona.celular.focus();
    		   
		    return false;
         }
		 		 

         return true;
       }
       
       
       function validarLocal(){
           
  		 
  		 
 		  if (document.registrarLocal.desLoc.value == ""){
            
 				alert("Ingresa la descripci�n del local");
           		document.registrarLocal.desLoc.focus();
     		   
 		    return false;
          }	

 		  if (document.registrarLocal.direccion.value == ""){
            
 				alert("Ingresa la direcci�n del local");
           		document.registrarLocal.direccion.focus();
     		   
 		    return false;
          }
 		 
 		 if (document.registrarLocal.distrito.value == ""){
            
 				alert("Ingresa el distrito del local");
           		document.registrarLocal.distrito.focus();
     		   
 		    return false;
          }
 		 if (document.registrarLocal.dicGoogle.value == ""){
            
 				alert("Ingresa la direcci�n de Google Maps");
           		document.registrarLocal.dicGoogle.focus();
     		   
 		    return false;
          }
 		 
 		 if (document.registrarLocal.telefonoFijo.value == ""){
            
 				alert("Ingresa el telefono fijo del local");
           		document.registrarLocal.telefonoFijo.focus();
     		   
 		    return false;
          }		
 		 		 

          return true;
        }
    
       
       
       function validarServiciosAdicionales(){
           
    		 
    		 
  		  if (document.registrarServiciosAdicionales.tipo.value == ""){
             
  				alert("Ingresa el tipo de servicio adicional");
            		document.registrarServiciosAdicionales.tipo.focus();
      		   
  		    return false;
           }	

  		  if (document.registrarServiciosAdicionales.descripcion.value == ""){
             
  				alert("Ingresa la descripcion del servicio");
            		document.registrarServiciosAdicionales.descripcion.focus();
      		   
  		    return false;
           }
  		 
  		 if (document.registrarServiciosAdicionales.tarifa.value == ""){
             
  				alert("Ingresa la tarifa del servicio adicional");
            		document.registrarServiciosAdicionales.tarifa.focus();
      		   
  		    return false;
           }
  		 if (document.registrarServiciosAdicionales.local.value == ""){
             
  				alert("Ingresa el nombre del local");
            		document.registrarServiciosAdicionales.local.focus();
      		   
  		    return false;
           }

           return true;
         }