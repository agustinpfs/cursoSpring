package com.agujaProfilesOS.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("Linux")
public class SistemaOperativoLinux implements SistemaOperativoService{

	@Override
	public String getSistemaOperativoName() {
		// TODO Auto-generated method stub
		return "Linux";
	}

}
