package com.eichinn.flyweight.practical;

/**
 * Created by ei_chinn on 2017/6/1.
 */
public class CacheConfModel {
    private long beginTime;
    private double durableTime;
    private boolean forever;

    public long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(long beginTime) {
        this.beginTime = beginTime;
    }

    public double getDurableTime() {
        return durableTime;
    }

    public void setDurableTime(double durableTime) {
        this.durableTime = durableTime;
    }

    public boolean isForever() {
        return forever;
    }

    public void setForever(boolean forever) {
        this.forever = forever;
    }
}
