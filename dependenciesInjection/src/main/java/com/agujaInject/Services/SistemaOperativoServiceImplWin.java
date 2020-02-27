package com.agujaInject.Services;

import org.springframework.stereotype.Service;

@Service
public class SistemaOperativoServiceImplWin implements SistemaOperativoService{

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return "Windows";
	}

	@Override
	public String getExtensionArchivos() {
		// TODO Auto-generated method stub
		return ".exe";
	}

	@Override
	public String getLibrerias() {
		// TODO Auto-generated method stub
		return ".dll";
	}
	
	
}
