package spring4.scanning;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
    @Override
    public void play() {
        System.out.println("SgtPeppers");
    }
}
