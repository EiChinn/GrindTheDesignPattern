package com.eichinn.mediator.practical;

/**
 * Created by ei_chinn on 2017/4/13.
 */
public class MethodBoard implements Mediator {
    private CDDriver cdDriver;
    private CPU cpu;
    private VideoCard videoCard;
    private SoundCard soundCard;


    @Override
    public void changed(Colleague colleague) {

        if (colleague instanceof CDDriver) {
            openCDDriverReadData((CDDriver) colleague);
        } else if (colleague instanceof CPU){
            openCPU((CPU) colleague);
        }

    }

    /**
     * 处理光驱读取数据以后与其他对象的交互
     * @param cdDriver
     */
    private void openCDDriverReadData(CDDriver cdDriver) {
        String data = cdDriver.getData();
        this.cpu.executeData(data);
    }

    private void openCPU(CPU cpu) {
        String videoData = cpu.getVideoData();
        String soundData = cpu.getSoundData();

        this.videoCard.showData(videoData);
        this.soundCard.soundData(soundData);
    }

    public void setCdDriver(CDDriver cdDriver) {
        this.cdDriver = cdDriver;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }
}
