
       function validarRegistro(){
        
		 
		 
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
		 if (document.f1.anio.value == ""){
           
				alert("Ingresa el año de tu nacimiento");
          		document.f1.anio.focus();
    		   
		    return false;
         }
		 
		 if (document.f1.celular.value == ""){
           
				alert("Ingresa tu celular");
          		document.f1.celular.focus();
    		   
		    return false;
         }
		 		 

         return true;
       }
       
       
       function validarLocal(){
           
  		 
  		 
 		  if (document.registrarLocal.desLoc.value == ""){
            
 				alert("Ingresa la descripción del local");
           		document.registrarLocal.desLoc.focus();
     		   
 		    return false;
          }	

 		  if (document.registrarLocal.direccion.value == ""){
            
 				alert("Ingresa la dirección del local");
           		document.registrarLocal.direccion.focus();
     		   
 		    return false;
          }
 		 
 		 if (document.registrarLocal.distrito.value == ""){
            
 				alert("Ingresa el distrito del local");
           		document.registrarLocal.distrito.focus();
     		   
 		    return false;
          }
 		 if (document.registrarLocal.dicGoogle.value == ""){
            
 				alert("Ingresa la dirección de Google Maps");
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