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
	}

}
