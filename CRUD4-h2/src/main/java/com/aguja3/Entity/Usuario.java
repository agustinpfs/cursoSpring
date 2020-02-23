//pojo - entity
package com.aguja3.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Transient;
//import javax.persistence.Table;

@Entity
//@Table(name="tbl_usuario") //si no pongo esto usa Usuario
public class Usuario {
	
	@Id
	//@Column(name="usuario_id") mismo comportamiento
	@GeneratedValue(strategy=GenerationType.AUTO) //autoincremental
	private Long id; //primary key
	private String nombreUsuario;
	private String nombreCompleto;
	
	//private boolean ambosNombres;
	
	//@Transient  //no mapea el atributo "ambosNombres" con la BD
	//public boolean isAmbosNombres() {
	//	return !nombreCompleto.isEmpty() && !nombreUsuario.isEmpty();
	//}
	
	public Usuario() {}

	public Usuario(Long id, String nombreUsuario, String nombreCompleto) {
		super();
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.nombreCompleto = nombreCompleto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		//me da este string y evito que me de una referencia de memoria
		return "Usuario [id=" + id + ", nombreUsuario=" + nombreUsuario + ", nombreCompleto=" + nombreCompleto + "]";
	}
	
	
	
	


}
