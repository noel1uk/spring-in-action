package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
// Indicates that an annotated class is a component. Such classes are considered as
// candidates for auto-detection when using annotation-based configuration and classpath
// scanning.
// Other class-level annotations may be considered as identifying a component as well,
// typically a special kind of component, e.g the @Repository annotation
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
//    @Autowired is used for automatic dependency injection. Marks a constructor, field,
//    setter method or config method as to be autowired by Springs dependency injection
//    facilities
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
