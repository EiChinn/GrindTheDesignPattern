package com.eichinn.mediator.practical;

/**
 * Created by ei_chinn on 2017/4/13.
 */
public class Client {
    public static void main(String[] args) {
        MethodBoard methodBoard = new MethodBoard();

        CDDriver cdDriver = new CDDriver(methodBoard);
        CPU cpu = new CPU(methodBoard);
        VideoCard videoCard = new VideoCard(methodBoard);
        SoundCard soundCard = new SoundCard(methodBoard);

        methodBoard.setCdDriver(cdDriver);
        methodBoard.setCpu(cpu);
        methodBoard.setVideoCard(videoCard);
        methodBoard.setSoundCard(soundCard);

        cdDriver.readCD();
    }
}
