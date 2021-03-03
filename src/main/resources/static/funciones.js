function eliminar(id) {	
	swal({
		  title: "Esta Seguro de Eliminar",
		  text: "Una Vez Eliminado no se podra recuperar al cliente",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				  url:"/eliminar/"+id,
				  success: function(res){
					  console.log(res);
				  }
			  })
		    swal("Exitosamente Eliminado!", {
		      icon: "success",
		    }).then((ok)=>{
		    if(ok){
		    	location.href="listar";
		    }	
		    });
		  } else {
		    swal("Eliminacion cancelada!");
		  }
		});
}