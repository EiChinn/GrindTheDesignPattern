package com.eichinn.composite.extension;

/**
 * Created by ei_chinn on 2017/5/31.
 */
public class Leaf extends Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    void printStruct(String preStr) {
        System.out.println(preStr + "-" + name);
    }
}
