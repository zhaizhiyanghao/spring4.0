package spring4.di;

/**
 * @author zhaizhiyang
 * @date 2018/8/3
 **/
public class DemselRescuingKnight implements Knight {

    private Quest quest;

    public DemselRescuingKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }


}
