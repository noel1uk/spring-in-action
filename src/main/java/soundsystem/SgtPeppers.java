package soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {

    public String title = "sgt. Peppers lonely Hearts club band";
    private String artist = "The Beatles";

    public void play()  {
        System.out.println("Playing " + title + " by " + artist);
    }
}
