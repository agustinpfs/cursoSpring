package com.agujaInject.Services;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Primary
public class SistemaOperativoServiceImplMac implements SistemaOperativoService{

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return "MacOS";
	}

	@Override
	public String getExtensionArchivos() {
		// TODO Auto-generated method stub
		return ".app";
	}

	@Override
	public String getLibrerias() {
		// TODO Auto-generated method stub
		return ".elf";
	}
	
	
}
