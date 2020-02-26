//pojo - entity
package com.agujaREL.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
//import javax.persistence.Transient;
//import javax.persistence.Table;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
//@Table(name="tbl_usuario") //si no pongo esto usa Usuario
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) //autoincremental
	private Long id; //primary key
	private String nombreUsuario;
	private String nombreCompleto;
	private String fechaNacimiento;
	
//	Establecemos relación:
//	Los roles pueden ser muchos (<Set>):
	
	@ManyToMany
	@JoinTable(name="usuario_roles" //unidos por una tabla de transacción
		,joinColumns=@JoinColumn(name="usuario_id") //se une con la columna "usuario_id"
		,inverseJoinColumns=@JoinColumn(name="role_id")
	)
	private Set<Rol> roles;
	
	
	
	@JoinColumn(name="configuracion_id",unique=true) //columna con la que me quiero asociar.(la FK me la guarde en la 
													// columna "configuracion_id"). "unique" -> una relación!
	@OneToOne(cascade=CascadeType.ALL)// todas las T que haga sobre mi entity usuario se aplique también a 
									  //configuración. si a usuario le hago un update, create, delete => que actualice, cree,
									  //delete la configuración
	private Configuracion configuracion;
	
	
	public Usuario() {
		configuracion = new Configuracion();
	}


	public Usuario(Long id, String nombreUsuario, String nombreCompleto, String fechaNacimiento, Set<Rol> roles,
			Configuracion configuracion) {
		super();
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.nombreCompleto = nombreCompleto;
		this.fechaNacimiento = fechaNacimiento;
		this.roles = roles;
		this.configuracion = configuracion;
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


	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public Set<Rol> getRoles() {
		return roles;
	}


	public void setRoles(Set<Rol> roles) {
		this.roles = roles;
	}


	public Configuracion getConfiguracion() {
		return configuracion;
	}


	public void setConfiguracion(Configuracion configuracion) {
		this.configuracion = configuracion;
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
		return "Usuario [id=" + id + ", nombreUsuario=" + nombreUsuario + ", nombreCompleto=" + nombreCompleto
				+ ", fechaNacimiento=" + fechaNacimiento + ", roles=" + roles + ", configuracion=" + configuracion
				+ "]";
	}
	
	
	
	
	
	

	
}
