package soundsystem;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
// Make a Spring application context
@ContextConfiguration(classes= CDPlayerConfig.class)
// Tell the application context to load its configuration from the CDPlayerConfig class
public class CDPlayerTest {

    @Rule
    public final StandardOutputStreamLog log =
            new StandardOutputStreamLog();

    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }

    @Test
    public void play() {
        player.play();
        assertEquals(
                "Playing sgt. Peppers lonely Hearts club band" +
                        " by The Beatles\n",
                log.getLog());
    }
}
