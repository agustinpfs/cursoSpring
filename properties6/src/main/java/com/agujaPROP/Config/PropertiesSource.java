package com.agujaPROP.Config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
//@PropertySource({"classpath:miarchivo.properties","classpath:segundo.properties"})
//@PropertySource("classpath:miarchivo.properties")

//le indicamos los archivos de properties para que busque. classpath es la raíz del resources
@PropertySources({
	@PropertySource("classpath:miarchivo.properties"),
	@PropertySource("classpath:segundo.properties")
})
public class PropertiesSource {

}
