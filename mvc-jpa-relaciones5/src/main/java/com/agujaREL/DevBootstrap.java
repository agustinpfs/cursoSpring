//usamos propiedad bootstrap de springboot.
//cuando springboot se termina de levantar y se crea el contexto del server, 
//se llama a un evento, evento el cual podemos ejecutar o hacer algo que qeramos,
//crearemos 3 roles
package com.agujaREL;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.agujaREL.entity.Rol;
import com.agujaREL.repository.RolRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	RolRepository repo;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		repo.save(new Rol("Administrador"));
		repo.save(new Rol("Contable"));
		repo.save(new Rol("Regular"));
		
//		OR:
		
//		List<Rol> roles = new arrayList<Rol>();
//		roles.add(new Rol("Administrador"));
//		roles.add(new Rol("Contable"));
//		roles.add(new Rol("Regular"));
//		roleRepositorio.saveAll(roles)
		
	}

}
