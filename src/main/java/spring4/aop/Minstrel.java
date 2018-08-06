package spring4.aop;

import java.io.PrintStream;

/**
 * @author zhaizhiyang
 * @date 2018/8/3
 **/
public class Minstrel {

    private PrintStream print;

    public Minstrel(PrintStream printStream) {
        this.print = printStream;
    }

    public void beforeQuest() {
        print.println("Fa la la ,before!");
    }

    public void afterQuest() {
        print.println("Fa la la ,after!");
    }

}
