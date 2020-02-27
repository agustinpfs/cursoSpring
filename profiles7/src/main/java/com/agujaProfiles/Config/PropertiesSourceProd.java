package com.agujaProfiles.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({"classpath:prod.properties"})
@Profile("default")
public class PropertiesSourceProd {

}
