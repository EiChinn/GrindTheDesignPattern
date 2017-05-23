package com.eichinn.command.extension.macro;

/**
 * Created by ei_chinn on 2017/5/23.
 */
public class CoolCook implements CookApi {
    @Override
    public void cook(String name) {
        System.out.println("CoolCook: " + name);
    }
}
