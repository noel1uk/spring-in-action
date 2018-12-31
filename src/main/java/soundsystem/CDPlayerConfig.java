package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import soundsystem.CompactDisc;

@Configuration
// this tells spring the class has @Bean definition methods so Spring container can
// process the class and generate Beans to be used in the application
// It indicates that a class declares one or more @Bean methods and may be processed by
// the Spring container to generate bean definitions and services at runtime
//@ComponentScan(basePackageClasses ={CompactDisc.class})
// @ComponentScan configures component scanning directives for use with @Configuration
// classes.
// Either basePackageClasses() or basePackages() or its alias value() may be specified
// to define specific packages to scan. If specific packages are not defined scanning will
// occur from the package of the class that declares this annotation
public class CDPlayerConfig {

    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(sgtPeppers());
    }
}

