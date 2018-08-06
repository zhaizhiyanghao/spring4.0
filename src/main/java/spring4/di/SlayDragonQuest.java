package spring4.di;

import java.io.PrintStream;

/**
 * @author zhaizhiyang
 * @date 2018/8/3
 **/
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    private SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("SlayDragonQuest.embark");
    }
}
