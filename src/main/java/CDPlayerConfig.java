import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import soundsystem.CompactDisc;

@Configuration
@ComponentScan(basePackageClasses ={CompactDisc.class, DVDPlayer.class})
public class CDPlayerConfig {
}
