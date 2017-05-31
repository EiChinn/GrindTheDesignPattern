package com.eichinn.command.extension.queue;

/**
 * Created by ei_chinn on 2017/5/31.
 */
public class HotCook implements CookApi, Runnable{
    private String cookerName;

    public HotCook(String cookerName) {
        this.cookerName = cookerName;
    }

    @Override
    public void cook(int tableNum, String name) {
        int cookTime = (int) (20 * Math.random());
        System.out.println("Cooker " + cookerName + "is cooking " + name + "for table " + tableNum);
        try {
            Thread.sleep(cookTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "for table " + tableNum + "has finished in " + cookTime);


    }

    @Override
    public void run() {
        while (true) {
            Command command = CommandQueue.getOneCommand();
            if (command != null) {
                command.setCookApi(this);
                command.execute();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
