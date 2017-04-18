package com.eichinn.mediator.practical;

/**
 * Created by ei_chinn on 2017/4/13.
 */
public class CPU extends Colleague {
    public CPU(Mediator mediator) {
        super(mediator);
    }

    /**
     * 分解出来的视频数据
     */
    private String videoData = "";

    /**
     * 分解出来的声音数据
     */
    private String soundData = "";

    public String getVideoData() {
        return videoData;
    }

    public String getSoundData() {
        return soundData;
    }

    /**
     * 处理数据，把数据分成音频和视频数据
     * @param data
     */
    public void executeData(String data) {
        //把数据分解开，前面的是视频数据，后面的是音频数据
        String[] ss = data.split("，");
        if (ss.length == 2) {
            this.videoData = ss[0];
            this.soundData = ss[1];
            //通知主板，cpu的工作完成
            this.getMediator().changed(this);
        } else {
            throw new IllegalStateException("invalid data");
        }

    }
}
