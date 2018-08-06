package spring4.scanning;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zhaizhiyang
 * @date 2018/8/6
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ScanningConfig.class)
public class ScanningTest {

    @Autowired
    private SgtPeppers sgtPeppers;

    @Test
    public void cdPlaySgt() {
        sgtPeppers.play();
        assertNotNull(sgtPeppers);
    }
}
