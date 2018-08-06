package spring4.scanning;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhaizhiyang
 * @date 2018/8/6
 **/
@Configuration
@ComponentScan
public class SgtPeppers implements CompactDisc {
    @Override
    public void play() {
        System.out.println("SgtPeppers is play");
    }
}
