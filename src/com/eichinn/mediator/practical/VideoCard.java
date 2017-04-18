package com.eichinn.mediator.practical;

/**
 * Created by ei_chinn on 2017/4/13.
 */
public class VideoCard extends Colleague {
    public VideoCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 显示视频数据
     * @param data
     */
    public void showData(String data) {
        System.out.println("您正观看的是：" + data);
    }
}
