package com.eichinn.mediator.practical;

/**
 * Created by ei_chinn on 2017/4/13.
 */
public class SoundCard extends Colleague {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 按照声频数据发出声音
     * @param data
     */
    public void soundData(String data) {
        System.out.println("画外音：" + data);
    }
}
