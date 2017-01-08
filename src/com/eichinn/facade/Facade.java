package com.eichinn.facade;

/**
 * Created by ei_chinn on 2017/1/8.
 */
public class Facade {
    public void generate() {
        new Presentation().generate();
        new Business().generate();
        new DAO().generate();
    }
}
